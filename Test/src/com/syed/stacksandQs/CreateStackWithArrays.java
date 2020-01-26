package com.syed.stacksandQs;

import java.util.Arrays;

public class CreateStackWithArrays
{
    private static Integer[] sp = {-1, -1, -1}; // Stack pointers

    private static Integer[] ss; // Size of each stack

    private static Integer[] stack;

    private static void initialize(int arrSize)
    {
        stack = new Integer[arrSize];
        int n = arrSize/3;

        ss = new Integer[]{n,n,arrSize - (2*n)};
    }
    public static void main(String[] args)
    {
        initialize(10);
        push(0,10);
        push(0,11);
        push(0,2);
        push(0,3);
        push(1,12);
        Arrays.stream(stack).forEach(a -> System.out.println(a));
    }

    private static void push(final int stackNum, final int value)
    {
        if(stackNum > ss.length)
        {
            System.out.println("Stack not found");
            return;
        }

        try {
            int index = findIndexWithOverlap(stackNum);
            stack[index] = value;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    private static int findIndex(final int stackNum) throws Exception {
        int totalSize = 0;
        if(sp[stackNum] >= ss[stackNum]-1){
            throw new Exception("Stack "+stackNum+" is full");
        }
        totalSize = findBaseIndexOfCurrStack(stackNum);

        return totalSize + ++sp[stackNum];
    }

    private static int findIndexWithOverlap(final int stackNum) throws Exception {
        int totalSize = 0;
        if (sp[stackNum] == ss[stackNum]-1){
            if(stackNum < ss.length/*This condition is to check if it is a last stack*/
                    && sp[stackNum +1] < ss[stackNum +1]){
                shiftAndUpdateNextStack(stackNum+1);
            } else {
                throw new Exception("Stack is full");
            }
        }

        totalSize = findBaseIndexOfCurrStack(stackNum);

        return totalSize + ++sp[stackNum];
    }

    private static void shiftAndUpdateNextStack(final int stackToBeUpdated) {
        int base = findBaseIndexOfCurrStack(stackToBeUpdated);
        for(int i=base+sp[stackToBeUpdated]+1; i>base ; i--){
            stack[i] = stack[i-1];
        }
        ss[stackToBeUpdated]--;
        ss[stackToBeUpdated-1]++;
    }

    private static int findBaseIndexOfCurrStack(final int stackToBeUpdated) {
        int totalSize =0;
        for(int i =0;i<stackToBeUpdated;i++){
            totalSize = totalSize + ss[i];
        }
        return totalSize;
    }
}
