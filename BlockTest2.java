
public class BlockTest2 {
    
    public BlockTest2(){
        System.out.println("Constructor Executed In 2nd The Step");
    }
    {
        System.out.println("Block 1 Is Executed");
    }
    {
        System.out.println("Block 2 Is Executed");
        {
            System.out.println("Block 2 Inner Sub Block Executed ");
        }
        {
            System.out.println("Block 2 Inner Inner Sub Block Is Executed");
        }
    }
    public void show(){
        System.out.println("Method Is Executed In The Last Step");
    }
    
    public static void main(String[] args){
        BlockTest2 object = new BlockTest2();
        object.show();
    }
    
}
