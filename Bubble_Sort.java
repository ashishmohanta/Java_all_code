
package sakhhor.sir;

public class Bubble_Sort {
    
    public static void main(String[] args){
         int[] a = {85,62,78,62,96,75};
        System.out.println("The Array Before Sorting");
        for(int element:a){
            System.out.print(element+" ");
        }
        System.out.println();
         for(int i=0;i<a.length-1;i++)
    for(int j=0;j<a.length-i-1;j++){
        if(a[j]>a[j+1]){
            int temp=a[j];
            a[j]=a[j+1];
            a[j+1]=temp;
        }
    }
          System.out.println("The Array After Bubble Sort");
        for(int element:a){
            System.out.print(element+" ");
        }
         
    }
    
}
