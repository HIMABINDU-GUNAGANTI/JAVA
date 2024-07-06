//2>Write a java program to find whether the given integer number in Buzz number or not. Buzz number is a number that ends with digit 7 or divisible by 7.
// Example :  42 is a Buzz number because it is divisible by 7.
// 107 is a Buzz number because it ends with 7.

import java.util.Scanner;

public class program17 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        //step1 input 
        int num=s.nextInt();
        //step2 is num is divisible by 7 or last digit with 7
        if(divisible(num)== true || lastDigit(num)==true){
            System.out.println("it is buzz number");
        }
        else{
            System.out.println("not buzz");
        }   
    }
    public static boolean divisible(int num){
        if(num%7==0){
            return true;
        }
        else{
            return false;
        }         

    }
    public static boolean lastDigit(int num){
       
            int d=num%10;    
            if(d==7){
                return true;
            }
            else{
                return false;
            }
    }

    
}
