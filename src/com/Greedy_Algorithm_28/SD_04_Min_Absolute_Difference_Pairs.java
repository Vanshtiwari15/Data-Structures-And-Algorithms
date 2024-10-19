package com.Greedy_Algorithm_28;
import java.util.*;

public class SD_04_Min_Absolute_Difference_Pairs{ // O(nlogn)
    public static void main(String[] args) {
//        int A[] = {1, 2, 3};
//        int B[] = {2, 1, 3};

        int A[] = {4, 1, 8, 7};
        int B[] = {2, 3, 6, 5};

        Arrays.sort(A);
        Arrays.sort(B);

        int minDiff = 0;

        for(int i=0; i<A.length; i++){ // We also use B.length instead of A.length because both the lengths are same
            minDiff += Math.abs(A[i]-B[i]);
        }

        System.out.println("min absolute diff of pairs = " + minDiff);
    }
}
