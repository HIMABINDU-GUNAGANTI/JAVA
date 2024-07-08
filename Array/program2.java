/*
 *  To create an Array 
 * 
 *  case 1: create array using declare & initialization stmt
 *  case 2: create an array using new without initialization
 *  case 3: create an array using new & initialization 
 *   
 */

import java.util.Scanner;

public class program2 {
    //1.question create array to store 10 20 & 30 
    // print data 
    public static void main(String[] args) {
        int[] a={10,20,30};
        System.out.println(a);
        System.out.println(a[0]);
        System.out.println(a[1]);
        System.out.println(a[2]);
        //by using for loop
        for(int index=0;index<a.length;index++){
            System.out.print(a[index]+" ");
        }
    //2.question
    // read size from the user 
    // create int[] for user provided size 
    // initialize data by reading it from the user 
    // print all the data present in the array 
      Scanner s=new Scanner(System.in);
      System.out.println();
      System.out.println("Enter size: ");
      int size=s.nextInt();
      int[] b=new int[size];
      System.out.println("Enter data");
      for(int index=0;index<b.length;index++){
        b[index]=s.nextInt();
      }
      for(int index=0;index<b.length;index++){
        System.out.print(b[index]+",");
      }

        
    }
    
}
