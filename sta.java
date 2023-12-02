package javaproject1;

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class Stack {
    Node top;

    public Stack() {
        this.top = null;
    }

    public boolean isEmpty() {
        return top == null;
    }

    public void push(int data) {
        Node newNode = new Node(data);
        newNode.next = top;
        top = newNode;
        System.out.println(data + " pushed to stack");
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack underflow");
            return Integer.MIN_VALUE;
        }
        int popped = top.data;
        top = top.next;
        return popped;
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return Integer.MIN_VALUE;
        }
        return top.data;
    }
}

public class sta {
    public static void main(String[] args) {
        Stack stack = new Stack();
        
        stack.push(5);
        stack.push(10);
        stack.push(15);

        System.out.println("Top element: " + stack.peek()); // Output: 15

        System.out.println("Popped element: " + stack.pop()); // Output: 15
        System.out.println("Popped element: " + stack.pop()); // Output: 10

        stack.push(20);
        System.out.println("Top element after push: " + stack.peek()); // Output: 20
    }
}
