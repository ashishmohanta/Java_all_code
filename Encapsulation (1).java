class MyNumber{
    private int number=10;
    
    public void setNumber(int number){
        this.number = number;
        
    }
    public int getNumber(){
       
        return number;
    }
}


public class Encapsulation {
   
    public static void main(String[] args){
         MyNumber my = new MyNumber();
//         my.setNumber(5);
         System.out.println(my.getNumber());
    
    }
    
    
}
