import java.util.Scanner;

public class program10 {
    //Write a java program to Take values of length and breadth of a rectangle from user and check if it is square or not
    public static void main(String[] args) {
        double length,breadth;
    Scanner s=new Scanner(System.in);
    System.out.println("Enter length and breadth of rectangle");
    length=s.nextDouble();
    breadth=s.nextDouble();
    if (length<=0||breadth<=0) {
        System.out.println("Invalid values");
        
    }
   else if(length==breadth){
        System.out.println("square");
    }
    else{
        System.out.println("Not square");
    }
    }
    
}
