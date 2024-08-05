package com.Bit_Manipulation_17;

public class SD_11_Fast_Exponentiation {
    public static int fastExpo(int a, int n) {
        int ans = 1;

        while (n > 0) {
            if ((n & 1) != 0) { // Check LSB
                ans = ans * a;
            }
            a = a * a;
            n = n >> 1;
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(fastExpo(3,5));
        System.out.println(fastExpo(5,3));
    }
}
