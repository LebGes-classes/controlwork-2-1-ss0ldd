package org.example;

public class CustomStack<T> {
    private int maxSize;
    private int top;
    private T[] stackArray;

    public CustomStack(int size) {
        this.maxSize = size;
        this.stackArray = (T[]) new Object[maxSize];
        this.top = -1;
    }

    public void push(T value) {
        if (isFull()) {
            System.out.println("Стек полон.");
        } else {
            stackArray[++top] = value;
        }
    }

    public boolean isFull() {
        if (top == maxSize - 1) {
            return true;
        }
        return false;
    }

    public T pop() {
        if (isEmpty()) {
            System.out.println("Стек пустой");
            return null;
        } else {
            return stackArray[top--];
        }
    }

    public boolean isEmpty() {
        if (top == -1) {
            return true;
        }
        return false;
    }

    public T peek() {
        if (isEmpty()) {
            System.out.println("Стек пуст...");
            return null;
        } else {
            return stackArray[top];
        }
    }

    public static void main(String[] args) {
        CustomStack stack = new CustomStack(5);

        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println("Верхний элемент стека: " + stack.peek());

        System.out.println("Извлеченный элемент: " + stack.pop());
        System.out.println("Извлеченный элемент: " + stack.pop());
    }
}