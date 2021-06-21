package com.example.firstproject.service;

import com.example.firstproject.entity.Product;

import java.util.List;


public interface ProductService {
    public void register(Product product) ;

    public List<Product> list() throws Exception;


}
