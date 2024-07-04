import java.util.Scanner;

public class program18 {
    // Write a Java program to solve quadratic equations
    public static void main(String[] args) {
        double a,b,c;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a,b,c values");
        a=s.nextDouble();
        b=s.nextDouble();
        c=s.nextDouble();

        double result=b*b-4.0*a*c;

        if(result==0.0){
            result=-b/(2.0*a);
            System.out.println(result);
        }
        else if(result>0.0){
           double result1=(-b+Math.pow(result, 0.5))/(2.0*a);
           double result2=(-b-Math.pow(result, 0.5))/(2.0*a);

           System.out.println("The roots are "+result1+" and "+result2);


        }
        else{
            System.out.println("The equation does have real root");
        }

    }
}
