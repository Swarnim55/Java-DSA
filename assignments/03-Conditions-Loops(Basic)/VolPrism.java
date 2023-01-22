package Assignment2;

import java.util.Scanner;

public class VolPrism {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double b,h,v;
        System.out.println("Please Enter the base of the prism");
        b = in.nextDouble();
        System.out.println("Please Enter the height of the prism");
        h = in.nextDouble();
        v = b*h;
        System.out.println("The volume of the prism is:"+v);

    }
}
