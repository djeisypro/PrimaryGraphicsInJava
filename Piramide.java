import java.awt.*;
import java.awt.event.*;

class HelloWorldFrame extends Frame
{  
     HelloWorldFrame(String s)
     {
     super(s);
     }
   public void paint(Graphics g)
   {
int p=50;
   for(int i=0;i<10;i++)
{
Color oldColor = g.getColor(); 
g.setColor(oldColor);
    g.drawOval(100+p*i,300,420,40);
    g.drawOval(140+p*i,260,350,40);
    g.drawOval(170+p*i,220,300,40);
    g.drawOval(200+p*i,180,250,40);
    g.drawOval(230+p*i,140,200,40);
    g.drawOval(260+p*i,100,150,40);
    g.drawOval(320+p*i,40,30,60); 
    for(int j=0;j<1000;j++){}
Color newColor = new Color(255, 255, 255);
g.setColor(newColor);
    g.drawOval(100+p*i,300,420,40);
    g.drawOval(140+p*i,260,350,40);
    g.drawOval(170+p*i,220,300,40);
    g.drawOval(200+p*i,180,250,40);
    g.drawOval(230+p*i,140,200,40);
    g.drawOval(260+p*i,100,150,40);
    g.drawOval(320+p*i,40,30,60); 
    for(int j=0;j<1000;j++){}
}
}
    public static void main(String args[])
    {
        Frame f=new HelloWorldFrame("My programm");
        f.setSize(1200/2,850/2);
        f.setVisible(true);
        f.addWindowListener(new WindowAdapter()
        {
           public void windowClosing(WindowEvent ev)
          {
                System.exit(0);
          }
        });   
    }
} 