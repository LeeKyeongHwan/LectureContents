package com.example.productList.service;

import com.example.productList.entity.Product;
import com.example.productList.repository.ProductListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductListServiceImpl implements ProductListService{
    @Autowired
    private ProductListRepository repository;

    @Override
    public void register(Product product) throws Exception {
        repository.create(product);
    }

    @Override
    public List<Product> list() throws Exception {
        return repository.list();
    }
}
