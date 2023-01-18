package Assignment1;

import java.util.Scanner;
import java.lang.Math;
public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter The Starting Number: ");
        int a = sc.nextInt();
        System.out.println("Please Enter the Ending Number");
        int b = sc.nextInt();
        for (int i = a; i<=b; i++){
            int temp = i;
            int count = 0;
            int sum = 0;
            // Find the no of digits in integer
            while (temp > 0){
                temp = temp / 10;
                count ++;
            }
            // Raise each digit of Integer with count as power
            temp = i;
            while (temp > 0){
                int rem = temp % 10;
                sum = (int) (sum + Math.pow(rem, count));
                temp = temp / 10;
            }
            // Verify if Armstrong or not & Display if Armstrong
            if(sum == i){
                System.out.println(i);
            }


        }

    }
    }

