package com.zafer.javalearning;

public class ForDongusu{
    public static void main(String[] args){
        int[] myInteger = {1 , 2 , 3 , 4 , 5 ,6 ,7 ,8 ,10};
        for (int i = 0; i < myInteger.length; i++){
            System.out.println("[" + i  + "] İndex Değerinin Sonucu: " + (int)((float)i / 3 * 5));
        }
        System.out.println("///////////////////////////////////////////////////////////////////////");
            int x = 0;
        for (int i : myInteger){
            if (i > x){
                x = i;
            }
        }
        System.out.println("Dizi İçerisinde Ki En Büyük Sayı: " + x);
    }
}
