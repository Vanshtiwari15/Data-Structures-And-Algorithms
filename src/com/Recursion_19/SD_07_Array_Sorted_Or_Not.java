package com.Recursion_19;

public class SD_07_Array_Sorted_Or_Not {
    public static boolean isSorted(int arr[], int i){
        if( i == arr.length-1){
            return true;
        }

        if(arr[i] > arr[i+1]){
            return false;
        }

        return isSorted(arr, i+1);
    }
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4};
//        int arr[] = {1, 2, 3, 5, 4};
//        int arr[] = {5};
//        int arr[] = {5, 6};
        System.out.println(isSorted(arr, 0));
    }
}
