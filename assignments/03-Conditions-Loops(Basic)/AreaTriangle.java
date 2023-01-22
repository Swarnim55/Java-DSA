package Assignment2;

import java.util.Scanner;

public class AreaTriangle {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        double base,height,area;
        System.out.println("Please enter the base of the triangle:");
        base = in.nextDouble();
        System.out.println("Please enter the height of the triangle:");
        height = in.nextDouble();
        area = 0.5*base*height;
        System.out.println("The area of the triangle is:"+area);
    }
}
