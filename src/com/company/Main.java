package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> items = new ArrayList<>();

        items.add(1);
        items.add(2);
  //      items.add("tim");
        items.add(4);
        items.add(5);

        printDoubled(items);
    }
    public static void printDoubled(ArrayList<Integer> n){
        for(Object i : n){ //może być tu int
            System.out.println((Integer) i * 2); //metoda (Integer) - casting
        }
    }
}
