package com.Bit_Manipulation_17;

public class SD_05_Clear_ith_Bit {
    public static int clearIntBit(int n, int i){
        int bitMask = ~(1<<i);
        return n & bitMask;
    }
    public static void main(String[] args) {
        System.out.println(clearIntBit(10, 1));
    }
}
