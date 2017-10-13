package com.arun.aws.learning.service;

import com.arun.aws.learning.domain.Product;

/**
 * Created by M&S Food on 10/11/2017.
 */
public interface ProductService {
    Iterable<Product> listAllProducts();

    Product getProductById(Integer id);

    Product saveProduct(Product product);

    void deleteProduct(Integer id);
}
