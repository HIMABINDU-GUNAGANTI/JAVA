/*
 * 
You are developing a math learning application that includes a 
feature to help students identify and understand special numbers.

A special number is defined as a positive integer with m digits, 
that equals the sum of its digits, each raised to the power of m.
To determine if a number is special:
Calculate the number of digits m.
Compute the sum of each digit raised to the power of m.
Check if this sum equals the original number.

Explanation:

Number: 153

It has 3 digits (m=3)

Sum of Digits Raised to the Power of m:
=1^3+5^3+3^3
=1+125+27=>153
=153=153

 */

import java.util.Scanner;

public class program12 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);

        //step1 take 1 input
        int num=s.nextInt();
        int n=num;
        int n1=num;

        //step 2 Finding count 
        int count=0;
        while (num!=0) {
            count++;
            num/=10;  
        }
        int sum=0;
        while (n!=0) {
            int digit=n%10;
            int power=1;
            for(int i=1;i<=count;i++){
                 power=power*digit;
            }
            sum=sum+power;
            n/=10;    
        }
        if(n1==sum){
            System.out.println("Arm Strong");
        }
        else{
            System.out.println("Not ");
        }
    }
    
}
