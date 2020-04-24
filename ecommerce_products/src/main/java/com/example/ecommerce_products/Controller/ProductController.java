package com.example.ecommerce_products.Controller;

import com.example.ecommerce_products.Dao.productdao;
import com.example.ecommerce_products.Model.Product;
import com.sun.net.httpserver.HttpServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.stereotype.Controller;
import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/Product")
public class ProductController {

    @Autowired
    productdao dao;


    @RequestMapping("")
    public String get_all(Model model) {
        List<Product> list = dao.findAll();
        model.addAttribute("products", list);
        return "Products";
    }

    @RequestMapping("/{Product_id}")
    public String get_by_id(@PathVariable(value = "Product_id") int id, Model model) {

        Optional<Product> list = dao.findById(id);
        if(list.isPresent())
            model.addAttribute("product", list);
        return "Product_Details";
    }





}
