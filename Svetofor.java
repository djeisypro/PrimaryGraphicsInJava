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
//Прямоугольник
    g.drawLine(100,100,300,100);
    g.drawLine(300,100,300,500);
    g.drawLine(300,500,100,500);
    g.drawLine(100,500,100,100);
//Овал
   g.drawOval(100,100,200,400);
//Красный
Color oldColor = g.getColor(); 
Color newColor = new Color(255, 0, 0); 
g.setColor(newColor);
g.fillOval(145, 120, 110, 110);
   g.drawOval(145,120,110,110);
//Желтый
Color oldColor1 = g.getColor(); 
Color newColor1 = new Color(255, 255, 0); 
g.setColor(newColor1);
g.fillOval(145, 240, 110, 110);
   g.drawOval(145,240,110,110);
//Зеленый
Color oldColor2 = g.getColor(); 
Color newColor2 = new Color(0, 255, 0); 
g.setColor(newColor2);
g.fillOval(145, 360, 110, 110);
   g.drawOval(145,360,110,110);
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