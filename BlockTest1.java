
public class BlockTest1 {
    public String info;
    public BlockTest1(){
        info = "Constructor Executed In The 2nd Step"; 
        System.out.println(info);
    }
    {
        info = "Block Executed In The 1st Step";
        System.out.println(info);
    }
    public void show(){
        info = "Method Executed In The 3rd Step";
        System.out.println(info);
    }
    
    public static void main(String[] args){
        BlockTest1 object = new BlockTest1();
        object.show();
    }
   
    
}
