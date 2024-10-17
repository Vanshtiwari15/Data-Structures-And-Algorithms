package com.Queues_27;
import java.util.*;

public class SD_04_Queue_Using_JCF{
    public static void main(String[] args) {
        // Queue q = new Queue();
        Queue<Integer> q = new LinkedList<>(); // ArrayDeque
        // Queue<Integer> q = new ArrayDeque<>();
        q.add(1);
        q.add(2);
        q.add(3);

        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}

