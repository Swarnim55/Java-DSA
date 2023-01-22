package Assignment2;

import java.util.Scanner;

public class AreaCircle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the radius of the circle");
        double radius = in.nextDouble();
        double area = 3.14*Math.pow(radius,2);
        System.out.println("The area of the circle is: "+area);
    }
}
