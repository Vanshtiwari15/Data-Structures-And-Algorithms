package com.Recursion_19;

public class SD_12_Tilling_Problem {
    public static int tillingProblem(int n){
        // Base case
        if(n == 0 || n == 1){
            return 1;
        }

        // Kaam
        // Vertical Choice
        int fnm1 = tillingProblem(n-1);

        // Horizontal Choice
        int fnm2 = tillingProblem(n-2);

        int totways = fnm1 + fnm2;
        return totways;
    }
    public static void main(String[] args) {
        System.out.println(tillingProblem(3));
        System.out.println(tillingProblem(2));
        System.out.println(tillingProblem(4));
    }
}
