package com.ecommerce.productservicenovember2024.services;

import com.ecommerce.productservicenovember2024.models.Product;

import java.util.List;

public interface ProductService {
    Product getSingleProduct(Long productId);

    Product getSingleProduct(long productId);


    List<Product> getAllProduct();

    List<Product> getAllProducts();
}
