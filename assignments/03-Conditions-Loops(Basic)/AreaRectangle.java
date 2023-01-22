package Assignment2;

import java.util.Scanner;

public class AreaRectangle {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        double width,height,area;
        System.out.println("Please enter the width of the rectangle:");
        width = in.nextDouble();
        System.out.println("Please enter the height of the rectangle:");
        height = in.nextDouble();
        area = width*height;
        System.out.println("The area of the rectangle is:"+area);
    }
}
