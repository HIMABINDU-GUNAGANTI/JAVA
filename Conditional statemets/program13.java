import java.util.Scanner;

public class program13 {
// Write a java program to A school has following rules for grading system: 
//a. Below 25 - F b. 25 to 45 - E c. 45 to 50 - D d. 50 to 60 - C e. 60 to 80 - B f. Above 80 - A ,Ask user to enter marks and print the corresponding grade.
public static void main(String[] args) {
    int marks;
    Scanner s=new Scanner(System.in);
    System.out.println("Enter marks:");
    marks=s.nextInt();
    
    if(marks<=0||marks>100){
        System.out.println("Invalid marks");
    }
    else if(marks<25){
        System.out.println(marks+" marks : F grade");
    }
    else if(marks>=25&&marks<45){
        System.out.println(marks+" marks : E grade");
        
    }
    else if(marks>=45&&marks<50){
        System.out.println(marks+" marks : D grade");
        
    }
    else if(marks>=50&&marks<60){
        System.out.println(marks+" marks : C grade");
        
    }
    else if(marks>=60&&marks<80){
        System.out.println(marks+" marks : B grade");
        
    }
    else if(marks>=80&&marks<100){
        System.out.println(marks+" marks : A grade");
        
    }
    
}
    
}
