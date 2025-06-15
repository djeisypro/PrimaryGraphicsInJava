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
      Color newColor = new Color(255, 0, 0); 
    g.setColor(newColor);
    g.drawLine(50,150,200,150);
    g.drawLine(200,150,200,300);
    g.drawLine(200,300,50,300);
    g.drawLine(50,300,50,150);
//Окно
    Color newColor1 = new Color(0, 255, 255); 
    g.setColor(newColor1);
    g.fillRect(75,200,50,50);
    g.drawLine(75,200,125,200);
    g.drawLine(125,200,125,250);
    g.drawLine(125,250,75,250);
    g.drawLine(75,250,75,200);
//Крона дерева
    Color newColor2 = new Color(0, 255, 0); 
    g.setColor(newColor2);
    g.fillOval(210,30,210,220);
    g.drawOval(210,30,210,220);
    
//Ствол дерева
    Color newColor3 = new Color(0, 0, 0); 
    g.setColor(newColor3);
    g.drawLine(300,250,300,300);
    g.drawLine(325,250,325,300);
//Земля
   Color newColor4 = new Color(255, 255, 0); 
    g.setColor(newColor4);
    g.drawLine(25,300,400,300);
//Крыша
 Color newColor5 = new Color(255, 0, 255); 
    g.setColor(newColor5);
    g.drawLine(25,175,125,75);
    g.drawLine(125,75,225,175);
//Труба
    Color newColor6 = new Color(0, 0, 255); 
    g.setColor(newColor6);
    g.drawLine(150,75,150,100);
    g.drawLine(150,75,175,75);
    g.drawLine(175,75,175,125);
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