//Write a program to take two number from user and check who is max.

import java.util.Scanner;

public class program2 {
    public static void main(String[] args) {
        int num1,num2;
        System.out.println("Enter two numbers");
        Scanner s=new Scanner(System.in);
        num1=s.nextInt();
        num2=s.nextInt();

        if(num1==num2){
            System.out.println("Both are equal");
        }
        else if(num1>num2){
            System.out.println(num1+" is max");
        }
        else{
            System.out.println(num2+" is max");
        }
    }
    
}
