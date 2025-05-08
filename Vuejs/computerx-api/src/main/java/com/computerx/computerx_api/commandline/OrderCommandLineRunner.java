package com.computerx.computerx_api.commandline;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.computerx.computerx_api.entity.Item;
import com.computerx.computerx_api.entity.XOrder;
import com.computerx.computerx_api.repo.XOrderRepo;

@Component
public class OrderCommandLineRunner implements CommandLineRunner {

    @Autowired
    private XOrderRepo oRepo;

    @Override
    public void run(String... args) throws Exception {

        if (!oRepo.findAll().isEmpty()) {
            return;
        }

        List<Item> items = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            Item item = new Item();
            item.setCost((long) ((i + 1) * 10));
            item.setName("Item" + i);
            items.add(item);
        }

        XOrder order1 = new XOrder();
        order1.setOrderName("Electronics");
        order1.setTs(LocalDateTime.now());
        order1.setItems(items);

        List<Item> items2 = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            Item item2 = new Item();
            item2.setCost((long) ((i + 1) * 10));
            item2.setName("Item2" + i);
            items2.add(item2);
        }

        XOrder order2 = new XOrder();
        order2.setOrderName("Grocerry");
        order2.setTs(LocalDateTime.now());
        order2.setItems(items2);

        List<Item> items3 = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            Item item3 = new Item();
            item3.setCost((long) ((i + 1) * 10));
            item3.setName("Item3" + i);
            items3.add(item3);
        }

        XOrder order3 = new XOrder();
        order3.setOrderName("Fruits");
        order3.setTs(LocalDateTime.now());
        order3.setItems(items3);

        oRepo.save(order1);
        oRepo.save(order2);
        oRepo.save(order3);
        System.out.println("Order saved successfully: ");

    }

}
