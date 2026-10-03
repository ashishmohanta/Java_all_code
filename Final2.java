
package sakhhor.sir;

class Demo{
     void demo(){
        System.out.println("I Am A Final Method");
    
     }
    
}

public class Final2 extends Demo {
    
    void demo(){  // It will show an error , cause we can not override a final method
        System.out.println("Child Class Method Have An Error");
    }
    public static void main(String[] args){
        Final2 object = new Final2();
        object.demo();
    }
}
