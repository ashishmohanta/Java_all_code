
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;


public class File_Append {
   public static String str;
   public static String s;
    
    public static void main(String[] args) throws IOException{
      
        
        File file = new File("D:","MyText.txt");
        File file1 = new File("D:","AppendText.txt");
        try{
            BufferedReader in = new BufferedReader(new FileReader(file));
         String    str = in.readLine();
            while(str!=null){
                System.out.println("String: "+str);
                str = in.readLine();
                
            }
            in.close();
            
        }catch(Exception e){
            e.printStackTrace();
        }
        
//        System.out.println("Write SomeThing: ");
        
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader i = new BufferedReader(isr);
        try{
            System.out.println("Write Something: ");
            s= i.readLine();
            i.close();
            
        }catch(Exception e1){
            e1.printStackTrace();
        }
     
        try{
            String s1=str+"\n"+s;
        PrintWriter out = new PrintWriter(new FileWriter(file1));
        out.println(s1);
        out.close();
        }catch(Exception e2){
            e2.printStackTrace();
        }
    }
    
}
