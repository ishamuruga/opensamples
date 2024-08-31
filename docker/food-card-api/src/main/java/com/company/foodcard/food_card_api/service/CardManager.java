package com.company.foodcard.food_card_api.service;

import java.util.List;

import com.company.foodcard.food_card_api.entiry.Card;

public interface CardManager {
    public List<Card> fetchAll();

    public Card save(Card card);

    public Card fetchById(Integer id);
}
