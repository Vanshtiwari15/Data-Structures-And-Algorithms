package com.Strings_16;

import java.util.Scanner;

public class SD_16_Strings_Basics {
    public static void printLetters(String str){
        for(int i=0; i<str.length(); i++){
            System.out.print(str.charAt(i) + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
//        char arr[] = {'a', 'b', 'c', 'd'};
//        String str = "abcd";
//        String str2 = new String("xyz@1234"); // We write anything in new string but they must be valid character in java
//
//        // Strings are IMMUTABLE // Means strings are do not change
//
//        Scanner sc = new Scanner(System.in);
//        String name;
//        // name = sc.next(); // They gives only first word
//        name = sc.nextLine(); // They gives 2nd word as well as whole lines
//        System.out.println(name);

//        String fullName = "Tony Stark";
//        System.out.println(fullName.length());

        String firstName = "Vansh";
        String lastName = "Tiwari";
        String fullName = firstName + " " + lastName;
        // System.out.println(fullName + " is a Engineer");
        // System.out.println(fullName.charAt(0));
        // System.out.println(fullName.charAt(1));

        printLetters(fullName);
    }
}
