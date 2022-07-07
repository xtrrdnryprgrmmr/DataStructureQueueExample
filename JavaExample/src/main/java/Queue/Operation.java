package Queue;

import java.util.Scanner;

public class Operation {
    public void collectValueFromCircularQueue(CircularQueue integers, CircularQueue operators) {
        while (!integers.isEmpty() && !operators.isEmpty())
        {
            int number1 = (Integer) integers.dequeue();
            int number2 = (Integer) integers.dequeue();
            String opr = (String) operators.dequeue();
            int result = 0;
            if (opr == "+")      result = number1 + number2;
            else if (opr == "-") result = number1 - number2;
            else                 result  = number1 * number2;

            integers.enqueue(result);
            for (int i = 0; i < integers.size(); i++)
            {
                System.out.print(" " + integers.peek());
                integers.enqueue(integers.dequeue());
            }
            for (int i = 0; i < operators.size(); i++)
            {
                System.out.print(" " + operators.peek());
                operators.enqueue(operators.dequeue());
            }
        }

        System.out.print("\n\nFinal Result : " + integers.peek());
    }

    public void orderAccountWithPriorityQueue() {
        PriorityQueue priorityQueue = new PriorityQueue(5);
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter first username");
        String firstUserName = myObj.nextLine();
        System.out.println("Enter first account information");
        String firstBankAccount = myObj.nextLine();
        priorityQueue.enqueue(new QueueElement(firstUserName, Integer.parseInt(firstBankAccount)));
        System.out.println("Enter second username");
        String secondUserName = myObj.nextLine();
        System.out.println("Enter second account information");
        String secondBankAccount = myObj.nextLine();
        priorityQueue.enqueue(new QueueElement(secondUserName, Integer.parseInt(secondBankAccount)));
        System.out.println("Enter third username");
        String thirdUserName = myObj.nextLine();
        System.out.println("Enter third account information");
        String thirdBankAccount = myObj.nextLine();
        priorityQueue.enqueue(new QueueElement(thirdUserName, Integer.parseInt(thirdBankAccount)));
        System.out.println("Enter fourth username");
        String fourthUserName = myObj.nextLine();
        System.out.println("Enter fourth account information");
        String fourthBankAccount = myObj.nextLine();
        priorityQueue.enqueue(new QueueElement(fourthUserName, Integer.parseInt(fourthBankAccount)));
        System.out.println("Enter fifth username");
        String fifthUserName = myObj.nextLine();
        System.out.println("Enter fifth account information");
        String fifthBankAccount = myObj.nextLine();
        priorityQueue.enqueue(new QueueElement(fifthUserName, Integer.parseInt(fifthBankAccount)));
        System.out.print("Front ");
        while (!priorityQueue.isEmpty()) {
            System.out.print((Object) priorityQueue.dequeue().getData() + " ");
        }
        System.out.println("End");
    }
}
