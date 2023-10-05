package com.poly.hangnt169.sof3021.B10_JPA.service.impl;

import com.poly.hangnt169.sof3021.B10_JPA.entity.Product;
import com.poly.hangnt169.sof3021.B10_JPA.repository.ProductRepository;
import com.poly.hangnt169.sof3021.B10_JPA.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository repository;

    @Override
    public List<Product> getAll() {
        return repository.findAll();
    }
}
