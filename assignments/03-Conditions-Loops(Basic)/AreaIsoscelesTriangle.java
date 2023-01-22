package Assignment2;

import java.util.Scanner;

public class AreaIsoscelesTriangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double a,b,c,s,area;
        System.out.println("Please enter the two equal side of the isosceles triangle");
        a = in.nextDouble();
        b = a;
        System.out.println("Please enter the remaining side of the triangle:");
        c = in.nextDouble();
        double great = Math.max(a,c);
        System.out.println("longest side:"+ great);
        if(a == great) {
            if (a + c > great) {
                System.out.println("Isosceles triangle");
                s = (a+b+c)/2;
                double temp  = s*(s-a)*(s-b)*(s-c);
                area = Math.sqrt(temp);
                System.out.println("The area of isosceles triangle is: "+ area);
            } else {
                System.out.println("Doesnot Satisfy Property of Triangle: Sum ofTwo sides is not greater than longest side");
            }
        }
        if(c == great){
            if (a + b > great) {
                System.out.println("Isosceles triangle");
                s = (a+b+c)/2;
                double temp  = s*(s-a)*(s-b)*(s-c);
                area = Math.sqrt(temp);
                System.out.println("The area of isosceles triangle is: "+ area);
            } else {
                System.out.println("Doesnot Satisfy Property of Triangle: Sum of Two sides is not greater than longest side");
            }
        }
    }
}
