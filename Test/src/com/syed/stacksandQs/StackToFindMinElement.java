package com.syed.stacksandQs;

import java.util.Arrays;

public class StackToFindMinElement {

    private final Integer[] stack = new Integer[10];
    private int top = -1;
    private int topForMin = -1;
    private final Integer[] stackWithMinElements = new Integer[10];

    public static void main(String[] args)
    {
        StackToFindMinElement minStack = new StackToFindMinElement();
        try {
            minStack.push(10);
            minStack.push(5);
            minStack.push(6);
            minStack.push(7);
            minStack.push(8);
            Arrays.stream(minStack.stackWithMinElements).forEach(element -> System.out.println(element));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void push(int value) throws Exception {
        if(top == 10) {
            throw new Exception("com.syed.stacksandQs.Stack is full");
        }

        if(topForMin == -1 || value < min()){
            stackWithMinElements[++topForMin] = value;
        }
        stack[++top] = value;
    }

    private int pop() throws Exception {
        if(top == -1){
            throw new Exception("com.syed.stacksandQs.Stack is empty");
        }
        int poppedValue = stack[top--];
        if(poppedValue == stackWithMinElements[topForMin])
        {
            stackWithMinElements[topForMin--] = null;
        }
        return poppedValue;
    }

    private int min() throws Exception {
        if(topForMin == -1){
            throw new Exception("com.syed.stacksandQs.Stack is empty");
        }
        return stackWithMinElements[topForMin];
    }
}
