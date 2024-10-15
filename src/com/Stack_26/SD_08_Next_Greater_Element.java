package com.Stack_26;
import java.util.*;

public class SD_08_Next_Greater_Element{
    public static void main(String[] args) {
        int arr[] = {6, 8, 0, 1, 3};
        Stack<Integer> s = new Stack<>();
        int nxtGreater[] = new int[args.length];

        for(int i= arr.length-1; i>=0; i--){
            // 1 While
            while(!s.isEmpty() && arr[s.peek()] <= arr[i]){
                s.pop();
            }

            // 2 If-else
            if(s.isEmpty()){
                nxtGreater[i] = -1;
            } else{
                nxtGreater[i] = arr[s.peek()];
            }

            // 3 Push in s
            s.push(i);
        }

        for(int i=0; i<nxtGreater.length; i++){
            System.out.print(nxtGreater[i]+" ");
        }
        System.out.println();

        // Next Greater Right - this code
        // Next Greater Left -  for(int i=0; i<=arr.length; i++){
        // Next Smaller Right - while(!s.isEmpty() && arr[s.peek()] >= arr[i]){
        // Next Smaller Left - for(int i=0; i<=arr.length; i++){ And, while(!s.isEmpty() && arr[s.peek()] >= arr[i]){
    }
}
