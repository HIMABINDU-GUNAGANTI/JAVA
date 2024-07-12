//write a program to find all prime numbers b/w a given range
//also find count of prime numbers b/w range

import java.util.Scanner;

public class program4 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter lower limit ");
        int n1=s.nextInt();
        System.out.println("Enter upper limit ");
        int n2=s.nextInt();
        int primeCount=0;
        for(int i=n1;i<=n2;i++){
            int count=0;
            for(int j=1;j<=i;j++){
                if(i%j==0){
                    count++;
                }
            }
            if (count==2) {
                System.out.print(i+",");
                primeCount++;
             }

        }
        System.out.println();
        System.out.println("count of total prime numbers  "+ primeCount);
    }
    
}
