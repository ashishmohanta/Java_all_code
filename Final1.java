
package sakhhor.sir;


public class Final1 {
    
    public static final int studentID = 10;
    
    public final void display(){
        System.out.println("Final Method Can Not be Override");
    }
    public static void main(String[] args){
        final int b;
        b=75;
        
        Final1 object = new Final1();
        System.out.println("The Value: "+studentID+" "+"B: "+b);
        object.display();
        
    }
    
}
