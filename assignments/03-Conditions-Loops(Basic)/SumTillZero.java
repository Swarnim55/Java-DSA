package Assignment2;

import java.util.Scanner;

public class SumTillZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        while(true){
            System.out.println("Please enter a number (press 0 to end)");
            int n = sc.nextInt();
            if(n!=0){
                sum = sum + n;
            }else{
                break;
            }
        }
        System.out.println("Total sum: "+sum);


    }
}
