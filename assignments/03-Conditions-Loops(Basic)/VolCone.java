package Assignment2;

import java.util.Scanner;
public class VolCone {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double r,h,v;
        System.out.println("Please Enter the radius of the cone");
        r = in.nextDouble();
        System.out.println("Please Enter the height of the cone");
        h = in.nextDouble();
        v = 0.33*3.14*r*r*h;
        System.out.println("The volume of the con is:"+v);

    }
}
