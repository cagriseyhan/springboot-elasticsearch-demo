package com.cagriseyhan.elasticsearchdemo.springelastichsearch.service;


import com.cagriseyhan.elasticsearchdemo.springelastichsearch.repository.ProductRepository;
import com.cagriseyhan.elasticsearchdemo.springelastichsearch.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;

@Service
public class ProductsService {
    private final ProductRepository productRepository;

    @Autowired
    public ProductsService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public Iterable<Product> findAll() {
        return productRepository.findAll();
    }

    public Product save(Product product){
        return productRepository.save(product);
    }

    public void deleteById(int id) {
        productRepository.deleteById(id);
    }

    public Iterable<Product> update(Product product) throws Exception {
        if (product.getId()!=0) {
            return Collections.singleton(productRepository.save(product));
        }
        throw new Exception("Id is required");
    }
}
