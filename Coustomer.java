
package bankproject;

import bankproject.Account;
public class Coustomer {
    public String name = "Nasir Uddin Ahmed";
    
    public static void main(String[] args){
        
        Account object = new Account();
        object.showAccountName();
        Coustomer object1 = new Coustomer();
        System.out.println(object1.name);
        
    }
    
}
