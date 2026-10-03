
class Car{
    public String carName;
    public String carModel;
    public Car(String carName,String carModel){
        this.carName=carName;
        this.carModel=carModel;
        
    }
    public void display(){
        System.out.println("Car Name: "+carName+" <--> "+"Car Model: "+carModel);
    }
    
}


public class Array2 {
    
    public static void main(String[] args){
        
        Car[] a = new Car[3];
        
        a[0] =  new Car("BMW","XL201");
        a[1] =  new Car("TOYOTA","COROLA GX");
        a[2] =  new Car("TOYOTA","PREMIO GX2016");
        
        for(int i=0;i<3;i++){
            a[i].display();
        }
    }
    
}
