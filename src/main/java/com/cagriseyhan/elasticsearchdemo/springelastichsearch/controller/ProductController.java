package com.cagriseyhan.elasticsearchdemo.springelastichsearch.controller;


import com.cagriseyhan.elasticsearchdemo.springelastichsearch.service.ProductsService;
import com.cagriseyhan.elasticsearchdemo.springelastichsearch.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/products")
@RestController
public class ProductController {

    @Autowired
    private ProductsService productsService;

    @GetMapping("/getAll")
    public Iterable<Product> findAll() {
        return productsService.findAll();
    }

    @PostMapping("/create")
    public Product save(@RequestBody Product product) {
        return productsService.save(product);

    }

    @PutMapping("/update")
    public Iterable<Product> update(@RequestBody Product product) throws Exception {
        return productsService.update(product);
    }

    @GetMapping("{id}")
    public ResponseEntity<String> delete(@PathVariable("id") int id) {
        productsService.deleteById(id);
        return ResponseEntity.ok("Deleted");
    }
}
