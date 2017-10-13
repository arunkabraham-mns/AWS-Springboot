package com.arun.aws.learning.service;

import com.arun.aws.learning.domain.Product;
import com.arun.aws.learning.repository.ProductRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by M&S Food on 10/11/2017.
 */


@Service
public class ProductServiceImpl implements ProductService {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());
    private ProductRepository productRepository;

    @Autowired
    public void setProductRepository(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public Iterable<Product> listAllProducts() {
        logger.debug("listAllProducts called");
        return productRepository.findAll();
    }

    @Override
    public Product getProductById(Integer id) {
        logger.debug("getProductById called");
        return productRepository.findOne(id);
    }

    @Override
    public Product saveProduct(Product product) {
        logger.debug("saveProduct called");
        return productRepository.save(product);
    }

    @Override
    public void deleteProduct(Integer id) {
        logger.debug("deleteProduct called");
        productRepository.delete(id);
    }
}
