package Assignment2;

import java.util.Scanner;

public class PeriParallelogram {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double l,w,p;
        System.out.println("Please enter the length and width of a parallelogram");
        l = in.nextDouble();
        w = in.nextDouble();
        p= 2*(l+w);
        System.out.println("The perimeter of the parallelogram is:"+p);
    }
}
