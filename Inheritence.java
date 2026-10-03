
class Parent{
    public int x=5;
    public int y=8;
    
    public void fly(){
        System.out.println(x+" "+y);
        
    }
    
}

public class Inheritence extends Parent {
    
    public int z=10;
   
    
    public static void main(String[] args){
        Inheritence object = new Inheritence();
        object.fly();
        System.out.println(object.x+" "+object.y+" "+object.z);        
        // In inheritence we create object of child class
        // If we create an object of child class ,then
        // By that object we can access the class veriables of the parent class
        // We can call the method of parent class 
       //  We can not use the parent class constructor
       // Inheritence means Extending or extends 
       // Child_Class Extends Parent_Class
      
      }
    
}
