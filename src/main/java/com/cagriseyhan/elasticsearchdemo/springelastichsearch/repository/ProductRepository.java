package com.cagriseyhan.elasticsearchdemo.springelastichsearch.repository;

import com.cagriseyhan.elasticsearchdemo.springelastichsearch.model.Product;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface ProductRepository extends ElasticsearchRepository<Product,Integer> {
}
