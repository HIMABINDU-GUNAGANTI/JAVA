//Write a program for checking enter number is even or odd.

import java.util.Scanner;

class Program1{
    public static void main(String[] args) {
        int num;
        Scanner s=new Scanner(System.in);
        num=s.nextInt();
        if(num%2==0){
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }
    }
    
}