package com.Recursion_19;

public class SD_14_Friends_Pairing_Problem {
    public static int friendsPairing(int n){
        if(n == 1 || n ==2){
            return n;
        }
//        // Choice
//        // Single
//        int fnm1 = friendsPairing(n-1);
//
//        // Pair
//        int fnm2 = friendsPairing(n-2);
//        int pairWays = (n-1) * (fnm2);
//
//        // TotalWays
//        int totways = fnm1 + pairWays;
//        return totways;
        return friendsPairing(n-1) + (n-1) * friendsPairing(n-2);
    }
    public static void main(String[] args) {
        System.out.println(friendsPairing(3));
    }
}
