
package javabasiclevelcoding;

class Parent_In{
    public int a =10;
    public int b =20;

    public void display(){
        System.out.println(a+" "+b);
    }
    
    
}


public class Inherit extends Parent_In {
    
    public int c=30;
    
    public static void main(String[] args){
        Inherit obj = new  Inherit();
        System.out.println(obj.a+" "+obj.b+" "+obj.c);
        obj.display();
        
        
    }
    
}
