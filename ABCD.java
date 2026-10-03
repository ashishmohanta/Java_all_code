
public class ABCD 
{
 public int a;
 public int b;
 
 public ABCD()  // Parameter different
 {
     a=1;
     b=2;
 }
 public ABCD(int a)  // Parameter different
 {
     this.a = a;
     b=2;
 }
 public ABCD(int a,int b)    // Parameter different
 {
     this.a = a;
     this.b = b;
 }
 public static void main(String[] args)
 {
     //Overloading constructor
     // This code have constructors
     ABCD object1 = new ABCD();
     
     System.out.println("A: "+object1.a);
     System.out.println("B: "+object1.b);
     System.out.println("------------------");
     
      ABCD object2 = new ABCD(10); // Creating objects more than one time
     
     System.out.println("A: "+object2.a);
     System.out.println("B: "+object2.b);
     System.out.println("------------------");
     
      ABCD object3 = new ABCD(10,20);
     
     System.out.println("A: "+object3.a);
     System.out.println("B: "+object3.b);
   
 }
}
