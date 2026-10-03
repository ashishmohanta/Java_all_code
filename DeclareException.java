
import java.io.FileNotFoundException;
import java.io.IOException;


public class DeclareException
{
    public void methodA()
    {
        try
        {
            throw new SecurityException();
        }
        catch(SecurityException ex)
                {
                    System.out.println("Security Exception");
                 
                }
        catch(Exception ex)
                {
                    System.out.println("Exception");
                 
                }
        finally
        {
            System.out.println("The Final Line Is Executed");
        }
        
        
    }
    public void methodB() throws IOException    // For whole method we throw exception
     {
        //
    }
    public void methodC() throws FileNotFoundException ,SecurityException
    {
        //
    }
    public static void main(String[] args)
    {
        DeclareException declareexception = new DeclareException();
        declareexception.methodA();
        
        
    }
    
}
