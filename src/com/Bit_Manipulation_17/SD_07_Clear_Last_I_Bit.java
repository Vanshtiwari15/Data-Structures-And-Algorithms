package com.Bit_Manipulation_17;

public class SD_07_Clear_Last_I_Bit {
    public static int clearLastIBit(int n, int i){
        int bitMask = (~0)<<i;
        return n & bitMask;
    }
    public static void main(String[] args) {
        System.out.println(clearLastIBit(15, 2));
    }
}
