/*
 * We have a concept called a "Zigzag Number." 
A Zig-zag Number is formed by interleaving the digits of two 
equal-length input numbers.
Given two input numbers, determine the Zigzag Number and print 
the output
Explanation:
The candidate should recognize the interleaving pattern:
Take the first digit from the first input number.
Take the last digit from the second input number.
Continue this process alternately until all digits from both 
numbers are used.
This explanation demonstrates their understanding of the 
interleaving process used to form a Zigzag Number.

Test Case 1: 

	Input 1 : 927
	Input 2 : 613
	Output : 932176

Test Case 2: 

	Input 1 : 514
	Input 2 : 706
	Output : 561047

Test Case 3: 

	Input 1 : 32
	Input 2 : 190
	Output : Invalid

 */

import java.util.Scanner;

public class program11 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter first number:");
        //step1 take 2 inputs
        int num1=s.nextInt();//927 becomes 729
        System.out.println("Enter first number:");
        int num2=s.nextInt();//613
        int n2=num2;


        //step 2 reverse num1
        int rev=0;
        int count1=0;
        int count2=0;
        while (num1!=0) {
            count1++;
            int d=num1%10;
            rev=rev*10+d;
            num1/=10; 
        }
        int n1=rev;

        while (num2!=0) {
            count2++;
            num2/=10; 
        }
        

        if(count1==count2){
            while (n1!=0 && n2!=0) {
                    int d1=n1%10;
                    System.out.print(d1+"");
                    int d2=n2%10;
                    System.out.print(d2+"");
                    n1/=10;
                    n2/=10;     
            }
        }
        else{
            System.out.println("Invalid");
        }

    }
}
