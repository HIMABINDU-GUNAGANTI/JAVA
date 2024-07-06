import java.util.Scanner;

public class program9 {
    //Write a java program to take Basic salary of employee from user and calculate gross salary with given condition, if Basic salary >= 10000 then we calculate 40% da and 30% ta of Basic salary otherwise 30% da and 20% ta of Basic salary
    public static void main(String[] args) {
        double basicSalary;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter basic salary");
        basicSalary=s.nextDouble();
        double da,ta;
        if (basicSalary>=100000.0) {
            da=basicSalary*40/100;
            System.out.println("da: "+da);
            ta=basicSalary*30/100;
            System.out.println("ta: "+ta);  
        }
        else{
            da=basicSalary*30/100;
            System.out.println("da: "+da);
            ta=basicSalary*20/100;
            System.out.println("ta: "+ta); 

        }
           
    }
    
}
