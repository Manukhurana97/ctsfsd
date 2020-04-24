package com.example.ecommerce_products.Controller;

import com.example.ecommerce_products.Dao.productdao;
import com.example.ecommerce_products.Model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/admin")
public class AdminController {

    private Path path;

    @Autowired
    productdao dao;

    @RequestMapping
    public String admin_page()
    {
        return "admin";
    }

    @GetMapping("/productInventory")
    public String Invertory(Model model)
    {
        List<Product> list = dao.findAll();
        model.addAttribute("products", list);
        return "admin_inventory";
    }

    @GetMapping("/addProduct")
    public String add_product(Model model)
    {
        Product product = new Product();
        product.setUnitInStock(10);
        model.addAttribute("product", product);
        return "AddProduct";
    }


    @PostMapping("/addProduct")
    public String add_product(@Valid Product product, BindingResult result, HttpServletRequest request) {
        if (result.hasErrors()) {
            return "AddProduct";
        }
        dao.save(product);

        MultipartFile productImage = product.getProductImage();
        String rootDirectory = request.getSession().getServletContext().getRealPath("/");
        path = Paths.get(rootDirectory + "\\WEB-INF\\images\\" + product.getProductId() + ".png");

        if (productImage != null && !productImage.isEmpty()) {
            try {
                productImage.transferTo(new File(path.toString()));
            } catch (Exception e) {
                e.printStackTrace();
                throw new RuntimeException(e);
            }
        }
        return "redirect:/admin/productInventory";
    }

    @GetMapping("/Product/editProduct/{productId}")
    public String edit_product_details(@PathVariable(value = "productId") int id, Model model)
    {
        Optional<Product> product = dao.findById(id);
        model.addAttribute("product", product);
        return "Edit_product";
    }

    @PostMapping("/Product/editProduct")
    public String Edit_product(@Valid @ModelAttribute("product") Product product, BindingResult result, HttpServletRequest request) {
        if (result.hasErrors()) {
            return "AddProduct";
        }
        dao.save(product);

        MultipartFile productImage = product.getProductImage();
        String rootDirectory = request.getSession().getServletContext().getRealPath("/");
        path = Paths.get(rootDirectory + "\\WEB-INF\\images\\" + product.getProductId() + ".png");

        if (productImage != null && !productImage.isEmpty()) {
            try {
                productImage.transferTo(new File(path.toString()));
            } catch (Exception e) {
                e.printStackTrace();
                throw new RuntimeException(e);
            }
        }
        return "redirect:/admin/productInventory";
    }


    @RequestMapping("/Product/DeleteProduct/{product_id}")
    public String delete_product(@PathVariable(value = "product_id") int id, Model model, HttpServletRequest request)
    {
        String rootDirectory = request.getSession().getServletContext().getRealPath("/");
        path = Paths.get(rootDirectory + "\\WEB-INF\\images\\" + id + ".png");

        if (Files.exists(path)) {
            try {

                Files.delete(path);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        dao.deleteById(id);
        return "redirect:/admin/productInventory";
    }


}
