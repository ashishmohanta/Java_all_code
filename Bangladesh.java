
package awt;


import javax.swing.JFrame;
import java.awt.Graphics;
import java.awt.Color;

class Bangladesh extends JFrame
{
   
public Bangladesh()
{
//to  Set JFrame title
 super("BANGLADESH || VICTORY DAY || 16TH DECEMBER");

 //Set default close operation for JFrame
 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

 //Set JFrame size
 setSize(500,500);

 //Make JFrame visible
 setVisible(true);
 setResizable(false);
 
}

public void paint(Graphics g)
{
 super.paint(g);

 //draw rectangle outline
 g.drawRect(0,0,500,500);

 //set color to Green
 g.setColor(Color.GREEN);

 //fill rectangle with GREEN color
 g.fillRect(0,0,500,500);
  g.setColor(Color.RED);
// g.drawOval(250, 250, 50,50);
 g.fillOval(180, 160, 150,150);
 
}

public static void main(String[]args)
{
 Bangladesh rect=new Bangladesh();
}
}