package com.syed.arraysandstring;

public class MinNumberOfJumps
{
    public static void main(String[] args) {
        int arr[] = {1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9};
        System.out.println(minJumps(arr,arr.length));
    }

    private static int minJumps(int arr[], int size)
    {
        int minJumpCount = 0;
        int i = 0;
        if(size == 0)
            return -1;
        while (i < size - 1)
        {
            i = i + arr[i];
            minJumpCount++;
        }
        return minJumpCount;
    }
}
