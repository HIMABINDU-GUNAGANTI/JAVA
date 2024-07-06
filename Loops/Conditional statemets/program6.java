import java.util.Scanner;

public class program6 {
    //Write a program to take input age of male or Female and check he/she is eligible for marriage or not.
    public static void main(String[] args) {
       
       
        Scanner s=new Scanner(System.in);
        System.out.println("Enter age of Male or Female");
        int age=s.nextInt();
       
        System.out.println("Enter Gender of Human like male or female");
        String gen=s.next();
        
        
        if(gen.equals("male")){
            if(age>=21){
                System.out.println("Eligible");
            }
            else{
                System.out.println("Not Eligible");

            }
        }

       else if(gen.equals("female")){
            if(age>=18){
                System.out.println("Eligible");
            }
            else{
                System.out.println("Not Eligible");

            }
        }
        else{
            System.out.println("Invalid details");
        }
               
    }
    
}
