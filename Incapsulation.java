import java.awt.*;
import java.awt.event.*;

class Oval
{
    private int x, y;
    Oval(int x0,int y0) 
    {
        x = x0;
        y = y0;
    }
    public void move()
    {
        System.out.println("x="+x);
        System.out.println("y="+y);
    }
    public void move(int x1,int y1)
    {
        x = x1;
        y = y1;
        System.out.println("x="+x);
        System.out.println("y="+y);
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

class HelloWorldFrame extends Frame
{  
     HelloWorldFrame(String s)
     {
     super(s);
     }
   public void paint(Oval g)
   {
   }
   
    public static void main(String args[])
    {
        Oval a = new Oval(20,30);
        int z;
        z = a.getY();
        a.move();
        a.move(z,a.getY());
        a.move(a.getX()-z,a.getY()+z);
        System.out.println("z="+z);
    }
} 