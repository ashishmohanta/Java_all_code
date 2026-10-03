
import java.util.Scanner;   //Importing Scanner
public class InputString 
{
    public static void main(String[] args)
    {
        String c;  // Declaring A Sring Variable
        Scanner s = new Scanner(System.in);  // Creating An Object s under Class called scanner
        System.out.println("Input Your Name: ");
        c = s.nextLine();  // Storing the inputted Name to c [c is a string ]
        System.out.println("Your Name Is : " + c);
        
    }
    
}
