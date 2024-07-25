package com.Strings_16;

public class SD_16_Print_Largest_Strings {
    public static void main(String[] args) {
        String fruits[] = {"apple", "mango", "banana"};

        String largest = fruits[0];
        for(int i=1; i< fruits.length; i++){
            if(largest.compareTo(fruits[i]) < 0){ // If largest is smaller than fruits of i then the fruits of i is the largest
                largest = fruits[i];
            }
        }
        System.out.println(largest);
    }
}
