import java.util.Scanner;

public class program2 {
    //sum of numbers

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int num=s.nextInt();
        int sum=0;
        for(int i=1;i<=num;i++){
            sum=sum+i;

        }
        System.out.println("sum of "+num+" numbers is: "+sum);
    }
    
}
