import java.util.Scanner;

public class program19 {
    //leap year
    public static void main(String[] args) {
        int year;
        Scanner s=new Scanner(System.in);
      
        System.out.println("Enter year");
        year=s.nextInt();
    //   if (year<=0) {
    //     System.out.println("Not a year");
    
    //    }
    //     else if ((year%4==0) && (( year%100!=0 )||(year%100==0 && year%400==0))) {
    //         System.out.println(year+" :Leap year");
            
    //     }
    //     else{
    //         System.out.println("not a leap year");
    //     }
    //                     OR

         boolean x=(year%4==0);
         boolean y=(year%100!=0);
         boolean z=(year%100==0)&&(year%400==0);

         if (x&&(y||z)) {
            System.out.println("leap year");
            
         }
    }
    
}
