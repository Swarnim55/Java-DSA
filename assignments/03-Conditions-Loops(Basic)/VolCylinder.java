package Assignment2;

import java.util.Scanner;

public class VolCylinder {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double r,h,v;
        System.out.println("Please Enter the radius of the cylinder");
        r = in.nextDouble();
        System.out.println("Please Enter the height of the cylinder");
        h = in.nextDouble();
        v = 3.14*r*r*h;
        System.out.println("The volume of the cylinder is:"+v);

    }
}
