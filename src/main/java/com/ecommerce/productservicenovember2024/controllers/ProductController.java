package com.ecommerce.productservicenovember2024.controllers;

import com.ecommerce.productservicenovember2024.models.Product;
import com.ecommerce.productservicenovember2024.services.FakeStoreProductService;
import com.ecommerce.productservicenovember2024.services.ProductService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {

    ProductService ProductService;

    public ProductController(ProductService ProductService) {
        this.ProductService = ProductService;
    }
//    Host get API
//    Get all product
//    Get product by id
    @GetMapping("/{id}")
    public Product getProductId(@PathVariable("id") Long  id){
        return  ProductService.getSingleProduct(id);
    }
    @GetMapping()
    public List<Product> getAllProduct(){
        return ProductService.getAllProduct();
    }

    
}
/*
* Product Service
*
* 1. Create Product
* 2. Get Product
* 3. Update Product
* 4. Delete Product
*
*   MYSQL DB for this
*
* Client --> Product Service --> Database (Product: id, name, quantity, price)
*
*I use FakeStore API to code  our Product Service
*
* Implement Product Service which use a 3rd party api behind the scenes
* Client --> Product Service --> FakeStore API (Product: id, name, quantity, price)
*          (Proxy server here)
*
* How  we call third party API's  from our product service.
* */