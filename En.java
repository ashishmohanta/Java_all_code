
package all.java.code.pkgfor.uiu.lab.by.turjo;

class Testen{
    private int number;
    private String a;
    private int x;
    
    public void setNumber(int number){
       if(number>1000){
           this.number=number;
       }
        
    }
    public int getNumber(){

        

     

           return number;
       
       
    }
}

public class En {
    
    public static void main(String[] args){
        String a= "turjo";
        int x=86;
        // User Name = turjo , Password = 086 
        Testen object =new Testen();
        object.setNumber(1024);
        if(a=="turjo"&&x==86){
            int j = object.getNumber();
            System.out.println("The Number Is : "+j);
            
        }
        else{
            System.out.println("Wrong User Name And Password");
        }
       
       
        
    }
    
}
