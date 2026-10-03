
import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.LayoutManager;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;


public class FlowLayout implements WindowListener
{
    private Frame frame;
    private Button[] button;
    
    public FlowLayout()
    {
        frame = new Frame("Flow - Layput");
        button = new Button[5];
        
        for(int i=0;i<button.length;i++)  // always use the object name ex: button.example
        {
            button[i] = new Button("Button "+(i+1));
            button[i].setFont(new Font("Consolas",Font.PLAIN,16));
            
        }
        
    }
    
    private void show()
    {
       
        
        
        for(int i=0;i<button.length;i++)
        {
            frame.add(button[i]);
        }
        frame.addWindowListener(this);
        frame.setSize(800,600);
        frame.setResizable(true);
        frame.setBackground(Color.ORANGE);
        frame.setVisible(true);
        
    }
    public static void main(String[] args)
    {
        FlowLayout flowlayout = new FlowLayout();
        flowlayout.show();
        
    }

    @Override
    public void windowOpened(WindowEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void windowClosing(WindowEvent e) {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    
       System.exit(0);
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
