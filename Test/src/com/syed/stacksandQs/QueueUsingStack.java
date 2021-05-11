package com.syed.stacksandQs;

public class QueueUsingStack
{
    private final MyStack myStack1 = new MyStack(5);
    private final MyStack myStack2 = new MyStack(5);

    public void add(int val)
    {
        try {
            while (myStack2.getTop() != -1)
            {
                myStack1.push(myStack2.pop());
            }
            myStack1.push(val);
            while (myStack1.getTop() != -1)
            {
                myStack2.push(myStack1.pop());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public int poll()
    {
        int ret = 0;
        try {
            ret = myStack2.pop();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ret;
    }

}
