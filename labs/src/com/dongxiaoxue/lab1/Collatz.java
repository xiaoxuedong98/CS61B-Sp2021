package com.dongxiaoxue.lab1;

public class Collatz {
    public static int nextNumber(int n) {
        if (n == 1) {
            return n;
        }
        if (n % 2 == 0) {
            n = n / 2;
        } else {
            n = 3 * n + 1;
        }
        return n;
    }
    public static void main(String [] args){
        int n = 5;
        System.out.println(n + " ");
        while (n!= 1){
            n = nextNumber(n);
            System.out.println(n + " ");
        }
        System.out.println();
    }

}
