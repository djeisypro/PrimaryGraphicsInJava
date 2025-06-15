import java.awt.*;
import java.awt.event.*;
import java.awt.Graphics;

class Oval extends Graphics
{
    protected int x, y;
    public Oval() 
    {
        x = y = 0;
    }
    public Oval(int x, int y)
    {
        this.x = x;
        this.y = y;
    }
    public int getX() 
    {
        return x;
    }
    public int getY() 
    {
        return y;
    }
}

public class Tree
{
    private int color;
    public Tree() 
    {
        color = 0;
    }
    public Tree(int x, int y)
    { 
        color = 0;
    }
    public int getColor() 
    {
        return color;
    }
}

class HelloWorldFrame extends Frame
{  
     HelloWorldFrame(String s)
     {
     super(s);
     }
   public void paint(Oval g)
   {
    g.drawOval(120,80,80,120);
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