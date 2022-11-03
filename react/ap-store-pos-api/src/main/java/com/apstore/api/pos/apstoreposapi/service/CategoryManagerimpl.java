package com.apstore.api.pos.apstoreposapi.service;

import java.util.List;

import com.apstore.api.pos.apstoreposapi.model.Category;
import com.apstore.api.pos.apstoreposapi.repo.CategoryRepo;

public class CategoryManagerimpl implements CategoryManager {

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
