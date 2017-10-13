package com.arun.aws.learning.config;

import com.arun.aws.learning.domain.Product;
import com.arun.aws.learning.repository.ProductRepository;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.List;

/**
 * Created by M&S Food on 10/11/2017.
 */


@Component
public class Bootstrap implements ApplicationListener<ContextRefreshedEvent> {

    private ProductRepository productRepository;


    private Logger log = Logger.getLogger(Bootstrap.class);

    @Autowired
    public void setProductRepository(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        loadProducts();
    }

    private void loadProducts() {
        Product shirt = new Product();
        shirt.setDescription("Shirt");
        shirt.setPrice(new BigDecimal("18.95"));
        shirt.setImageUrl("SHIRT_IMAGE_URL");
        shirt.setProductId("235268845711068308");
        productRepository.save(shirt);

        log.info("Saved Shirt - id: " + shirt.getId());

        Product mug = new Product();
        mug.setDescription("Mug");
        mug.setImageUrl("MUG_IMAGE_URL");
        mug.setProductId("168639393495335947");
        mug.setPrice(new BigDecimal("11.95"));
        productRepository.save(mug);

        log.info("Saved Mug - id:" + mug.getId());
    }


}
