import java.util.Scanner;

public class program16 {
    //Write a program to Take input of age of 3 people by user and determine oldest among them.
    public static void main(String[] args) {
        int age1,age2,age3;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter 3 ages:");
        age1=s.nextInt();
        age2=s.nextInt();
        age3=s.nextInt();
        if(age1<=0||age2<=0||age3<=0||age1>100||age2>100||age3>100){
            System.out.println("Invalid age");
        }
        else if(age1>age2&&age1>age3){
            System.out.println(age1+" is oldest");
        }
        else if(age2>age3){
            System.out.println(age2+" is oldest");
        }
        else {
            System.out.println(age3+" is oldest");
        }
    }
    
}
