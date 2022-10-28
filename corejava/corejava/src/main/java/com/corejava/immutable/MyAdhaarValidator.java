package com.corejava.immutable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public final class MyAdhaarValidator {

    private String adhaarNo;
    
    List<String> names;

    public String getAdhaarNo() {
        return adhaarNo;
    }
    
    MyAdhaarValidator(final String adhaar) {
        this.adhaarNo = adhaar;
        names = Arrays.asList("a","b","c");
    }
    
    public Boolean doValidate() {
        System.out.println(this.adhaarNo);
        
        return Boolean.TRUE;
    }
    
    public List<String> returnData(){
        List<String> cloned = new ArrayList<>();
        cloned.addAll(names);
        return cloned;
        //return names.stream().collect(Collectors.toList());
    }

    public static void main(String[] args) {
        MyAdhaarValidator mv = new MyAdhaarValidator("ABCD");
        List<String> res = mv.returnData();
        res.add("456");
    }
}


