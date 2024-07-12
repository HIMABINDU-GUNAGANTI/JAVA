//write a program to check whether the sum of the digits are equals to product of digits

import java.util.Scanner;

public class program10 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a number");
        int num=s.nextInt();
        
        int sum=0;
        int product=1;
        while (num!=0) {
            int digit=num%10;
            sum=sum+digit;
            product=product*digit;
            num/=10;
        }
        System.out.println(sum);
        System.out.println(product);
        if(sum==product){
            System.out.println("perfect number");
        }
       else{
            System.out.println("not a perfect number");
        }


    }
    
}
