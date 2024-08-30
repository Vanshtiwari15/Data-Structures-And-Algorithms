package com.Recursion_19;

public class SD_03_Number_From_1_To_N {
    public static void printInc(int n){
        if (n == 1){
            System.out.print(n+" ");
            return;
        }
        printInc(n-1);
        System.out.print(n+" ");
    }
    public static void main(String[] args) {
        int n = 5;
        printInc(n);
    }
}
