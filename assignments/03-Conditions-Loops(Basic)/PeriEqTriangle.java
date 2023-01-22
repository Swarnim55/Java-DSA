package Assignment2;

import java.util.Scanner;

public class PeriEqTriangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double s,peri;
        System.out.println("Please enter the length of the side of the triangle:");
        s = in.nextDouble();
        peri = 3 * s;
        System.out.println("The perimeter of the equilateral triangle is:" +peri);
    }
}
