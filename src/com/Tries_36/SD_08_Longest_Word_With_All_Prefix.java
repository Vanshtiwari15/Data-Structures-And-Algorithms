package com.Tries_36;

public class SD_08_Longest_Word_With_All_Prefix{
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

    public static boolean search(String key) {
        Node curr = root;
        for (int level = 0; level < key.length(); level++) {
            int idx = key.charAt(level) - 'a';
            if (curr.children[idx] == null) {
                return false;
            }
            curr = curr.children[idx];
        }

        return curr.eow = true;
    }

    public static String ans = "";

    public static void LongestWord(Node root, StringBuilder temp){
        if(root == null){
            return; /// They do not hit but we write as for clarity
        }

        for(int i=0; i<26; i++){ // a, b, c, d
            if(root.children[i] != null && root.children[i].eow == true){
                char ch = (char)(i+'a'); // i+a gives integer so type caste with char
                temp.append(ch);
                if(temp.length() > ans.length()){
                    ans = temp.toString();
                }

                LongestWord(root.children[i], temp);
                temp.deleteCharAt(temp.length()-1); // Backtrack
            }
        }


    }
    public static void main(String[] args) {
        String words[] = {"a", "banana", "app", "appl", "ap", "apply", "apple"};

        for(int i=0; i< words.length; i++){
            insert(words[i]);
        }
        LongestWord(root, new StringBuilder(""));
        System.out.println(ans);
    }
}
