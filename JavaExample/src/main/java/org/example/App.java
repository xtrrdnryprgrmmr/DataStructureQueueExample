package org.example;


import Queue.CircularQueue;
import Queue.Operation;

public class App {

    public static void main(String[] args) throws Exception {
        CircularQueue q1 = new CircularQueue(10);
        CircularQueue q2 = new CircularQueue(10);
        q1.enqueue(14);
        q1.enqueue(20);
        q1.enqueue(13);
        q1.enqueue(7);
        q1.enqueue(8);
        q1.enqueue(6);
        q1.enqueue(11);
        q1.enqueue(9);
        q1.enqueue(3);
        q1.enqueue(5);

        q2.enqueue("+");
        q2.enqueue("+");
        q2.enqueue("-");
        q2.enqueue("*");
        q2.enqueue("+");
        q2.enqueue("-");
        q2.enqueue("*");
        q2.enqueue("+");
        q2.enqueue("+");

        Operation op =new Operation();
        op.collectValueFromCircularQueue(q1,q2);
        op.orderAccountWithPriorityQueue();

    }

}