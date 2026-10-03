
public class ABC 
{
    public int a;
    public int b;
   
    public void setValue()
    {
        a=1;
        b=2;
    }
    public void setValue(int a)
    {
        this.a=a;
        b=2;
    }
    public int setValue(int a,int b)  // Integer type method ,it will return value
    {
        this.a=a;
        this.b=b;
        return (a+b);
    }
    public static void main(String[] args)
    {
        // In Overloading  the method will be same, but argument list will be different 
        ABC abc = new ABC();  // Object is created only once in this code
        
            abc.setValue();
            System.out.println("A: "+abc.a);
            System.out.println("B: "+abc.b);
            System.out.println("------------------");
            
            abc.setValue(10);
            System.out.println("A: "+abc.a);
            System.out.println("B: "+abc.b);
             System.out.println("------------------");
            
            int sum= abc.setValue(10,20);
            System.out.println("A: "+abc.a);
            System.out.println("B: "+abc.b);
            System.out.println("Sum: "+sum);
        
    }
    
}
