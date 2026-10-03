
public class BoxingTest
{
    public void boxing(int pInteger)
    {
        Integer wrapperInteger = new Integer(pInteger); // Boxing the value , making an object
        int number = wrapperInteger.intValue(); // unboxing the value
        System.out.println("Working As Manual Boxing " + number);
    } 
    public void autoboxing(int pInteger)
    {
        Integer wrapperInteger = pInteger;  // Boxing the value, no constructor called
        int number = wrapperInteger; // auto unboxing ,which works automatically
        System.out.println("Working As Auto Boxing " + number);
    }
    
    public static void main(String[] args)
    {
        BoxingTest boxingtest = new BoxingTest();
        boxingtest.boxing(100);
        boxingtest.autoboxing(200);
    }
    
}
