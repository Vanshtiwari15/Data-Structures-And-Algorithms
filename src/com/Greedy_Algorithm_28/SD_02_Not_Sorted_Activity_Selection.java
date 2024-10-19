package com.Greedy_Algorithm_28;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class SD_02_Not_Sorted_Activity_Selection{
    public static void main(String[] args) {
        int start[] = {0, 1, 3, 5, 5, 8};
        int end[] = {6, 2, 4, 7, 9, 9};

        // Sorted
        int activities[][] = new int[start.length][3];
        for(int i=0; i< start.length; i++){
            activities[i][0] = i;
            activities[i][1] = start[i];
            activities[i][2] = end[i];
        }

        // Lambda function -> shortform
        Arrays.sort(activities, Comparator.comparingDouble(o -> o[2]));

        // End time basis sorted
        int maxAct = 0;
        ArrayList<Integer> ans = new ArrayList<>();

        // 1st activity
        maxAct = 1;
        ans.add(activities[0][0]);
        int lastEnd = activities[0][2];
        for(int i=1; i<end.length; i++){
            if(activities[i][1] >= lastEnd){
                // Activity select
                maxAct++;
                ans.add(activities[i][0]);
                lastEnd = activities[i][2];
            }
        }
        System.out.println("max activities = " + maxAct);
        for(int i=0; i<ans.size(); i++){
            System.out.print("A"+ans.get(i)+" ");
        }
        System.out.println();
    }
}
