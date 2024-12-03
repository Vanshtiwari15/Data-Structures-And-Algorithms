package com.Tries_36;

public class SD_04_Word_Break_Problem{
    static class Node{
        Node children[] = new Node[26]; // 'a' - 'z'
        boolean eow = false; // First always initialization as false

        public Node(){
            for(int i=0; i<26; i++){
                children[i] = null; // False is not in constructor they define in upper in eow
            }
        }
    }

    public static Node root = new Node();

    public static void insert(String word){ // O(L)
        Node curr = root;
        for(int level=0; level<word.length(); level++){
            int idx = word.charAt(level) - 'a';
            if(curr.children[idx] == null){
                curr.children[idx] = new Node();
            }
            curr = curr.children[idx];
        }

        curr.eow = true;
    }

    public static boolean search(String key){
        Node curr = root;
        for(int level=0; level<key.length(); level++){
            int idx = key.charAt(level) - 'a';
            if(curr.children[idx] == null){
                return false;
            }
            curr = curr.children[idx];
        }

        return curr.eow = true;
    }

    public static boolean wordBreak(String key){ // O(L)
        if(key.length() == 0){
            return true;
        }
        for(int i=1; i<=key.length(); i++){
            // Substring(beginning idx, last idx) or Substring(0, i)
            if(search(key.substring(0, i)) &&
                    wordBreak(key.substring(i))){
                        return true;
                    }
        }

        return false;
    }
    public static void main(String[] args) {
        String arr[] = {"i", "like", "sam", "samsung", "mobile", "ice"};
        for(int i=0; i<arr.length; i++){
            insert(arr[i]);
        }

        String key = "ilikesamsung";
        System.out.println(wordBreak(key));
    }
}
