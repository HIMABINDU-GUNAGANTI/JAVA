import java.util.Scanner;

public class program5 {
    //Write a program to take input age of person and check he is eligible for marriage or not.
    public static void main(String[] args) {
        int age;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter your age:");
        age=s.nextInt();

        if (age>=21) {
            System.out.println("eligible ");
            
        }
        else{
            System.out.println("Not eligible");
        }
        
    }
    
}
