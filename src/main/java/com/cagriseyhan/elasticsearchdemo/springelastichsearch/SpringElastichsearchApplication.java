package com.cagriseyhan.elasticsearchdemo.springelastichsearch;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.elasticsearch.repository.config.EnableElasticsearchRepositories;

@SpringBootApplication
@EnableElasticsearchRepositories
public class SpringElastichsearchApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringElastichsearchApplication.class, args);
    }

}
