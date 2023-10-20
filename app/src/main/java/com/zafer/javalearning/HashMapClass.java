package com.zafer.javalearning;

import java.util.HashMap;

public class HashMapClass {
    public static void main(String[] args){
        ////////////////////////////// hashmap
        HashMap<String , String> myHashMap = new HashMap<String , String>();
        myHashMap.put("Name" , "Zafer");
        myHashMap.put("Surname" , "İntepe");
        myHashMap.put("Job" , "Software Developer");
        System.out.println(myHashMap.get("Name"));
        System.out.println(myHashMap.get("Surname"));
        System.out.println(myHashMap.get("Job"));
    }
}
