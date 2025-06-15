import java.awt.*;
import java.awt.event.*;

class HelloWorldFrame extends Frame {
    HelloWorldFrame(String s) {
        super(s);
    }
    
    public void paint(Graphics g) {
        // Прямоугольник
        g.drawLine(40, 40, 260, 40);
        g.drawLine(40, 40, 40, 200);
        g.drawLine(40, 200, 260, 200);
        g.drawLine(260, 40, 260, 200);
        
        // Квадрат
        g.drawLine(80, 220, 160, 220);
        g.drawLine(80, 220, 80, 300);
        g.drawLine(80, 300, 160, 300);
        g.drawLine(160, 300, 160, 220);
        
        // Треугольник равносторонний
        g.drawLine(260, 240, 180, 380); // /
        g.drawLine(180, 380, 340, 380); // _
        g.drawLine(340, 380, 260, 240); // \
        
        // Треугольник прямоугольный
        g.drawLine(300, 40, 520, 40);
        g.drawLine(300, 40, 300, 280);
        g.drawLine(300, 280, 520, 40);
    }
    
    public static void main(String args[]) {
        Frame f = new HelloWorldFrame("My programm");
        f.setSize(1200/2, 850/2);
        f.setVisible(true);
        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent ev) {
                System.exit(0);
            }
        });
    }
} 