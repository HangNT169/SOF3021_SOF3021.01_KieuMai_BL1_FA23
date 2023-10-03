package com.poly.hangnt169.sof3021.B10_JPA.service.impl;

import com.poly.hangnt169.sof3021.B10_JPA.entity.Category;
import com.poly.hangnt169.sof3021.B10_JPA.repository.CategoryRepository;
import com.poly.hangnt169.sof3021.B10_JPA.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    @Override
    public List<Category> getAll() {
        return categoryRepository.findAll();
        // Getall
        //categoryRepository.findAll();// Lay toan bo du lieu cua table
        // Add/Update : save
        //categoryRepository.save(Doi tuong can add)
        // Delete:
        // C1: Xoa theo id
        //categoryRepository.deleteById(Khoa chinh);
        // C2: Xoa ca Object
        //categoryRepository.delete(Doi tuong can xoa);
        // Get one
        //C1: categoryRepository.getOne(Khoa chinh)
        //C2: categoryRepository.findById(Khoa chinh).get()
        //...
    }

    @Override
    public void add(Category category) {
        categoryRepository.save(category);
    }
}
