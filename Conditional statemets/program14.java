import java.util.Scanner;

public class program14 {
    //Write a java program to Check enter number is perfect number or not perfect number
    public static void main(String[] args) {
        int num;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a number:");
        num=s.nextInt();

        if(num<=0){
            System.out.println("Invalid");

        }
        else if(num>0){{
            int sum=0;
            for(int i=1;i<num;i++){
                if (num%i==0) {
                    sum=sum+i;   
                }
            }
            if(sum==num){
                System.out.println("perfect number");
            }
            else{
                System.out.println("not a perfect number");
            }
        }

        }
    }
}
