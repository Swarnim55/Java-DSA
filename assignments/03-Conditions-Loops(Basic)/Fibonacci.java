package Assignment2;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Fibonacci upto: ? ");
        int count = in.nextInt();

        int a =0;
        int b = 1;
        int n =2;
        System.out.print(" "+a);
        System.out.print(" "+b);
        while(n <= count)
        {
            int temp = b;
            b = b+a;
            a = temp;
            System.out.print(" "+b);
            n = n+1;
        }


    }
}
