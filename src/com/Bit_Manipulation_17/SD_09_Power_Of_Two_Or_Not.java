package com.Bit_Manipulation_17;

public class SD_09_Power_Of_Two_Or_Not {
    public static boolean isPowerOfTwo(int n){
        return (n&(n-1)) == 0;
    }
    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(8));
        System.out.println(isPowerOfTwo(15));
    }
}
