package com.syed.recursion;

public class Factorial {

    public static void main(String args[]){
        //System.out.println("Result : "+factorial(5));

        factorialOfLargeNumber(100);

    }

    private static long factorial(int num)
    {
        System.out.println(num);
        if(num == 0)
        {
            return 1;
        }

        return num * factorial(num-1);
    }

    private static Integer[] factorialOfLargeNumber(int num)
    {
        Integer arr[] = new Integer[500];
        int currSize = 1;

        arr[0] = 1;
        for(int i = 2 ; i<=num ; i++)
        {
            currSize = calculate(i, currSize, arr);
        }

        for(int i = currSize - 1 ; i >=0 ; i--)
        {
            System.out.print(arr[i]);
        }

        return arr;
    }

    private static int calculate(int currElement, int currSize, Integer[] arr)
    {
        int product;
        int carry = 0;

        /*Store the result in an array, if the result of the multiplication is multiple digits
        * split them and store it in individual index of an array*/
        
        for(int i = 0; i<currSize; i++)
        {
            product = currElement * arr[i] + carry;
            arr[i] = product % 10;
            carry = product / 10;
        }

        while (carry > 0)
        {
            arr[currSize] = carry % 10;
            carry = carry / 10;
            currSize++;
        }

        return currSize;
    }
}
