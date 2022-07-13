package com.java.concurrent;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class SynchronizedCollection01 {

    public void synchronizedCollection() throws InterruptedException {
        Collection<Integer> syncCollection = Collections.synchronizedCollection(new ArrayList<Integer>());

        Runnable listOperations = () -> {
            syncCollection.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        };

        Thread thread1 = new Thread(listOperations); 
        Thread thread2 = new Thread(listOperations);

        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();

        syncCollection.forEach(System.out::println);
    }

    public void synchronizedList02() throws InterruptedException {
        //List<String> synList = Collections.synchronizedList(Arrays.asList("Basha","Baba","Arunachalam"));

        List<String> synList = Collections.synchronizedList(new ArrayList<>());
        synList.add("Raja");
        synList.add("Super");
        synList.add("abcd");
        synList.add("4rfvgtyh");
        List<String> upperList = new ArrayList<>();

        Runnable listOperations = () -> {
            synchronized (synList) {
                synList.add(Math.random()+"");
                synList.forEach((e) -> {
                    upperList.add(e.toUpperCase());
                });
            }
        };
        
        Thread thread1 = new Thread(listOperations); 
        Thread thread2 = new Thread(listOperations);

        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();

        upperList.forEach(System.out::println);
    }

    public static void main(String[] args) throws InterruptedException  {
        SynchronizedCollection01 s01= new SynchronizedCollection01();
        //s01.synchronizedCollection();
        s01.synchronizedList02();
    }
}
