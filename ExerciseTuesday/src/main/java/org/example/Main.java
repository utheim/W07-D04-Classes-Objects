package org.example;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        System.out.println(numbers);
        numbers.remove(2);
        System.out.println(numbers);
        numbers.set(0, 111);
        System.out.println(numbers);

        FruityList();
    }

    public static void exercise2() {
        ArrayList<String> fruits = new ArrayList<>(Arrays.asList("Banana", "Orange", "Mango", "Grape",
                "Pineapple", "Strawberry", "Blueberry", "Kiwi", "Watermelon"));
        System.out.println("Welcome to my favorite fruits: " + fruits);
        if (fruits.contains("Apple")) System.out.println("Apple is definitely one of my favorites");
        else
            System.out.println("Not found");


        fruits.indexOf("banana");
        System.out.println(indexOf);
    }

    public static void reverseList(ArrayList<Integer> numbers) {
        int temp;
        for (int index = 0; index < numbers.size() / 2; index++) {
            temp = numbers.get(index);
            numbers.set(index, numbers.get(numbers.size() - index - 1));
            numbers.set(numbers.size() - index-1, temp);
        }
        System.out.println("My reversed list: " +  numbers);
    }
        }





