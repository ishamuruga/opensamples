package com.corejava.test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

final class Employee {

    final String pancardNumber;

    private List<Honda> cars;

    Employee(String pancardNumber) {
        this.pancardNumber = pancardNumber;
    }

    public String getPancardNumber() {
        return pancardNumber;
    }

    public List<Honda> getCars(){
        return cars.stream().collect(Collectors.toList());
        //return (ArrayList)this.cars.clone();
    }
}

public class ImmutableDemo {
    public static void main(String ar[]) {
        Employee e = new Employee("ABC123");
        String s1 = e.getPancardNumber();
        
        System.out.println("Pancard Number: " + s1);
    }
}