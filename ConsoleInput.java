
import java.io.BufferedReader;
import java.io.InputStreamReader;


public class ConsoleInput {
    public static void main(String[] args){
        String s;
        InputStreamReader isr = new InputStreamReader ( System . in ) ; //It takes input each character
        BufferedReader in = new BufferedReader ( isr ) ;//Each line is stored in the BufferedReader
        try{
            System.out.println ("Input : " ) ;
            s = in.readLine ();  // Storing the line in String S
            System.out.println ("You Entered : " + s ) ;
            in.close() ;  // Closing the scanner
            
        }catch(Exception e){
            e.printStackTrace ( ) ;  //It tells  what happened and where in the code this happened.
            
        }
        
    }
    
}
