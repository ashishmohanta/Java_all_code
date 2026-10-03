
import java.util.Arrays;
public class Array7 {
    
    public static void main(String[] args){
        
        int[] a = {10,8,5,100,32};
        System.out.println("The Before Sort");
        for(int i: a){
            System.out.print(i+" ");
        }
        System.out.println("\nThe Array After Sort");
        Arrays.sort(a);
         for(int i: a){
            System.out.print(i+" ");
        }
        
    }
    
}
