import java.util.Scanner;

public class program7 {
    // Write a program to take input age of person and job status like yes or no and check he is eligible for marriage or not
    public static void main(String[] args) {
        int age;
        String job;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter your age and job status lije yes or no");
        age=s.nextInt();
        job=s.next();

        if(age>=21){
            if(job.equals("yes")){
                System.out.println("Eligible for marriage");
            }
            else{
                System.out.println("Not eligible because of age");
            }
        }
        else{
            System.out.println("Not eligible because of job");
      
        }
    }
    
}
