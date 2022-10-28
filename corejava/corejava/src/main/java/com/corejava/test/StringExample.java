package com.corejava.test;

import java.util.Arrays;
import java.util.List;
import java.util.StringJoiner;
import java.util.stream.Collectors;

public class StringExample {
    public static void main(String[] args) {
        String city = "Tamil-Nadu";
        String cityObj = new String("TamilNadu");

        char[] ch = { 'j', 'a', 'v', 'a', 't', 'p', 'o', 'i', 'n', 't' };
        String s = new String(ch);

        System.out.println(city == cityObj);
        System.out.println(city.equalsIgnoreCase(cityObj));
        System.out.println(city.compareTo(cityObj));

        System.out.println(city.charAt(0));
        System.out.println(city.substring(1));
        System.out.println(city.substring(0, 3));
        System.out.println(city.contains("Nadu"));
        System.out.println(Arrays.toString(city.split("-")));

        System.out.println(String.valueOf(123));

        String res = String.format("%s %s", city, s);
        System.out.println(res);

        String res2 = String.join("", city, s);
        System.out.println(res2);

        StringJoiner sj = new StringJoiner("#");
        sj.add("abcd");
        sj.add("res2");
        System.out.println(sj);

        List<String> liststr = Arrays.asList("abc", "pqr", "xyz"); // List of String array
        String str = liststr.stream().collect(Collectors.joining(", ")); // performs joining operation
        System.out.println(str.toString()); // Displays result
    }
}
