package com.Linked_List_24;

import java.util.LinkedList;

public class SD_07_Merge_Sort_In_A_LL{
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = next;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst(int data) {

        // Step 1 = Create new node
        Node newNode = new Node (data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        // Step 2 - newNode next = head
        newNode.next = head; // Link

        // Step 3 - head = new node
        head = newNode;
    }

    public void addLast(int data) {
        // Step 1 = Create a node
        Node newNode = new Node (data);
        size++;
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

    private Node getMid(Node head){
        Node slow = head;
        Node fast = head.next;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    private Node merge(Node head1, Node head2){
        Node mergedLL = new Node(-1);
        Node temp = mergedLL;

        while(head1 != null && head2 != null){
            if(head1.data <= head2.data){
                temp.next = head1;
                head1 = head1.next;
                temp = temp.next;
            } else{
                temp.next = head2;
                head2 = head2.next;
                temp = temp.next;
            }
        }

        while(head1 != null){
            temp.next = head1;
            head1 = head1.next;
            temp = temp.next;
        }

        while(head2 != null){
            temp.next = head2;
            head2 = head2.next;
            temp = temp.next;
        }

        return mergedLL.next;
    }

    public Node mergeSort(Node head){
        // Base case
        if(head == null || head.next == null){
            return head;
        }

        // Find mid
        Node mid = getMid(head);
        // Left & right MS
        Node rightHead = mid.next;
        mid.next = null;
        Node newLeft = mergeSort(head);
        Node newRight = mergeSort(rightHead);

        // Merge
        return merge(newLeft, newRight);
    }
    public static void main(String[] args) {
        SD_07_Merge_Sort_In_A_LL ll = new SD_07_Merge_Sort_In_A_LL();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(3);
        ll.addFirst(4);
        ll.addFirst(5);
        // 5->4->3->2->1

        ll.print();
        ll.head = ll.mergeSort(ll.head);
        ll.print();

        // O(nlogn)
    }
}
