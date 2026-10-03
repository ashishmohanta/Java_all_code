
public class Exception2
{
    public static void main(String[] args)
    {
       
        int[] a = new int [4];
        
        try
        {
            for(int i=0;i<=4;i++)
            {
                a[i]=i+1;
            }
        }
       /* catch(ArithmeticException ex)    // The keyword Exception in Catch() will handle all type of Exception
        {
            System.out.println(ex);
            
        }*/
        catch(Exception ex)
        {
            System.out.println("Array Size Out Of Bound");
        }
        
    }
    
}
