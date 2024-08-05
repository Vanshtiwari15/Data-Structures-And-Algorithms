package com.Bit_Manipulation_17;

public class SD_02_Check_Odd_Or_Even {
    public static void oddOrEven(int n){
        int bitMask = 1;
        if((n & bitMask) == 0){
            // Even number
            System.out.println("Even Number");
        } else {
            System.out.println("Odd Number");
        }
    }
    public static void main(String[] args) {
        oddOrEven(3);
        oddOrEven(11);
        oddOrEven(14);
    }
}
