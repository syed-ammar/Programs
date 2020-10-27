package com.syed.stacksandQs;

import java.util.Arrays;

public class MyStack {
    private int top = -1;

    public  int getMaxSize() {
        return MAX_SIZE;
    }

    private int MAX_SIZE = 3;
    private Integer[] data = new Integer[MAX_SIZE];

    public Integer[] getData() {
        return data;
    }

    public int getTop() {
        return top;
    }

    public MyStack(int MAX_SIZE) {
        this.MAX_SIZE = MAX_SIZE;
    }

    @Override
    public String toString() {
        return "MyStack{" +
                "top=" + top +
                ", data=" + Arrays.toString(data) +
                '}';
    }

    public void setTop(int top) {
        this.top = top;
    }

    public void setData(Integer[] data) {
        this.data = data;
    }

    public void push(int val) throws Exception {
        if(top == MAX_SIZE) {
            throw new Exception("Stack overflow");
        }
        top+=1;
        data[top] = val;
    }

    public int pop() throws Exception {
        if(top == -1){
            throw new Exception("Stack is empty");
        }
        int val = data[top];
        data[top] = null;
        top-=1;
        return val;
    }

    public int peek() throws Exception {
        if(top == -1){
            throw new Exception("Stack is empty");
        }
        return data[top];
    }
}
