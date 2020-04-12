package com.example.materialtest;

import java.util.ArrayList;
import java.util.List;

public class Test {

    public void printFruits() {
        List<String> fruitList = new ArrayList<>();
        fruitList.add("Apple");
        fruitList.add("Banana");
        fruitList.add("Orange");
        fruitList.add("Pear");
        fruitList.add("Grape");
        for (String fruit : fruitList) {
            System.out.println(fruit);
        }
    }

}