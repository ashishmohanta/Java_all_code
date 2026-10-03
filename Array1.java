
class Bird{
    public void fly(){
        System.out.println("Eagle Can Fly Fast");
    }
}

public class Array1 {
    
    public static void main(String[] args){
        Bird[]  a = new Bird[3];
        for(int i=0;i<3;i++){
            a[i]= new Bird(); // Calling The Constructor
        }
        
        for(int i=0;i<3;i++){
            a[i].fly();
        }
    }
    
}
