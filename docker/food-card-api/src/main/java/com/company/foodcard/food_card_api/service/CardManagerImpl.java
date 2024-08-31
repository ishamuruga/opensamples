package com.company.foodcard.food_card_api.service;

import java.util.Calendar;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.company.foodcard.food_card_api.entiry.Card;
import com.company.foodcard.food_card_api.repo.CardsRepo;

@Service
public class CardManagerImpl implements CardManager{

    @Autowired
    private CardsRepo repo;

    @Override
    public List<Card> fetchAll() {
        return repo.findAll();
    }

    @Override
    public Card save(Card card) {
        repo.save(card);

        return card;
    }

    @Override
    public Card fetchById(Integer id) {
        return repo.findById(id).orElse(getFallBackCard());
    }
    
    private Card getFallBackCard(){
        Card c = new Card();
        c.setCard("0000 0000 0000 0000");
        c.setDob(Calendar.getInstance());

        return c;
    }
}
