
public class BT {
    
    public String a;
    
    public BT(){
        a = "Constructor Is Executed Second";
        System.out.println(a);
        
    }
    {
        a = "Block Is Executed First";
        System.out.println(a);
        
    }
    {
        a = "Block 2 Is Executed";
        System.out.println(a);
        {
            a =" Block 2.1 Is Executed";
            System.out.println(a);
            
        }
        
    }
    {
        a= "Block 3 Is Executed";
        System.out.println(a);
        
    }
    
    public void show(){
        a = "Method Is Executed Third";
        System.out.println(a);
        
    }
    public static void main(String[] args){
        BT object = new BT();
        object.show();
    }
    
}
