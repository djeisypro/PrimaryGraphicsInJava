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
   for(int i=0;i<3;i++)
{
//Прямоугольник
     g.drawLine(40,40+p*i,120,40+p*i);// -
     g.drawLine(40,40+p*i,40,80+p*i);// |
     g.drawLine(40,80+p*i,120,80+p*i);// _
     g.drawLine(120,40+p*i,120,80+p*i);//  |

//Квадрат
     g.drawLine(140,40+p*i,180,40+p*i);
     g.drawLine(140,40+p*i,140,80+p*i);
     g.drawLine(140,80+p*i,180,80+p*i);
     g.drawLine(180,80+p*i,180,40+p*i); 

//Треугольник прямоугольный
     g.drawLine(200,40+p*i,240,40+p*i); 
     g.drawLine(200,40+p*i,200,80+p*i); 
     g.drawLine(200,80+p*i,240,40+p*i);

//Треугольник равносторонний
     g.drawLine(280,40+p*i,260,80+p*i); 
     g.drawLine(260,80+p*i,300,80+p*i); 
     g.drawLine(300,80+p*i,280,40+p*i);
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