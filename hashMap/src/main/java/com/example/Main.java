package com.example;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<People, Integer> map = new HashMap<>();

        People ob1 = new People("Jane", 26);
        People ob4 = new People("Jane", 26);

        map.put(ob1, ob1.getAge());
        map.put(ob4, ob4.getAge());

        System.out.println("map.size() = " + map.size());
    }
}

