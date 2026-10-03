
package bankproject;


public class Account {

    public String accountName = "Savings Account";
    
    public void showAccountName(){
    System.out.println(accountName);
}
    
    public static void main(String[] args) {
        
        Account object = new Account();
        object.showAccountName();
        
    }
    
}
