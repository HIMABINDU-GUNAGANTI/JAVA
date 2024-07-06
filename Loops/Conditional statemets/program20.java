import java.util.Scanner;

public class program20 {
    //Check whether an alphabet is vowel or consonant using switch statement.
    public static void main(String[] args) {
        char ch;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter an alphabet");
        ch=s.next().charAt(0);

        switch (ch) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':{
                System.out.println(ch+" is vowel");
            }break;
                
                
        
            default:{
                System.out.println(ch+" consonent");
            }
                break;
        }
    }
}
