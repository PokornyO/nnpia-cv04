package com.example.nnpiacv02.controller;

import com.example.nnpiacv02.entity.AppUser;
import com.example.nnpiacv02.model.Product;
import com.example.nnpiacv02.repository.AppUserRepository;
import com.example.nnpiacv02.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class ProductsController {

    private final ProductService productService;


    public ProductsController(ProductService productService, AppUserRepository repository) {
        this.productService = productService;
    }
    @GetMapping("/products")
    public List<Product> getAllProducts() {
        return productService.getAllProducts();
    }

}
