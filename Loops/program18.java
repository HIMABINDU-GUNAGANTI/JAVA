// Write a Java program to determine whether a given integer is a Duck number or not. A Duck number is a positive, non-zero number that contains at least one zero in it.
// Example:
// 3210 is a Duck number because it contains a zero at the end of the number.
// 8237 is not a Duck number because it does not contain zero in it.

import java.util.Scanner;

public class program18 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int num=s.nextInt();
        if(containsZero(num)==true){
            System.out.println("duck num");
        }
        else {
            System.out.println("not duck");
        }
        
        
    }
    public static boolean containsZero(int num){
        while (num!=0) {
            int d=num%10;
            
            if(d==0){
                num=num/10;
                System.out.println("Duck number");
                return true;
            }
            else{
                num=num/10;
                
            }
              
        }
        return false;
    }

    
}
