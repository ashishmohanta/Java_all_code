
package sakhhor.sir;


public class IdentifyMyParts {
    public static int x = 7;
    public int y = 3;
    public static void main(String[] args){
        IdentifyMyParts a = new IdentifyMyParts();
        IdentifyMyParts b = new IdentifyMyParts();
        a.y = 5;
        b.y = 6;
        a.x = 1;   // Static variable works as global variable
        b.x = 2;  //  x is a static variable , 
                  // Static variable means single copy            ............
        System.out.println(a.y);                          //      .   x=2    .
        System.out.println(b.y);                          //      .          .
        System.out.println(a.x);                          //      ............
        System.out.println(b.x);
        System.out.println(IdentifyMyParts.x);
    }
    
}
