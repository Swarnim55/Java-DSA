package Assignment2;

import java.util.Scanner;

public class VolPyramid {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double b,h,v;
        System.out.println("Please Enter the base area of the pyramid");
        b = in.nextDouble();
        System.out.println("Please Enter the height of the pyramid");
        h = in.nextDouble();
        v = 0.3333333333*b*b*h;
        System.out.println("The volume of the pyramid is:"+v);

    }
}
