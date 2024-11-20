package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println(isNumberBigger(myNumber: 10, new int[]{1,2,3,4,5});
    }
}
public static boolean isNumberBigger(int myNumber, int[] myArray){
                     for (int oneNumber : myArray) {
                         if (myNumber < oneNumber) {
                             return false;
                         }
                     }
                     return true;
}