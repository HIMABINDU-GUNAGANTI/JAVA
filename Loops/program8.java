//reverse a number using method

import java.util.Scanner;

public class program8 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a number");
        int num=s.nextInt();
        System.out.println(reverseNum(num));
    }
    public static int reverseNum(int num) {
        int rev=0;
        while (num!=0) {
            int d=num%10;
            rev=rev*10+d; 
            num=num/10; 
        }   
        return rev;
    }
}
