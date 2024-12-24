package com.ecommerce.productservicenovember2024.services;

import com.ecommerce.productservicenovember2024.dtos.FackStoreProductDtos;
import com.ecommerce.productservicenovember2024.models.Category;
import com.ecommerce.productservicenovember2024.models.Product;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;
@Service
public class FakeStoreProductService implements ProductService {

RestTemplate restTemplate;
    public FakeStoreProductService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }
    @Override
    public Product getSingleProduct(Long productId) {
      FackStoreProductDtos fackStoreProductDtos =
              restTemplate.getForObject("https://fakestoreapi.com/products/" + productId,
                      FackStoreProductDtos.class);
//      Convert FakeStoreProductDto in my product
        assert fackStoreProductDtos != null;
        return convertFakeStoreProductDtoToProduct(fackStoreProductDtos);

    }


    @Override
    public Product getSingleProduct(long productId) {
        return null;
    }

    @Override
    public List<Product> getAllProduct() {
        FackStoreProductDtos[] fackStoreProductDto = restTemplate.getForObject("https://fakestoreapi.com/products", FackStoreProductDtos[].class);
        List<Product> products = new ArrayList<>();
        assert fackStoreProductDto != null;
        for (FackStoreProductDtos fackStoreProductDtos : fackStoreProductDto) {
            products.add(convertFakeStoreProductDtoToProduct(fackStoreProductDtos));
        }
        return products;
    }

    @Override
    public List<Product> getAllProducts() {
        return List.of();
    }

    private Product convertFakeStoreProductDtoToProduct(FackStoreProductDtos fackStoreProductDtos) {
        Product product = new Product();
        product.setId(fackStoreProductDtos.getId());


        product.setCategory( new Category(fackStoreProductDtos.getCategory(),
                fackStoreProductDtos.getDescription()));
        product.setTitle(fackStoreProductDtos.getTitle());
        product.setPrice(fackStoreProductDtos.getPrice());
        return product;
    }

 /*   https://fakestoreapi.com/products/1
    {
        id:1,
        title:'...',
        price:'...',
        category:'...',
        description:'...',
        image:'...'
    }

  */
}
