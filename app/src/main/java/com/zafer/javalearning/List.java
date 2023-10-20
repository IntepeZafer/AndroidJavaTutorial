package com.zafer.javalearning;

import java.util.ArrayList;

public class List {
    public static void main(String[] args){
        //////////////////////// arrayList
        ArrayList<String> myMusucian = new ArrayList<String>();
        myMusucian.add("Zafer");
        myMusucian.add("Zeynep");
        myMusucian.add(0 , "Abdullah");
        System.out.println(myMusucian.get(0));
        System.out.println(myMusucian.get(1));
        System.out.println(myMusucian.get(2));
    }
}
