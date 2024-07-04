//Check whether an alphabet is vowel or consonant using if..else statement

import java.util.Scanner;

public class program3 {
    public static void main(String[] args) {
        char ch;
    Scanner s=new Scanner(System.in);
    System.out.println("Enter an alphabet");
    ch=s.next().charAt(0);

    if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
        System.out.println("Vowel");
    }
    else{
        System.out.println("Consonent");
    }
    }
    
    
}
