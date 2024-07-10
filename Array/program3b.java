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

import java.util.HashSet;
import java.util.Scanner;

public class program3b {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter size");
        int size=s.nextInt();
        System.out.println("Enter "+size+" values:");
        int[] array=new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i]=s.nextInt();
            
        }
        frequency(array);
    }
    //using Hashset 
    public static void frequency(int[] array){
        HashSet<Integer> hs=new HashSet<>();
        for(int i=0;i<array.length;i++){
            hs.add(array[i]);
        }
        for(int element :hs){
            int count=0;
            for(int i=0;i<array.length;i++){
                if (element==array[i]) {
                    count++;    
                    
                }
            }
            System.err.println(element+":"+count);
        }

    }

    
}
