package Assignment2;

import java.util.Scanner;

public class Factors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number");
        int num = sc.nextInt();

        int count = 1;
        // find factors
        System.out.print("Factors of: "+num+" = ");
        while(count <= num){

            if(num % count == 0){
                System.out.print(count+" ");
            }
            count++;
        }
    }
}
