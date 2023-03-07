package com.syed.arraysandstring;

import java.util.HashSet;
import java.util.Set;

public class ElementsInTheRange
{
    public static void main(String[] args) {
        int arr[] = {1, 4, 5, 2, 7, 8, 3};
        System.out.println(checkRange(arr, 2, 6));
    }

     private static boolean checkRange(int[] arr, int lowerLimit, int upperLimit)
    {
        boolean flag = false;
        int totalElement = (upperLimit - lowerLimit) + 1;
        int currentCount = 0;
        Set uniqueElements = new HashSet<Integer>();
        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i] >= lowerLimit && arr[i] <= upperLimit)
            {
                if(uniqueElements.add(arr[i])){
                    currentCount++;
                }
            }
        }
        if(totalElement == currentCount){
            flag = true;
        }
        return flag;
    }
}
