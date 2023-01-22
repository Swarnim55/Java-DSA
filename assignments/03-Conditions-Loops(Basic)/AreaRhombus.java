package Assignment2;

import java.util.Scanner;

public class AreaRhombus {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        double base,height,area;
        System.out.println("Please enter the base of the Rhombus:");
        base = in.nextDouble();
        System.out.println("Please enter the height of the Rhombus:");
        height = in.nextDouble();
        area = base*height;
        System.out.println("The area of the Rhombus is:"+area);
    }
}
