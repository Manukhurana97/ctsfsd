package com.example.ecommerce_products.Controller;

import com.example.ecommerce_products.Dao.CustomerDao;
import com.example.ecommerce_products.Model.Customer;
import com.example.ecommerce_products.Model.ShippingAddress;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@Controller
public class RegisterController {

    private CustomerDao dao;

    @RequestMapping("/Register")
    public String registerCustomer(Model model) {
        Customer customer = new Customer();
        ShippingAddress shippingAddress = new ShippingAddress();
        customer.setShippingAddress(shippingAddress);

        model.addAttribute("customer", customer);
        return "registerCustomer";
    }

    @PostMapping(value = "/register")
    public String RegisterCustomer(@Valid @ModelAttribute("customer") Customer customer, BindingResult result, Model model) {
        if (result.hasErrors()) {
            return "registerCustomer";
        }
//        List<Customer> list = dao.findAll();
//
//        for (Customer value : list) {
//            if (customer.getCustomerEmail().equals(value.getCustomerEmail())) {
//                model.addAttribute("message", "Email id already exist");
//                return "registerCustomer";
//            }
//
//            if (customer.getUsername().equals(value.getUsername())) {
//                model.addAttribute("usernameMsg", "Username ready exist");
//                return "registerCustomer";
//            }
//        }


        customer.setEnabled(true);
        dao.save(customer);
        return "Products";
    }
}
