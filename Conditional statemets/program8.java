import java.util.Scanner;

public class program8 {
    //Write a java program to input a cost of a pen and calculate 70 pens cost with some discount. if total pen cost greater than 1000 then we calculate 20% discount otherwise 10%.
    public static void main(String[] args) {
        int cosetOfPen;
        Scanner s=new Scanner(System.in);
        System.out.println("enter a single pen cost");
        cosetOfPen=s.nextInt();
        int totalPens=70*cosetOfPen;
        System.out.println(totalPens);
        if (cosetOfPen<=0) {
            System.out.println("invalid data");
    
        }
       else if (totalPens>=1000) {
            totalPens=totalPens*20/100;
            System.out.println("your total bill : "+totalPens);
            
        }
        else{
            totalPens=totalPens*10/100;
            System.out.println("your total bill : "+totalPens);
        }
    }
}
