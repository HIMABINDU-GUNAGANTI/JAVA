import java.util.Scanner;
//multiplication table

class program1{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int num=s.nextInt();
        
        // for(int i=1;i<=10;i++){
        //     System.out.println(num+" x "+i+" = "+(num*i));
        // }
        
        int i=10;
        while ( i>=1) {
            System.out.println(num+" x "+i+" = "+(num*i));
            i--;
        }
    }
}