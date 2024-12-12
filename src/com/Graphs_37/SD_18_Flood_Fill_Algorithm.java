package com.Graphs_37;

public class SD_18_Flood_Fill_Algorithm{
    public void helper(int [][] image, int sr, int sc, int color, boolean vis[][], int orgCol){ // O(m*n)
        if(sr < 0 || sc < 0 || sr>= image.length || sc>= image.length || vis[sr][sc] || image[sr][sc] != orgCol){
            return;
        }

        // Left
        helper(image, sr, sc-1, color, vis, orgCol);
        // Right
        helper(image, sr, sc+1, color, vis, orgCol);
        // Up
        helper(image, sr-1, sc, color, vis, orgCol);
        // Down
        helper(image, sr+1, sc, color, vis, orgCol);
    }
    public int[][] floodFill(int [][] image, int sr, int sc, int color){
        boolean vis[][] = new boolean[image.length][image[0].length];// [m] and [n]
        helper(image, sr, sc, color, vis, image[sr][sc]);
        return image;
    }
    public static void main(String[] args) {

    }
}
