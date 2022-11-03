package com.apstore.api.pos.apstoreposapi.service;

import java.util.List;

import com.apstore.api.pos.apstoreposapi.model.Category;

public interface CategoryManager {
    public List<Category> fetchAll();

    public void save(Category cate);
}
