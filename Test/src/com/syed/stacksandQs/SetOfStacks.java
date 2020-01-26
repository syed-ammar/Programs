package com.syed.stacksandQs;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class SetOfStacks {
    private static List<MyStack> sos = new ArrayList<MyStack>();

    public static void main(String args[]){
        push(10);
        push(5);
        push(6);
        push(7);
        push(8);
        try {
            pop(0);
        } catch (Exception e) {
            e.printStackTrace();
        }
        sos.forEach(System.out::println);
    }

    private static void push(int val)
    {
        MyStack currStack;
        if(sos.size()>0) {
            currStack = sos.get(sos.size()-1);
            if(currStack.getTop() == currStack.getMaxSize()-1){
                System.out.println("Creating new stack ");
                currStack = createNewStack();
                sos.add(currStack);
            }
            /*May be delegte this operations to MyStack class?*/
            currStack.setTop(currStack.getTop()+1);
            currStack.getData()[currStack.getTop()] = val;
        } else {
            currStack = createNewStack();
            sos.add(currStack);
            currStack.setTop(currStack.getTop()+1);
            currStack.getData()[currStack.getTop()] = val;
        }

    }

    private static int pop(int fromStack) throws Exception {
        MyStack currStack;
        int poppedValue = 0;
        if(sos.size()>0){
            currStack = sos.get(fromStack);
            if(currStack == null || currStack.getTop() == -1){
                throw new Exception("Invalid stack or Stack is empty");
            }
            poppedValue = currStack.getData()[currStack.getTop()];
            currStack.getData()[currStack.getTop()] = null;
            currStack.setTop(currStack.getTop()-1);
        }
        return poppedValue;
    }

    private static MyStack createNewStack() {
        return new MyStack();
    }
}
