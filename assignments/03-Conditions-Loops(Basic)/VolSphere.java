package Assignment2;

import java.util.Scanner;

public class VolSphere {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double r,v;
        System.out.println("Please Enter the radius of the Sphere");
        r = in.nextDouble();


        v = 1.33*3.14*r*r*r;
        System.out.println("The volume of the Sphere is:"+v);

    }
}
