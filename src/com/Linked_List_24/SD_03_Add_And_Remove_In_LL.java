package com.Linked_List_24;

import java.io.FilterOutputStream;

public class SD_03_Add_And_Remove_In_LL {
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
        Node newNode = new Node(data);
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
        Node newNode = new Node(data);
        size++;
        if(head == null) {
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

    public void add(int idx, int data){
        if(idx == 0){
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i = 0;

        while(i < idx-1){
            temp = temp.next;
            i++;
        }

        // I = idx-1; temp -> prev
        newNode.next = temp.next;
        temp.next = newNode;
    }

    public int removeFirst(){
        if(size == 0){
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        } else if(size == 1){
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }

    public int removeLast(){
        if(size == 0){
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        } else if(size == 1){
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        // Prev : i = size-2
        Node prev = head;
        for(int i=0; i<size-2; i++){
            prev = prev.next;
        }

        int val = prev.next.data; // Tail.data
        prev.next = null;
        tail = prev;
        size--;
        return val;
    }

    public int itrSearch(int key){ // O(n)
        Node temp = head;
        int i = 0;

        while(temp != null) {
            if (temp.data == key) { // Key found
                return i;
            }
            temp = temp.next;
            i++;
        }

        // Key not found
        return -1;
    }

    public int helper(Node head, int key){ // O(n)
        if(head == null){
            return -1;
        }

        if(head.data == key){
            return 0;
        }
        int idx = helper(head.next, key);
        if(idx == -1){
            return -1;
        }

        return idx+1;
    }

    public int recSearch(int key){
        return helper(head, key);
    }

    public void reverse(){ // O(n)
        Node prev = null;
        Node curr = tail = head;
        Node next;

        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }

    public void deleteNthfromEnd(int n){
        // Calculate Size
        int sz = 0;
        Node temp = head;
        while(temp !=null){
            temp = temp.next;
            sz++;
        }

        if(n ==sz){
            head = head.next; // RemoveFirst
            return;
        }

        // Sz-n
        int i = 1;
        int iToFind = sz - n;
        Node prev = head;
        while(i<iToFind){
            prev = prev.next;
            i++;
        }

        prev.next =prev.next.next;
        return;
    }

    // Slow-Fast Approach
    public Node findMid(Node head){ // Helper
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null){
            slow = slow.next; // +1
            fast = fast.next.next; // +2
        }
        return slow; // Slow is my midNode
    }

    public boolean checkPlaindrome(){
        if(head == null || head.next == null){
            return true;
        }
        // Step1 - find mid
        Node midNode = findMid(head);

        // Step2 - Reverse 2nd half
        Node prev = null;
        Node curr = midNode;
        Node next;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        Node right = prev; // Right half head
        Node left = head;

        // Step3 - check left half & right half
        while(right != null){
            if(left.data != right.data){
                return false;
            }
            left = left.next;
            right = right.next;
        }

        return true;
    }
    public static void main(String[] args){
        SD_03_Add_And_Remove_In_LL ll = new SD_03_Add_And_Remove_In_LL();
//        ll.addFirst(2);
//        // ll.print();
//        ll.addFirst(1);
//        // ll.print();
//        ll.addLast(4);
//        // ll.print();
//        ll.addLast(5);
//        // ll.print();
//        ll.add(2, 3);
//        ll.print(); // 1->2->3->4->5

        // System.out.println(ll.size);
//        ll.removeFirst();
//        ll.print();
//
//        ll.removeLast();
//        ll.print();
//        System.out.println(ll.size);

//        System.out.println(ll.itrSearch(3));
//        System.out.println(ll.itrSearch(10));

//        System.out.println(ll.recSearch(3));
//        System.out.println(ll.recSearch(10));

//        ll.reverse();
//        ll.print();


//        ll.deleteNthfromEnd(3);
//        ll.print();

        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(2);
        ll.addLast(1);

        ll.print(); // 1->2->2->1
        System.out.println(ll.checkPlaindrome());
    }
}
