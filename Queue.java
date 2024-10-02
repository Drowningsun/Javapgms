package linearstruct;

import java.util.Scanner;

public class Queue {
    private int[] queue;
    private int front, rear, size;

    public Queue() {
        size = 5;
        queue = new int[size];
        front = rear = -1;
    }

    public Queue(int size) {
        this.size = size;
        queue = new int[size];
        front = rear = -1;
    }

    public void enqueue(int element) {
        if (rear == size - 1) {
            System.out.println("Queue is full");
        } else {
            if (front == -1) front = 0;
            queue[++rear] = element;
        }
    }

    public int dequeue() {
        if (front == -1 || front > rear) {
            System.out.println("Queue is empty");
            return -1;
        } else {
            return queue[front++];
        }
    }

    public void display() {
        if (front == -1 || front > rear) {
            System.out.println("Queue is empty");
        } else {
            System.out.print("Queue elements: ");
            for (int i = front; i <= rear; i++) {
                System.out.print(queue[i] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter max size of queue: ");
        int size = sc.nextInt();
        Queue queue = new Queue(size);

        while (true) {
            System.out.println("\t\tMENU\n");
            System.out.println("1: Enqueue");
            System.out.println("2: Dequeue");
            System.out.println("3: Display");
            System.out.println("4: Exit");
            int choice = sc.nextInt();

            if (choice == 1) {
                System.out.println("Enter element to enqueue:");
                int element = sc.nextInt();
                queue.enqueue(element);
            } else if (choice == 2) {
                int dequeued = queue.dequeue();
                if (dequeued != -1) {
                    System.out.println("Dequeued: " + dequeued);
                }
            } else if (choice == 3) {
                queue.display();
            } else if (choice == 4) {
                break;
            }
        }
        sc.close();
    }
}
