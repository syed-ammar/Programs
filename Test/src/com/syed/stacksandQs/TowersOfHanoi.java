package com.syed.stacksandQs;

public class TowersOfHanoi {

    public static void main(String args[]){
        MyStack source = new MyStack(5);
        MyStack dest = new MyStack(5);
        MyStack aux = new MyStack(5);

        try{
            source.push(3);
            source.push(2);
            source.push(1);
            move(3, source, aux, dest);
            System.out.println();
        } catch (Exception ex){
            ex.printStackTrace();
        }


    }
    private static void move(int n, MyStack source, MyStack aux, MyStack dest) {

        try {
            if (n == 1) {
                dest.push(source.pop());
                System.out.println("Move from source"+ source +" to dest "+dest);
                return;
            }
            move(n - 1, source, dest, aux);
            dest.push(source.pop());
            System.out.println("Move from source"+ source +" to dest "+dest);
            move(n - 1, aux, source, dest);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}


