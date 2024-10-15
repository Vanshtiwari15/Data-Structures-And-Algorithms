package com.Linked_List_24;

public class SD_05_Remove_A_Loop_Cycle_In_A_LL {
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
    public static void removeCycle(){
        // Detect Cycle
        Node slow = head;
        Node fast = head;
        boolean cycle = false;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(fast == slow){
                cycle = true;
                break;
            }
        }
        if(cycle == false){
            return;
        }

        // Find meeting point
        slow = head;
        Node prev = null; // Last node
        while(slow != fast){
            prev = fast;
            slow = slow.next;
            fast = fast.next;
        }
        // Remove cycle -> last.next = null
        prev.next = null;

    }
    public static void main(String[] args) {
        head = new Node(1);
        Node temp = new Node(2);
        head.next = temp;
        head.next.next = new Node(3);
        head.next.next.next = temp;
        // 1->2->3->2

        System.out.println(isCycle());
        removeCycle();
        System.out.println(isCycle());
    }
}
