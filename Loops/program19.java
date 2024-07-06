// Write a Java program to determine whether a given number is a fascinating number. A number is said to be fascinating if, after multiplying it by 2 and 3 separately and concatenating the results with the original number, the resultant number contains all the digits from 1 to 9 exactly once.
//             For example, consider the number 327:
// 327 × 2 = 654
// 327 × 3 = 981
// Concatenating these results with the original number gives:
//           "327" + "654" + "981" = "327654981".
// This resultant number contains all the digits from 1 to 9 exactly once, making 327 a fascinating number.

import java.util.Scanner;

public class program19 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int num1=s.nextInt();
        int num2=num1*2;
        int num3=num1*3;

        String sum=num1+""+num2+""+num3;
        System.out.println(sum);
        // int num1=sum;

        // while (num1!=0 || num2!=0 || num3!=0) {
        //     int d1=num1%10;
        //     int d2=num2%10;
        //     int d3=num3%10;  
            
            

            
        // }

       
        
    }
    
}
