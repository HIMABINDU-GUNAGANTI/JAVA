import java.util.Scanner;

public class program2 {
//divisors of a number
//6
//print 1,2,3,6
//print count of divisors i.e 4
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter value:");
        int num=s.nextInt();
        int count =0;
        for (int i = 1; i <=num; i++) {
            if(num%i==0){
                System.out.print(i+",");
                count++;
            }  
        } 
        System.out.println();  
        System.out.println("Total count of divisors "+count);
    } 
}
