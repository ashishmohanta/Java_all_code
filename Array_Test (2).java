
package sakhhor.sir;

class Information{
    public String playerName;
    public String teamName;
    public String style;
    public int run;
    public int  wicket;
    public int matchFee;
    public Information(String playerName,String teamName,String style,int run,int  wicket,int matchFee){
        this.playerName=playerName;
        this. teamName=teamName;
        this.style=style;
        this.run=run;
        this.wicket=wicket;
        this. matchFee= matchFee;
                
        
    }
    public void display(){
        System.out.println("Player Name: "+playerName);
         System.out.println("Team Name: "+teamName);
          System.out.println("Playing Style: "+style);
          System.out.println("Runs Scored: "+run);
          System.out.println("Total Number Of Wicktes : "+wicket);
           System.out.println("Match Fess Per Match : "+ matchFee);
          
        
    }
            
}


public class Array_Test {
    public static void main(String[] args){
        Information[] bpl = new Information[5];
        bpl[0]=new Information("Shakib Al Hasan","Dhaka Dynamites","All-Rounder",2500,186,500000);
         bpl[1]=new Information("Tamim Iqbal Khan","Chittagong Vikings","Opening Batsman",3000,0,300000);
          bpl[2]=new Information("Mashrafe Bin Mortaza","Comilla Victorians","Fast Bowler",500,116,300000);
           bpl[3]=new Information("Mushfiqur Rahim","Barisal Bulls","Wicket Keeper",1900,1,00000);
            bpl[4]=new Information("Mahmud-Ullah-Riyad","Khulna Titans","All-Rounder",2200,86,200000);
            
            for(int i=0;i<5;i++){
                System.out.println("Player Info Serial : "+(i+1));
                bpl[i].display();
                System.out.println();
                
            }
    }
    
}
