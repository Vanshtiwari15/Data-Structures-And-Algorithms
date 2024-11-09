package com.Binary_Tree_29;

public class SD_02_Height_And_Count_And_Sum_Of_A_Tree {
    static class Node{
        int data;
        Node left, right;

        public Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static int height(Node root){ // O(n)
        if(root == null){
            return 0;
        }

        int lh = height(root.left);
        int rh = height(root.right);
        return Math.max(lh, rh) + 1;
    }

    public static int count(Node root){ // O(n)
        if(root == null){
            return 0;
        }

        int leftCount = count(root.left);
        int rightCount = count(root.right);
        return leftCount + rightCount + 1;
    }

    public static int sum(Node root){ // O(n)
        if(root == null){
            return 0;
        }

        int leftSum = sum(root.left);
        int rightSum = sum(root.right);
        return leftSum + rightSum + root.data;
    }
    public static void main(String[] args) {
        /*
                   1
                  / \
                 2   3
                / \ / \
               4  5 6  7

         */
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
//        root.left.left = new Node(4);
//        root.left.right = new Node(5); // Without comment height is 3 run without comment also when we revise
//        root.right.left = new Node(6); // Without comment Count is 7 run without comment also when we revise
//        root.right.right = new Node(7); // Without comment Sum is 28 run without comment also when we revise

        System.out.println(height(root));
        System.out.println(count(root));
        System.out.println(sum(root));
    }
}
