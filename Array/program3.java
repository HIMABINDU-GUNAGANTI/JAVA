/*
 * Write a method to find the frequency of each element in 
 * the given integer array.
    Test Case 1: 

	Input :  [1, 8, 6 , 1 , 0 , 8]
	Output :    1 : 2 
                8 : 2 
                6 : 1 
                0 : 1 ​


Test Case 2: 

	Input :   [ 2, 2 , 3 , 3 , 2]
	Output :    2 : 3 
                3 : 2 

 */

import java.util.Scanner;

public class program3 {
    public static void main(String[] args) {
        // int[] array={8,4,3,4,56,5,4,3};
        Scanner s=new Scanner(System.in);
        System.out.println("Enter size :");
        int size=s.nextInt();
        System.out.println("Enter " +size+ " values");
        int [] array=new int[size];
        //to read element from scanner
        for(int i=0;i<array.length;i++){
            array[i]=s.nextInt();
        }
        s.close();
        //method calling
        frequency(array);
        
    }
    public static void frequency(int[] array){
       
        // int visited=-1;
        int visited=Integer.MIN_VALUE;
        for(int i=0;i<array.length;i++){
            int count =1;
            if(array[i]!=visited){
                for(int j=i+1;j<array.length;j++){
                    if(array[i]==array[j]){
                        count++;
                        array[j]=visited;
                    }
                }
                System.out.println(array[i]+" : "+count);
            }
            

        }
    }
}
