package Assignment1;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = 0;
        int b = 1;
        int c = 2;
        System.out.println("Please Enter the nth number for the fibonacci series:");
        int n = in.nextInt();
        System.out.print(a+" ");
        System.out.print(b+" ");
        while(c<=n){
            int temp = b;
            b = b+a;
            a = temp;
            c = c+1;
            System.out.print(b+" ");

        }



    }
}
