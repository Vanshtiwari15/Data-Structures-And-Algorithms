package com.Arrays;

public class SD12_Pattern2 {
    public static void hollow_rectangle(int totRows, int totCols){
        // Outer Loop
        for(int i=1;i<=totRows;i++){
            // Inner Loop - Columns
            for(int j=1;j<=totCols;j++){
                // Cell - (i,j)
                if (i==1 || i==totRows || j==1 || j==totCols){
                    // Boundary Cells
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void inverted_half_rotated_half_pyramid(int n) {
        // Outer
        for (int i = 1; i <= n; i++){
            // Spaces
            for (int j = 1; j < n - 1; j++) {
                System.out.print(" ");
            }
            // stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void inverted_half_pyramid_with_numbers(int n) {
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i+1; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void Floyds_Triangle(int n) {
        // Outer Loop
        int counter = 1;
        for(int i=1; i<=n; i++){
            // Inner Loop - How many times will counter be printed
            for(int j=1; j<=i; j++){
                System.out.print(counter+" ");
                counter++;
            }
            System.out.println();
        }
    }

    public static void Zero_One_Triangle(int n) {
        // Outer Loop
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                if( (i+j) % 2 == 0){ // Even
                    System.out.print("1");
                }
                else{
                    System.out.print("0");
                }
            }

            System.out.println();
        }
    }

    public static void butterfly(int n) {
        // 1st half
        for(int i=1; i<=n; i++){
            // Stars - i
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }

            // Spaces - 2*(n-i)
            for(int j=1; j<=2*(n-i); j++){
                System.out.print(" ");
            }

            // Stars - i
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        // 2nd half
        for(int i=n; i>=1; i--){
            // Stars - i
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }

            // Spaces - 2*(n-i)
            for(int j=1; j<=2*(n-i); j++){
                System.out.print(" ");
            }

            // Stars - i
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void solid_rhombus(int n) {
        for(int i=1; i<=n; i++){
            // Spaces
            for(int j=1; j<=(n-i); j++){
                System.out.print(" ");
            }

            // Stars
            for(int j=1; j<=n; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void Hollow_Rhombus(int n){
        for(int i=1; i<=n; i++){
            // Spaces
            for(int j=1; j<=(n-i); j++){
                System.out.print(" ");
            }
            // Stars
            for(int j=1; j<=n; j++){
                if(i == 1 || i == n || j == 1 || j == n){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println(" ");
        }
    }

    public static void Diamond(int n){
        // 1st half
        for(int i=1; i<=n; i++) {
            // Spaces
            for(int j=1; j<=(n-i); j++){
                System.out.print(" ");
            }

            // Stars
            for(int j=1; j<=(2*i)-1; j++){
                System.out.print("*");
            }

            System.out.println();
        }

        // 2nd half
        for(int i=n; i>=1; i--){
            // Spaces
            for(int j=1; j<=(n-i); j++){
                System.out.print(" ");
            }

            // Stars
            for(int j=1; j<=(2*i)-1; j++){
                System.out.print("*");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        // hollow_rectangle(4, 5);
        // inverted_half_rotated_half_pyramid(7);
        // inverted_half_pyramid_with_numbers(5);
        // Floyds_Triangle(5);
        // Zero_One_Triangle(5);
        // butterfly(4);
        // solid_rhombus(5);
        // Hollow_Rhombus(5);
        // Diamond(4);
    }
}
