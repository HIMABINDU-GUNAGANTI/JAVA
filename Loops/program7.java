//Find LCM of 3 numbers

import java.util.Scanner;

public class program7 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter first value:");
        int n1=s.nextInt();
        System.out.println("Enter Second value:");
        int n2=s.nextInt();
        System.out.println("Enter Third value:");
        int n3=s.nextInt();

        int num=(n1>n2 && n1>n3)?n1:(n2>n3)?n2:n3;

        while (true) {
            if (num%n1==0 && num%n2==0 && num%n3==0 ) {
                System.out.println("LCM of "+n1+","+n2+","+n3+" is : "+num);
                break;
            }
            num++;
            
        }
    }
    
}
