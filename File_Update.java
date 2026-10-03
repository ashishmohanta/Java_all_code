
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.InputStreamReader;


public class File_Update {
    public static void main(String[] args){
        //File file = new File("D:","programmer.txt");
        try{
            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader in = new BufferedReader(isr);
            BufferedWriter writer =null;
            String line = null;
            while((line = in.readLine())!=null){
                writer = new BufferedWriter(new FileWriter("coder.txt"));
                writer.write(line);
                System.out.println(line);
                writer.close();
               
            }
            
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    
}
