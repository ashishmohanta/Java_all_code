
package all.java.code.pkgfor.uiu.lab.by.turjo;


class Test_Encapsulation{
    private int number;
    
    public void setNumber(int number){
        if(number>1000){
            this.number=number;
        }
    
}
    public int getNumber(){
        return number;
        
    }
    
}


public class Encapsulation {
    
    
    public static void main(String[] args){
        Test_Encapsulation obj = new Test_Encapsulation();
        obj.setNumber(420);
        System.out.println("The Value: "+obj. getNumber());
        
    }
    
    
    
}
