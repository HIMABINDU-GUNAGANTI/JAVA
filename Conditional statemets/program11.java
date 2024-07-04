import java.util.Scanner;

public class program11 {
    //Write a java program to A shop will give discount of 10% if the cost of purchased quantity is more than 2000. Ask user for quantity, Suppose, one unit will cost 100. Judge and print total cost for user.
    public static void main(String[] args) {
        int quantity;
        Scanner s=new Scanner(System.in);
        System.out.println("enter quantity");
        quantity=s.nextInt();
        int total=quantity*100;
        
        if(total>=2000){
            int discount=total*10/100;
            System.out.println((total=(total-discount) )+" yah!You recieved 10% discount");

        }
        else{
            System.out.println("Total cost for quantity "+quantity+" units is"+total);
        }
    }
}
