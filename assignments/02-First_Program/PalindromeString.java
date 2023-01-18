package Assignment1;

import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ex = sc.next();
        int length = ex.length();
        String rev = "";
        for(int i = length-1; i >= 0; i--){
            char rem = ex.charAt(i);
            rev = rev + rem;
        }
        System.out.println("Reverse of: "+ex+" is: "+ rev);
        if(rev.equals(ex)){
            System.out.println("So, "+ex+"  is palindrome");
        }
        else{
            System.out.println("So, "+ex+"  is not a palindrome");
        }
    }
}
