package Assignment2;

import java.util.Scanner;

public class PeriRhombus {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double l,p;
        System.out.println("Please enter the length of side of a rhombus");
        l = in.nextDouble();
        p= l*4;
        System.out.println("The perimeter of the rhombus is:"+p);
    }
}
