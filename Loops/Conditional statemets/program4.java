import java.util.Scanner;

public class program4 {
    //Write a program for checking enter number is Positive or Negative.
    public static void main(String[] args) {
        int num;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a number");
        num=s.nextInt();
        if (num<0) {
            System.out.println("Negative number");
         }
         else{
            System.out.println("Positive number");
         }
        
    }
    
}
