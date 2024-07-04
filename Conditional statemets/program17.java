import java.util.Scanner;

public class program17 {
    //Write a program to print absolute vlaue of a number entered by user. 
    //E.g.- INPUT: 1 OUTPUT: 1 INPUT: -1 OUTPUT: 1
    public static void main(String[] args) {
        int num;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a value:");
        num=s.nextInt();
        if(num<0){
            System.out.println("The absolute value is: "+(num*-1));
        }
        else{
            System.out.println("The absolute value is: "+num);
     
        }

    }
    
}
