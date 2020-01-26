package com.syed.stacksandQs;

public class StackToFindMinElement {

    private Integer stack[] = new Integer[10];
    private int top = -1;
    private int topForMin = -1;
    private int stackWithMinElements[];

    public static void main(String args){

    }

    private void push(int value) throws Exception {
        if(top == 10) {
            throw new Exception("Stack is full");
        }

        if(value < min()){
            stackWithMinElements[++topForMin] = value;
        }
        stack[++top] = value;
    }

    private int pop() throws Exception {
        if(top == -1){
            throw new Exception("Stack is empty");
        }
        return stack[top--];
    }

    private int min() throws Exception {
        if(topForMin == -1){
            throw new Exception("Stack is empty");
        }
        return stackWithMinElements[topForMin];
    }
}
