package com.Bit_Manipulation_17;

public class SD_10_Count_Sets_bits {
    public static int countSetBits(int n) {
        int count = 0;
        while (n > 0) {
            if ((n & 1) != 0) { // Check our LSB
                count++;
            }
            n = n >> 1;
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println(countSetBits(10));
    }
}
