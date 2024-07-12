//Find LCM of two given numbers

import java.util.Scanner;

public class program6 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter first value");
        int n1=s.nextInt();
        System.out.println("Enter Second value");
        int n2=s.nextInt();
        //to get latgest number
        int num=(n1>n2)?n1:n2;

        while (true) {
            if(num%n1==0 && num%n2==0){
                System.out.println("LCM of "+n1+","+n2+" is : "+num);
                break;
            }
            num++;
            
        }
    }
    
}
