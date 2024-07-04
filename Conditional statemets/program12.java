import java.util.Scanner;

public class program12 {
    //Write a java program to A company decided to give bonus of 5% to employee if his/her year of service is more than 5 years. Ask user for their salary and year of service and print the net bonus amount.


    public static void main(String[] args) {
        int salary;
        int experience;
        

        Scanner s=new Scanner(System.in);
        System.out.println("Enter salary");
        salary=s.nextInt();
        System.out.println("enter your experience");
        experience=s.nextInt();

        if(experience>5){
            int bonus=salary*5/100;
            System.out.println("with bonus "+(bonus+salary));

        }
        else{
            System.out.println("you will not get bonus");
        }

    }
    
}
