package com.apstore.api.pos.apstoreposapi.vo;

import java.util.List;

import com.apstore.api.pos.apstoreposapi.model.Category;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class FetchCategoryRes {
    private List<Category> categories;
}
