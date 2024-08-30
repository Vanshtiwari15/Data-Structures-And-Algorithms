package com.Recursion_19;

public class SD_11_Optimized_Print_X_Power_N { // O(logn)
    public static int optimizedPower(int a, int n){
        if(n == 0){
            return 1;
        }
        int halfPower = optimizedPower(a, n/2);
        int halfPowerSq = halfPower * halfPower;

        // N is odd
        if(n % 2 != 0){
            halfPower = a * halfPowerSq;
        }

        return halfPowerSq;
    }
    public static void main(String[] args) {
        int a = 2;
        int n = 5;
        System.out.println(optimizedPower(a, n));
    }
}
