package com.Bit_Manipulation_17;

public class SD_03_Get_Ith_Bit {
    public static int getIntBit(int n, int i){
        int bitMask = 1<<i;
        if((n & bitMask) == 0){
            return 0;
        } else {
            return 1;
        }
    }
    public static void main(String[] args) {
        System.out.println(getIntBit(10, 2));
        System.out.println(getIntBit(10, 3));
    }
}
