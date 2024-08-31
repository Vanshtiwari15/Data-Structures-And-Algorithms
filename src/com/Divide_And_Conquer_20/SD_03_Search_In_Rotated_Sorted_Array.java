package com.Divide_And_Conquer_20;

public class SD_03_Search_In_Rotated_Sorted_Array {
    public static int search(int arr[], int tar, int si, int ei){
        if(si > ei){
            return -1; // Base case
        }

        // Kaam
        int mid = si + (ei-si)/2; // (Si- ei)/2

        // Case found
        if(arr[mid] == tar){
            return mid;
        }

        // Mid on L1
        if(arr[si] <= arr[mid]){
            // Case a : Left
            if(arr[si] <= tar && tar <= arr[mid]){
                return search(arr, tar, si, mid-1);
            } else{
                // Case b : Right
                return search(arr, tar, mid+1, ei);
            }
        }

        // Mid on L2
        else{
            // Case c : Right
            if(arr[mid] <= tar && tar <= arr[ei]){
                return search(arr, tar, mid+1, ei);
            } else{
                // Case d : Left
                return search(arr, tar, si, mid-1);
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {4, 5, 6, 7, 0, 1, 2};
        int target = 0; // Output -> 4
        int tarIdx = search(arr, target, 0, arr.length-1);
        System.out.println(tarIdx);
    }
}
