package Assignment1;

import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        int rem,num2=0;
        Scanner in = new Scanner(System.in);
        System.out.println("Please Enter a Number:");
        int num = in.nextInt();
        int temp = num;
        while(num %10 != 0)
        {
            rem = num %10;
            num2 = num2 * 10 + rem;
            num = num / 10;


        }
        if(num2 == temp)
        {
            System.out.println(temp+" is Palindrome");
        }
        else {
            System.out.println(temp+" is Not Palindrome");
        }
    }
}
