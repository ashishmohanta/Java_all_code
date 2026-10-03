
public class Account 
{
    public String accountName = "Savings Account ";
    public void showAccountName()
    {
        System.out.println(accountName);
    }
    public static void main(String[] args)
    {
        Account account = new Account();
        account.showAccountName();
        
        
    }
}