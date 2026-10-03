
package sakhhor.sir;


public class Insertion_Sort {
    public static void main(String[] args){
        int[] a = {85,62,78,62,96,75};
        System.out.println("The Array Before Sorting");
        for(int element:a){
            System.out.print(element+" ");
        }
        System.out.println();
         for(int j=1;j<=a.length-1;j++){
        int t=a[j];
       int i=j-1;
        while((i>=0)&&(a[i]>t)){
            a[i+1]=a[i];
            i=i-1;
        }
        a[i+1]=t;
    }
         System.out.println("The Array After Insertion Sort");
        for(int element:a){
            System.out.print(element+" ");
        }
       
    }
    
}
