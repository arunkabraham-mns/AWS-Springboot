package com.arun.aws.learning.repository;

import com.arun.aws.learning.domain.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * Created by M&S Food on 10/11/2017.
 */
@RepositoryRestResource
public interface ProductRepository extends CrudRepository<Product, Integer> {
}