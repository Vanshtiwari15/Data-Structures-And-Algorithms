package com.Arrays;

public class SD13_Binary_Search {
    public static int binarySearch(int numbers[], int key){
        int start = 0, end = numbers.length-1;

        while(start <= end) {
            int mid = (start + end) / 2;

            // Comparisons
            if(numbers[mid] == key){ // Found
                return mid;
            }
            if(numbers[mid] < key){ // Right
                start = mid+1;
            } else { // Left
                end = mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int numbers[] = {2, 4, 6, 8, 10, 12, 14};
        int key = 10;

        System.out.println("index for key is : " + binarySearch(numbers, key)) ;

    }
}
