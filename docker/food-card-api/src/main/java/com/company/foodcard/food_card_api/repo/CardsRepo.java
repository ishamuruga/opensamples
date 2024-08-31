package com.company.foodcard.food_card_api.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.company.foodcard.food_card_api.entiry.Card;

public interface CardsRepo extends JpaRepository<Card,Integer> {
    
}
