package Assignment1;

import java.util.Scanner;

public class Evenodd {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please Enter a number:");
        int num = in.nextInt();
        if(num%2==0)
        {
            System.out.println(num+" is an Even Number.");
        }
        else {
            System.out.println(num+" is an Odd Number");
        }
    }
}
