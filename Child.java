

class Parent
{
    public int a = 10;
    public int b = 20;
    
    public void show()
    {
        System.out.println("Printing From Parent Class");
        System.out.println("A-> "+a);
        System.out.println("B-> "+b);
    }
}


public class Child extends Parent  // In inheritence child can use everything of parent class except constructor of the parent
{
    public static void main(String[] args)
    {
        Child child = new Child();
        child.show();
        System.out.println("Printing From Child Class");
        System.out.println("A: " + child.a);
        System.out.println("B: " + child.b );
    }
   

  
}
