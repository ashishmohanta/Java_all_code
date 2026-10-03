import java.awt.*;
import java.awt.event.*; 
public class FrameWithPanel implements WindowListener

{ 
    private Frame frame;
    private Panel panel;
    public FrameWithPanel()
    {
        frame = new Frame("Frame With Panel");   // Frame is bulit in
        panel = new Panel();                     // Panel is built in
    }
    public void show()
    {
        frame.addWindowListener(this); //It will listen what window does
        frame.setSize(800,600); // 800 is width , 600 is length
        frame.setBackground(Color.ORANGE);
        frame.setLayout(null); // if we don't set frame.setLayout(null) null inside the first bracket the panel won't be showed
        
        panel.setSize(400, 300);
        panel.setBackground(Color.MAGENTA);
        
        frame.add(panel);  // Adding the panel in the frame
        frame.setResizable(true);
        frame.setVisible(true);
        
        
        
    }
    public static void main(String[] args)
    {
        //  Abstract Window Toolkit [A.W.T]
        FrameWithPanel framewithpanel = new FrameWithPanel();   // Constructor is calling to create the frame
        framewithpanel.show(); // Calling the method to show the components
    }

    @Override
    public void windowOpened(WindowEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void windowClosing(WindowEvent e) {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        System.exit(0);
        // If we don't set System.exit(0); then the window will not close
    }

    @Override
    public void windowClosed(WindowEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void windowIconified(WindowEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void windowDeiconified(WindowEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void windowActivated(WindowEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
