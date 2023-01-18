package Assignment1;

import java.util.Scanner;

public class lcm_hcf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int hcf =0;
        int lcm =0;
        int min = (num1>num2) ? num2: num1;
        int i =1;
        while(i<=min){
            if(num1%i == 0 && num2%i == 0){
                hcf = i;
            }
            i = i+1;

        }
        lcm = (num1*num2)/hcf;
        System.out.println("HCF: "+ hcf+ " LCM: "+ lcm);
    }
}
