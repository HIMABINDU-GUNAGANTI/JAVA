import java.util.Scanner;

public class program13 {
    //WAP to find sum of last and first digits should be equals to middle digits of sum.if it is equal then print Harmony
    //2468
    //sum1=2+8=10
    //sum2=4+6=10
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int num=s.nextInt();

        int sum1=num%10;
        num/=10;
        int sum2=0;
        while (num!=0) {
            if(num<10){
                sum1=sum1+num;
                
            }
            else if(num>9){
                int digit=num%10;
                sum2=sum2+digit;

            }
        
        num=num/10;


        }
        System.out.println(sum1);
        System.out.println(sum2);
        if (sum1==sum2) {
            System.out.println("harmony");
            
        }
        else{
            System.out.println("Not harmony");
        }
            
    }
        
}
    

