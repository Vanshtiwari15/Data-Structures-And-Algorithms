package com.Linked_List_24;
import java.util.LinkedList;

public class SD_08_Zig_Zag {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = next;
        }
    }

    public static  Node head;
    public static  Node tail;

    public void addLast(int data) {
        // Step 1 = Create a node
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        // Step 2 - new node = tail
        tail.next = newNode; // Link

        // Step 3 - tail = new node
        tail = newNode;
    }

    public void print(){ // O(n)
//        if(head == null){
//            System.out.println("LL is empty");
//            return;
//        }
        Node temp = head;
        while(temp != null) {
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void zigZag(){
        // Find mid
        Node slow = head;
        Node fast = head.next;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        Node mid = slow;

        // Reverse 2nd half
        Node curr = mid.next;
        mid.next = null;
        Node prev = null;
        Node next;

        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        Node left = head;
        Node right = prev;
        Node nextL, nextR;

        // Alt merge - zig-zag merge
        while(left != null && right != null){
            nextL = left.next;
            left.next = right;
            nextR = right.next;
            right.next = nextL;

            left = nextL;
            right = nextR;
        }
    }
    public static void main(String[] args) {
        SD_08_Zig_Zag ll = new SD_08_Zig_Zag();
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);
        ll.addLast(6);
        // 1->2->3->4->5->6

        ll.print();
        ll.zigZag();
        ll.print();
    }
}
