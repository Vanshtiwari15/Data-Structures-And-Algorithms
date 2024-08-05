package com.Bit_Manipulation_17;

public class SD_04_Set_Ith_Bit {
    public static int setIntBit(int n, int i){
        int bitMask = 1<<i;
        return n | bitMask;
    }
    public static void main(String[] args) {
        System.out.println(setIntBit(10,2));
    }
}
