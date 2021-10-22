package com.augustoaccorsi.chapter3.linkedhashmap;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapExample {
    public static void main(String[] args) {
        LinkedHashMap<String,Integer> phonebook = new LinkedHashMap();
        phonebook.put("Kevin", 12345);
        phonebook.put("Jill", 123456789);
        phonebook.put("Brenda", 133333);
        phonebook.put("Gary", 9876544);

        System.out.println("Kevin's number: "+phonebook.get("Kevin"));

        System.out.println("List of all contacts:");
        for(Map.Entry<String, Integer> entry: phonebook.entrySet())
            System.out.println(entry.getKey()+":"+entry.getValue());
    }
}
