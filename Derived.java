
package sakhhor.sir;

class Base{
    public void print(){
        System.out.println("BASE");
    }
}

 class Derived extends Base{
     public void print(){
         System.out.println("Derived");
     }
 }
class Main{
    public static void DoPrint(Base o){    // static method
                                          // (Base o) base data type reference 
        o.print();                        // o ; object 
    }
    public static void main(String[] args){
        Base x = new Base();
        Base y = new Base();
        Derived z = new Derived();
        DoPrint(x);  // calling the object of x
        DoPrint(y);  //  calling the obejct of y
        DoPrint(z);   // calling the object of z
    }
}