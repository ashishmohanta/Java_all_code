
package javabasiclevelcoding;

import java.util.Arrays;
public class Array_Test {
    
    public static void main(String[] args){
        int array[] = {2,39,12,3,55};
       // int[] myArray = new int[array.length] ; 
       int myArray[] = new int[array.length] ; 
       for(int i=0;i<myArray.length;i++){
           System.out.print(myArray[i]+" ");
       }
       System.out.println("<----This The Array Is Initialized");
       System.arraycopy(array,0,myArray,0,array.length);
       for(int i=0;i<myArray.length;i++){
           System.out.print(myArray[i]+" ");
       }
       System.out.println("<----The Array Was Coppied");
       Arrays.sort(myArray);
       for(int i=0;i<myArray.length;i++){
           System.out.print(myArray[i]+" ");
       }
       System.out.println("<-----The Array Was Sorted");
       System.out.println("Element 12 Found At The Position "+Arrays.binarySearch(myArray,12));
       Arrays.fill(myArray,56);
       for(int i=0;i<myArray.length;i++){
           System.out.print(myArray[i]+" ");
       }
       System.out.println("<--- The Array Was Filled");
    }
}
