package linearstruct;

import java.util.Scanner;

public class Stack {
	static int n;
    private int[] stack;
    private int top = -1;

    public void push(int element) {
        if (top == n-1) {
            System.out.println("Stack is full");
        } else {
            stack[++top] = element;
        }
    }

    public int pop() {
        if (top == -1) {
            System.out.println("Stack is empty");
            return -1;
        } else {
            return stack[top--];
        }
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public int size() {
        return top + 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack st = new Stack();
        System.out.print("Enter max size of stack: ");
        n = sc.nextInt();
        st.stack = new int[n];

        while (true) {
        	System.out.println("\t\tMENU\n");
            System.out.println("1: Push");
            System.out.println("2: Pop");
            System.out.println("3: Check if empty");
            System.out.println("4: Print size");
            System.out.println("5: Exit");
            int choice = sc.nextInt();

            if (choice == 1) {
                System.out.println("Enter element to push:");
                int element = sc.nextInt();
                st.push(element);
            } else if (choice == 2) {
                int popped = st.pop();
                if (popped != -1) {
                    System.out.println("Popped: " + popped);
                }
            } else if (choice == 3) {
                System.out.println(st.isEmpty() ? "Stack is empty" : "Stack is not empty");
            } else if (choice == 4) {
                System.out.println("Stack size: " + st.size());
            } else if (choice == 5) {
                break;
            }
        }
        sc.close();
    }
}

