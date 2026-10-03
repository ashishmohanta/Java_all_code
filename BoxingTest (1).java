
public class BoxingTest {
    
    public void Manual_Boxing(){
        int a = 2;
        Integer b = new Integer(a); // Manual Boxing
        int c = b.intValue();  //Manual Unboxing
        
        
    }
    
    public void Auto_Boxing(){
        
        int a=9;
       
       Integer b = a; // Autoboxing
        System.out.println(b);
        int c= b;   // Auto Unboxing
          System.out.println(a);
        
    }
    public static void main(String[] args){
        BoxingTest obj = new BoxingTest ();
        obj.Auto_Boxing();
        
    }
    
}
