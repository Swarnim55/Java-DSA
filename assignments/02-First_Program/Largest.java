package Assignment1;

import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n1,n2;
        System.out.println("Please Enter two numbers:");
        n1 = in.nextInt();
        n2 = in.nextInt();
        if(n1 > n2){
            System.out.println("The largest number is: "+n1);
        }else{
            System.out.println("The largest number is: "+n2);
        }
    }
}
