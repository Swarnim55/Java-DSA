package Assignment2;

import java.util.Scanner;

public class PeriCircle {
    public static void main(String[] args)
    {
        Scanner in = new Scanner (System.in);
        double radius,area;
        System.out.println("Please enter the radius of the circle:");
        radius = in.nextDouble();
        area = 2* 3.14* radius;
        System.out.println("The perimeter of the circle is:" +area);
    }
}
