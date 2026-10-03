
 import java.awt.*; 
import java.awt.event.*; 
 
 public class GridLayoutExample implements WindowListener 
 { 
 private Frame frame; 
 private Button[] button; 
 
 private GridLayoutExample() 
 { 
 frame = new Frame("GridLayout Example"); 
 
 button = new Button[6]; 
 
 for(int i = 0; i < button.length; i++) 
 { 
 button[i] = new Button("Button " + (i + 1)); 
 button[i].setFont( new Font("Consolas", Font.PLAIN, 16) ); 
 } 
 } 
 
 private void show() 
 { 
 frame.setLayout( new GridLayout(2, 3) ); 
 //frame.setLayout( new GridLayout(3, 2, 20, 20) ); 
 
 for(int i = 0; i < button.length; i++) 
 { 
 frame.add(button[i]); 
 } 
 
 frame.addWindowListener(this); 
 frame.setSize(800, 600); 
 frame.setResizable(false); 
 frame.setBackground(Color.ORANGE); 
 frame.setVisible(true); 
 } 



 @Override 
 public void windowActivated(WindowEvent e) 
 { 
 } 
 
 @Override 
 public void windowClosed(WindowEvent e) 
 { 
 } 
 
 @Override 
 public void windowClosing(WindowEvent e) 
 { 
 System.exit(0); 
 } 
 
 @Override 
 public void windowDeactivated(WindowEvent e) 
 { 
 } 
 
 @Override 
 public void windowDeiconified(WindowEvent e) 
 { 
 } 
 
 @Override 
 public void windowIconified(WindowEvent e) 
 { 
 } 
 
 @Override 
 public void windowOpened(WindowEvent e) 
 { 
 } 
 
 public static void main(String[] args) 
 { 
 GridLayoutExample gridLayoutExample = new GridLayoutExample(); 
 
 gridLayoutExample.show(); 
 } 
 } 

