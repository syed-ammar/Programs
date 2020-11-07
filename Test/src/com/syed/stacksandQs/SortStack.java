package com.syed.stacksandQs;

import java.util.Arrays;

public class SortStack
{
    public static void main(String[] args) throws Exception
    {
        MyStack orgStack = new MyStack(5);
        orgStack.push(10);
        orgStack.push(5);
        orgStack.push(6);
        orgStack.push(7);
        orgStack.push(8);

        MyStack sortedStack = sort(orgStack);
        Arrays.stream(sortedStack.getData()).forEach(e -> System.out.println(e));
    }

    private static MyStack sort(MyStack orgStack) throws Exception
    {
        MyStack sortedStack = new MyStack(5);

        while (orgStack.getTop() != -1)
        {
            int element = orgStack.pop();
            while (sortedStack.getTop() != -1 && sortedStack.peek() > element)
            {
                orgStack.push(sortedStack.pop());
            }
            sortedStack.push(element);
        }

        return sortedStack;
    }
}
