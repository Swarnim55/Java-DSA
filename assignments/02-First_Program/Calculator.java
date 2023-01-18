package Assignment1;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char op;
        int num1,num2,val=0;
        System.out.println("Please Enter an operator (+-/*)");
        op = in.next().trim().charAt(0);
        System.out.println("Please Enter First Number: ");
        num1 = in.nextInt();
        System.out.println("Please Enter Second Number:");
        num2 = in.nextInt();

        if(op == '+'){
            val = num1+num2;

        } else if (op == '-') {
            val = num1-num2;

        } else if (op == '*') {
            val = num1*num2;
        } else if (op == '/') {
            val = num1/num2;
        }
        else{
            System.out.println("invalid input");
        }

        System.out.println("The value is: "+val);

    }
}
