package Assignment2;

import java.util.Scanner;

public class CSACylinder {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double r,h,v;
        System.out.println("Please Enter the radius of the cylinder");
        r = in.nextDouble();
        System.out.println("Please Enter the height of the cylinder");
        h = in.nextDouble();
        v = 2*3.14*r*h;
        System.out.println("The Curved Surface Area of the cylinder is:"+v);

    }
}
