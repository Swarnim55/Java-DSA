package Assignment2;

import java.util.Scanner;

public class TSACube {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Please enter the side length of a cube:");
        double a = sc.nextDouble();
        double TSA = 6* (Math.pow(a,2));
        System.out.println("The total surface area of the cube is: "+TSA);
    }
}
