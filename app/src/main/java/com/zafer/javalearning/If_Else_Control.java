package com.zafer.javalearning;

public class If_Else_Control {
    public static void main(String[] args){
        for (int i = 0; i < 10; i++){
            if (i > 2 && i < 5){
                System.out.println(i);
            }else{
                System.out.println("/");
                System.out.println(i);
            }
        }
    }
}
