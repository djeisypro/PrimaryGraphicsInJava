import java.awt.*;
import java.awt.Color;
import java.awt.event.*;
import java.awt.Dimension;

class HelloWorldFrame extends Frame
{  
     HelloWorldFrame(String s)
     {
     super(s);
     }
   public void paint(Graphics g)
   {
//Стены дома
    g.drawRect(100,100,100,100);
//Окно
    g.drawLine(120,120,120,160);
    g.drawLine(120,160,160,160);
    g.drawLine(120,120,160,120);
    g.drawLine(160,120,160,160);
//Крона дерева
    g.drawOval(230,40,100,130);
//Ствол дерева
    g.drawLine(260,160,260,200);
    g.drawLine(300,160,300,200);
//Земля
    g.drawLine(10,200,330,200);
//Крыша
    g.drawLine(145,40,75,140);
    g.drawLine(145,40,225,140);
//Труба
    g.drawLine(170,60,190,60);
    g.drawLine(170,60,170,70);
    g.drawLine(190,60,190,100);
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