
public class Exception1 
{
    public static void main(String[] args)
    {
        int i,j,k = 0;
        i=8;
        j=0;
        
        try     // Critical Block
        {
        k=i/j;
        }      // this block will throw an error if there is 
        catch(Exception ex)   // ex will catch the error 
                {
                    //System.out.println("Can Not Divide By Zero -> Arithmatic Exception");
                    System.out.println(ex);
                    
                }
        System.out.println(k);
    }
    
    
}
