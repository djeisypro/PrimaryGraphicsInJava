import java.awt.*;
import java.awt.event.*;

class Oval
{
    int color, fill;
    long coordinates;
    boolean isVisible = false;
    Oval() 
    {
        color = fill = 0;
        coordinates = 0;
    }
    Oval(int color0,int fill0,int coordinates0) 
    {
        color = color0;
        fill = fill0;
        coordinates = coordinates0;
    }
    void hide() 
    {
        isVisible = false;
    }
    void show() 
    {
        isVisible = true;
    }
    void move(int x1,int y1) 
    {
        int x = x1;
        int y = y1;
    }
}

class HelloWorldFrame extends Frame
{  
     HelloWorldFrame(String s)
     {
     super(s);
     }
   public void paint(Graphics g)
   {
Color oldColor = g.getColor(); 
Color newColor = new Color(0, 255, 0);
Color badColor = new Color(0, 0, 255);

//Горизнтальный 
    g.drawOval(60,55,150,80);
    g.setColor(newColor);
    g.fillOval(60,55,149,79);
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