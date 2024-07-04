import java.util.Scanner;

public class program15 {
    // write a program to check Triangle is valid or not.
    public static void main(String[] args) {
        int side1,side2,side3;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter 3 sides of triangle");
        side1=s.nextInt();
        side2=s.nextInt();
        side3=s.nextInt();

        int total=side1+side2+side3;
        if(side1<=0||side2<=0||side3<=0){
            System.out.println("invalid data");
        }
        else if(total==180){
           System.out.println("valid traingle"); 
        }
        else{
            System.out.println("Not a valid traingle");
        }


    }
}
