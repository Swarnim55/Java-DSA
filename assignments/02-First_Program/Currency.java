package Assignment1;

import java.util.Scanner;

public class Currency {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double cur,curval;
        System.out.println("Please enter the value in NPR:");
        cur = in.nextDouble();
        curval = cur / 127.23;
        System.out.println("The value in USD is: "+curval);
    }
}
