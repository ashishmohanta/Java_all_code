
package sakhhor.sir;

abstract class Vehicle{
    public String model = "TVS STAR CITY";
    
    public abstract void gofast();
    
    public void show(){
        System.out.println("Model: "+model);
    }
}

public class Abstract1 extends Vehicle {
    public void gofast(){
        System.out.println("Class");
    }
    public static void main(String[] args){
       // Vehicle object1 = new Vehicle();   // we can not create object of abstract class
       Abstract1 object2 = new Abstract1();
       object2.show();
       object2.gofast();
       
        
        
    }
    
}
