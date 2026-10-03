abstract class Vehicle
{
   public String model = "Tesla Model 3";
   public String year = "2017";
   
   public abstract void goFast();
   
   //The method which is only decleared , not defined is called abstract method
   // The class having atleast  one abstract method is called abstract class
   // We can not make an object of abstract class 
   // If we wan not use any method of abstract class then we have to extend it
   //  Vechile is abstract class  Car1 is concreate class 
   // If we fail to define a method in extend class which the abstract class already has; then it will also become abstract class
   // We can make object of concreate class; so focus is on concreate class 
   public void show()
   {
       System.out.println("Model: "+model);
       System.out.println("Year: "+year);
   }
}
  


public class Car1 extends Vehicle
{
    // Abstract class has no body
    //An Abstract class must have at least one abstract method
    // Abstract Class can not be implemented
    //Abstract class can be extened
    // We can pass the object of sub-class and the reference of super class 
    // We can have normal methods in abstract class 
    
    public void goFast()
    {
        System.out.println("Car Can Go Fast");
    }
    public static void main(String[] args)
    {
        //Vehicle vehicle = new Vehicle() ;
        Car1 car1 = new Car1();
        car1.show();
        car1.goFast();
    }
    
}
