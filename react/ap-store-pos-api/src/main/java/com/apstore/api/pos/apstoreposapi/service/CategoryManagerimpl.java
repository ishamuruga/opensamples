package com.apstore.api.pos.apstoreposapi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.apstore.api.pos.apstoreposapi.model.Category;
import com.apstore.api.pos.apstoreposapi.repo.CategoryRepo;

@Service
public class CategoryManagerimpl implements CategoryManager {

    @Autowired
    private CategoryRepo repo;

    @Override
    public List<Category> fetchAll() {
        return repo.findAll();
    }

    @Override
    public void save(Category cate) {
        repo.save(cate);
    }
    
}
