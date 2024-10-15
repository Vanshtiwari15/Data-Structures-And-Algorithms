package com.Linked_List_24;

public class SD_04_Detect_A_Loop_Cycle_In_A_LL {
    // Define the Node class as a static inner class
    static class Node {
        int data;
        Node next;

        // Constructor to initialize the node
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    // Head of the linked list
    static Node head;

    // Method to detect a cycle in the linked list
    public static boolean isCycle(){
        Node slow = head; // Initialize slow pointer
        Node fast = head;  // Move fast pointer by two

        while(fast !=null && fast.next != null){
            slow = slow.next; // +1
            fast = fast.next.next; // +2
            if(slow == fast){
                return true; // Cycle exists
            }
        }

        return false; // Cycle doesn't exist
    }
    public static void main(String[] args) {
        head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = head;
        // 1->2->3->1
        System.out.println(isCycle());
    }
}
