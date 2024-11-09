package com.Binary_Tree_29;

public class SD_04_Diameter_Of_A_Tree_Approach_2{
    static class Node{
        int data;
        Node left, right;

        public Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class Info{
        int dia;
        int ht;

        public Info(int dia, int ht){
            this.dia = dia;
            this.ht = ht;
        }
    }

    public static Info diameter(Node root){ // O(n)
        if(root == null){
            return new Info(0, 0);
        }
        Info leftInfo = diameter(root.left);
        Info rightInfo = diameter(root.right);

        int dia = Math.max(Math.max(leftInfo.dia, rightInfo.dia), leftInfo.ht + rightInfo.ht + 1);
        int ht = Math.max(leftInfo.ht, rightInfo.ht) + 1;

        return new Info(dia, ht);
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
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        System.out.println(diameter(root).dia);
        System.out.println(diameter(root).ht);
    }
}
