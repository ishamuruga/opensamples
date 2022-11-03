package com.apstore.api.pos.apstoreposapi.vo;

import java.util.List;

import com.apstore.api.pos.apstoreposapi.model.Category;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FetchCategoryRes {
    private List<Category> categories;
}
