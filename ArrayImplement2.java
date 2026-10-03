
package all.java.code.pkgfor.uiu.lab.by.turjo;


class Information{
    public String name;
    public String batName;
    public int age;
    
    public Information(String name,String batName,int age){
        this.name=name;
        this.batName=batName;
        this.age=age;
        
    }
    public void display(){
        System.out.println("Player Name: "+name+"Bat Name: "+batName+"Age: "+age);
    }
}

public class ArrayImplement2 {
    
    public static void main(String[] args){
        
       Information[] a = new Information[3];
       a[0] = new Information("Shakib Al Hasan ","SG",27);
        a[1] = new Information("Tamim Iqbal Khan ","CA",27);
         a[2] = new Information("Mushfiqur Rahim ","SS",28);
         for(int i =0;i<3;i++){
             a[i].display();
         }
        
    }
}
