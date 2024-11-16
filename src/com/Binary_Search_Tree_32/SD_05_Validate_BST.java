package com.Binary_Search_Tree_32;

public class SD_05_Validate_BST {
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
        }
    }

    public static Node insert(Node root, int val){
        if(root == null){
            root = new Node(val);
            return root;
        }

        if(root.data > val){
            // Left subtree
            root.left = insert(root.left, val);
        } else{
            root.right = insert(root.right, val);
        }
        return root;
    }

    public static void inorder(Node root){
        if(root == null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }

    public static boolean search(Node root, int key){ // O(H)
        if(root == null){
            return false;
        }

        if(root.data == key){
            return true;
        }

        if(root.data > key){
            return search(root.left, key);
        }
        else{
            return search(root.right, key);
        }
    }

    public static boolean isValidBST(Node root, Node min, Node max){
        if(root == null){
            return true;
        }

        if(min != null && root.data <= min.data){
            return false;
        }

        else if(max != null && root.data >= max.data){
            return false;
        }

        return isValidBST(root.left, min, root)
                && isValidBST(root.right, root, max);

    }
    public static void main(String[] args) {
        int values[] = {8, 5, 3, 6, 10, 11, 14}; // int values[] = {1, 1, 1}; -> not valid Because of Duplicates nodes are not allowed in BST
        Node root = null;

        for(int i=0; i<values.length; i++){
            root = insert(root, values[i]);
        }

        inorder(root);
        System.out.println();

        if(isValidBST(root, null, null)){
            System.out.println("valid");
        } else{
            System.out.println("not valid");
        }
    }
}
