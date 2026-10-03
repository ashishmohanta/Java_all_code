
package sakhhor.sir;


public class Array_Insertion {
    
    public static void main(String[] args){
        int[] a = {78,56,62,85,10,};
        int b=2;
        int c = a.length;
//        System.out.println(c);
          
           for(int i =b;i<c;i++){
               a[i+1]= a[i];
        
    }
           a[b]=56;
           for(int element:a){
               System.out.println(element);
           }
       
    }
    
}
