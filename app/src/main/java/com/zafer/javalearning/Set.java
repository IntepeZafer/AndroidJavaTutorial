package com.zafer.javalearning;

import java.util.HashSet;

public class Set {
    public static void main(String[] args){
        ////////////////////////////// Set diziler gibidir ama her eleman bir kere eklenebilir
        HashSet<String> myHashSet = new HashSet<String>();
        myHashSet.add("Zafer");
        myHashSet.add("Zafer");
        myHashSet.add("Zeynep");
        for (String i : myHashSet){
            System.out.println(i);
        }

    }
}
