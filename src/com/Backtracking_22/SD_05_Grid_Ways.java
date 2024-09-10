package com.Backtracking_22;

public class SD_05_Grid_Ways {
    public static int gridWays(int i, int j, int n, int m){
        // Base Case
        if(i == n-1 && j == m-1) { // Conditions for last cell
            return 1;
        } else if(i == n || j == n) { // Boundary cross conditions
            return 0;
        }

        int w1 = gridWays(i+1, j, n, m);
        int w2 = gridWays(i, j+1, n, m);
        return w1 + w2;
    }
    public static void main(String[] args) {
        int n = 3, m = 3;
        System.out.println(gridWays(0, 0, n, m));
    }
}
