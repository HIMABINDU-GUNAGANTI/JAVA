import java.util.Scanner;
// Write a Java program to determine whether a given integer number is a Tech number.A number is called a tech number if the given number has an even number of digits and the number can be divided exactly into two parts from the middle. After equally dividing the number, sum up the numbers and find the square of the sum. If we get the number itself as square, the given number is a tech number, else, not a tech number.
// Example :   
// number = 2025 
// 20 + 25 
// (45)2
//  2025 = 2025 
// Hence 2025 is a Tech number.

public class program16 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        //step1 input
        int num=s.nextInt();
        //step2 find length
        int length=length(num);
        //check length is even or not
        if(length%2==0){
            //second half
            int n2=findN2(num, length);
            //first Half
            int n1=findN1(num, length);
            //sum of n1,n2
            int sum=n1+n2;
            //square of sum
            int square=sum*sum;
            if (square==num) {
                System.out.println("tech number");
                
            }
            else {
                System.out.println("Not");
            }

        }
        else{
            System.out.println("invalid");
        }
        
       
        
       

    }
    public static int length(int num){
        int count=0;
        while (num!=0) {
            count++;
            num/=10;
        }
       return count;
    }
    //first half:20
    public static int findN1(int num,int length){
        for(int i=1;i<=length/2;i++){
            num=num/10;
        }
        return num;
    }
    //Second half:25
    public static int findN2(int num,int length){
        int n2=0;
        for(int i=1;i<=length/2;i++){
            int d=num%10;
             n2=n2*10+d;
            num=num/10;
        }
        return reverse(n2);
    }

    public static int reverse(int num){
        int rev=0;
        while(num!=0){
            int d=num%10;
            rev=rev*10+d;
           num=num/10;

        } 
           
        return rev;
    }

}
