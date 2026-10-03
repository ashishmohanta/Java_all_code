
 import java.awt.*; 
 import java.awt.event.*; 
 import javax.swing.BoxLayout; 
 
 public class BoxLayoutExample implements WindowListener 
 { 
 private Frame frame; 
 private Button[] button; 
 
 public BoxLayoutExample() 
 { 
frame = new Frame("BoxLayout Example"); 

button = new Button[5]; 
for( int i = 0; i < button.length; i++ ) 
{ 
button[i] = new Button("Button " + (i + 1)); 
button[i].setFont( new Font("Consolas", Font.PLAIN, 16) ); 
} 
} 
private void show() 
{ 
frame.addWindowListener(this); 
//frame.setLayout( new BoxLayout(frame, BoxLayout.X_AXIS) ); 
frame.setLayout( new BoxLayout(frame, BoxLayout.Y_AXIS) ); 
for( int i = 0; i < button.length; i++ ) 
{ 
frame.add(button[i]); 
} 
frame.setSize(800, 600); 
frame.setResizable(true); 
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
BoxLayoutExample boxLayoutExample = new BoxLayoutExample(); 
boxLayoutExample.show(); 
} 
} 

