package com.Arrays;

public class SD13_Arrays {
    public static void update(int marks[], int nonChangeable) {
        nonChangeable = 10;
        for(int i=0; i<marks.length; i++) {
            marks[i] = marks[i] + 1;
        }
    }

    public static int linearSearch(int numbers[], int key){

        for(int i=0; i<numbers.length; i++){
            if(numbers[i] == key){
                return i;
            }
        }
        return -1;
    }

    public static int get_Largest(int numbers[]){
        int largest = Integer.MIN_VALUE; // -infinity
        int smallest = Integer.MAX_VALUE;

        for(int i=0; i<numbers.length; i++){
            if(largest < numbers[i]){
                largest = numbers[i];
            }
            if(smallest > numbers[i]){
                smallest = numbers[i];
            }
        }
        System.out.println("Smallest value is : " + smallest);
        return largest;
    }
    public static void main(String[] args) {
/*        int marks[] = new int[100];

        Scanner sc = new Scanner(System.in);
       int phy;
       phy = sc.nextInt();

        System.out.println("length of array = " + marks.length);

        marks[0] = sc.nextInt(); // Phy
        marks[1] = sc.nextInt(); // Chem
        marks[2] = sc.nextInt(); // Maths

        System.out.println("Phy : " + marks[0]);
        System.out.println("Chem : " + marks[1]);
        System.out.println("Maths : " + marks[2]);

        // marks[2] = 67;
        marks[2] = marks[2] + 1;
        System.out.println("Maths : " + marks[2]);

        int percentage = (marks[0] + marks[1] + marks[2]) / 3;
        System.out.println("Percentage = " + percentage + "%");*/


        /*int marks[] = {97, 98, 99};
        int nonChangeable = 5;
        update(marks, nonChangeable);
        System.out.println(nonChangeable);

        // Print our marks
        for(int i=0; i<marks.length; i++) {
            System.out.print(marks[i]+" ");
        }
        System.out.println();*/

        /*int numbers[] = {2, 4, 6, 8, 10, 12, 14, 16};
        int key = 10;

        int index = linearSearch(numbers, key);
        if(index == -1){
            System.out.println("NOT found");
        } else{
            System.out.println("Key is at index : " + index);
        }*/

        int numbers[] = {1, 2, 6, 3, 5};
        System.out.println("largest value is : " + get_Largest(numbers));







    }
}
