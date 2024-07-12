//find greatest digit from a number

import java.util.Scanner;

public class program9 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a number");
        int num=s.nextInt();
        System.out.println("greatest digit : "+greatestDigit(num));

    }
    public static int greatestDigit(int num){// 1232
        int largest=num%10;
        num/=10;
        while (num!=0) {
            int digit=num%10;
            if(digit>largest){
                largest=digit;
            }
            num/=10;   
        }
        return largest;
    }
    
}
