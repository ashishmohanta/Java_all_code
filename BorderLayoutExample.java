
 import java.awt.*; 
 import java.awt.event.*; 
 
 public class BorderLayoutExample implements WindowListener 
 { 
 private Frame frame; 
 private Button[] button; 
 
 public BorderLayoutExample() 
 { 
 frame = new Frame("FlowLayout Example"); 
 
 button = new Button[5]; 
 
 for(int i = 0; i < button.length; i++) 
 { 
 button[i] = new Button("Button " + (i + 1)); 
 button[i].setFont( new Font("Consolas", Font.PLAIN, 16) ); 
 } 
 } 
 
 private void show() 
 { 
 frame.setLayout( new BorderLayout() ); 
 //frame.setLayout( new BorderLayout(10, 25) ); 
 
 frame.add(button[0], BorderLayout.NORTH); 
 frame.add(button[1], BorderLayout.SOUTH); 
 frame.add(button[2], BorderLayout.EAST); 
 frame.add(button[3], BorderLayout.WEST); 
 frame.add(button[4], BorderLayout.CENTER); 
 
 frame.addWindowListener(this); 
 frame.setSize(800, 600); 
 frame.setResizable(true); 
 frame.setBackground(Color.ORANGE); 
 frame.setVisible(true); 
 } 



 @Override 
 public void windowOpened(WindowEvent e) 
 { 
 } 
 
 @Override 
 public void windowClosing(WindowEvent e) 
 { 
 System.exit(0); 
 } 
 
 @Override 
 public void windowClosed(WindowEvent e) 
 { 
 } 
 
 @Override 
 public void windowIconified(WindowEvent e) 
 { 
 } 
 
 @Override 
 public void windowDeiconified(WindowEvent e) 
 { 
 } 

@Override 
 public void windowActivated(WindowEvent e) 
 { 
 } 
 
 @Override 
 public void windowDeactivated(WindowEvent e) 
 { 
 } 
 
 public static void main(String[] args) 
 { 
 BorderLayoutExample borderLayoutExample = new BorderLayoutExample(); 
 
 borderLayoutExample.show(); 
 } 
 } 

