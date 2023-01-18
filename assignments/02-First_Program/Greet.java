package Assignment1;

import java.util.Scanner;

public class Greet {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please Enter your Name");
        String name = in.nextLine();
        System.out.println("Welcome to JAVA World, "+name);
    }
}
