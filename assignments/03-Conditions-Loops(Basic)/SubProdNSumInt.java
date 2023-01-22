package Assignment2;

import java.util.Scanner;

public class SubProdNSumInt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter a number:");
        int n = sc.nextInt();
        int prod = 1;
        int sum = 0;
        int result = 0;


        while(n > 0){
            int rem = n % 10;
            prod = prod * rem;
            sum = sum + rem;
            n = n / 10;
        }

        result = prod - sum;
        System.out.println("The result is: " + result);
    }
}
