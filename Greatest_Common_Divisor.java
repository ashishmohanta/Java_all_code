
package javabasiclevelcoding;

class Test04{
    public int a;
    public int b;
    public int c;
    public Test04(int a,int b){
        this.a=a;
        this.b=b;
    }
  
    public void display(){
           int GCD=0;
        if(a>b){
           this. c=b;
        }
        else{
            this.c=a;
        }
      
      


        for( int  i=c;i>=1;i--){
            if((a%i==0)&&(b%i==0)){
              GCD=i;
              break;
             
            
                
            }
        }
        System.out.println("The Greatest Common Divisonr Is : "+GCD);
       
  
    }

    
}


public class Greatest_Common_Divisor {
    
    public static void main(String[] args){
       
        Test04 object = new Test04(4,5);
       
        object.display();
        
    }
    
}
