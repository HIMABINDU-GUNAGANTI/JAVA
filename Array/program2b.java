/*
 * Write a method to return the largest element in the given 
 * integer array
 * Test Case 1: 

	Input :[1,6,9,0,25,16]
	Output : 25

    Test Case 2: 

	Input : [ 4, 78, 98, 87, 120 ]
	Output : 120

    Test Case 3: 

	Input : [ 5, -24, 46,- 20 ,98]
	Output : 98

 */

import java.util.Scanner;

public class program2b {
    public static void main(String[] args) {
        // Scanner s=new Scanner(System.in);
        // System.out.println("Enter size :" );
        // int  size=s.nextInt();
        // int[] array=new int[size];

        int[] array={1,4,7,9,3,5,7,98,0};
        System.out.println(largestNum(array));


        
    }
    public static int largestNum(int[] array){
        
        int largest=array[0];
        for(int index=0;index<array.length;index++){
            if(array[index]>largest){
                largest=array[index];

            }
        }
        return largest;

    }
    
}
