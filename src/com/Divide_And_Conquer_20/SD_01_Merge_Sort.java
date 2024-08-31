package com.Divide_And_Conquer_20;

public class SD_01_Merge_Sort {
    public static void printArr(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void mergeSort(int arr[], int si, int ei){
        if(si >= ei){
            return;
        }
        // Kaam
        int mid = si + (ei - si)/2; // (si+ei)/2
        mergeSort(arr, si, mid); // Left part
        mergeSort(arr, mid+1, ei); // Right part
        merge(arr, si, mid, ei);
    }
    public static void merge(int arr[], int si, int mid, int ei){
        int temp[] = new int [ei-si+1];
        int i = si; // Idx for 1st sorted part
        int j = mid+1; // Idx for 2nd sorted part
        int k = 0; // Idx for temp;

        while(i <= mid && j <= ei){
            if(arr[i] < arr[j]){
                temp[k] = arr[i];
                i++;
            } else{
                temp[k] = arr[j];
                j++;
            }
            k++;
        }

        // For leftover elements of 1st sorted part
        while(i <= mid){
            temp[k++] = arr[i++];
        }

        // For leftover elements of 2nd sorted part
        while(j <= ei){
            temp[k++] = arr[j++];
        }

        // Copy temp to original array
        for(k=0, i=si; k< temp.length; k++, i++){
            arr[i] = temp[k];
        }
    }
    public static void main(String[] args) {
        int arr[] = {6, 3, 9, 5, 2, 8};
        mergeSort(arr, 0, arr.length-1);
        printArr(arr);
    }
}
