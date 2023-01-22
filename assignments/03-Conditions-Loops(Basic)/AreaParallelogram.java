package Assignment2;

import java.util.Scanner;

public class AreaParallelogram {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        double base,height,area;
        System.out.println("Please enter the base of the parallelogram:");
        base = in.nextDouble();
        System.out.println("Please enter the height of the parallelogram:");
        height = in.nextDouble();
        area = base*height;
        System.out.println("The area of the parallelogram is:"+area);
    }
}
