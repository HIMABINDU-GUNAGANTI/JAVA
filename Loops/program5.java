//multiplication table

import java.util.Scanner;

public class program5 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int num=s.nextInt();
        
        for(int i=1;i<=10;i++){
            System.out.println(num+" X "+i+" = "+i*num);

        }
        int i=10;
        while ( i>=1) {
            System.out.println(num+" x "+i+" = "+(num*i));
            i--;
        }
    } 
}
