package Assignment2;

import java.util.Scanner;

public class LargestTillZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int largest = 0;
        while (true){
            System.out.println("Please enter a number (press 0 to end)");
            int temp = sc.nextInt();
            if(temp !=0) {
                if (temp > largest) {
                    largest = temp;
                }
            }
            else{
                break;
            }
        }
        System.out.println("The largest entry is: "+ largest);
    }
}
