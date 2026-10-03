package sakhhor.sir;

 class Latim {
     
   private int rpm;
     public Latim(int r){
        rpm=r;
         
     }
    public int getRPM(){
        return rpm;
    }
    public static void main(String[] args){
        Latim l = new Latim(5);
      
        System.out.println(l.getRPM());
    }
}
