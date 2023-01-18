package Assignment1;

import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int p, t, r, si;
        System.out.println("Please Enter Principal Amount");
        p = in.nextInt();
        System.out.println("Please Enter Time ");
        t = in.nextInt();
        System.out.println("Please Enter Rate %");
        r = in.nextInt();
        si = (p*t*r)/100;
        System.out.println("The Simple Interest is: "+si);
    }
}
