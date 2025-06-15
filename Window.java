import java.awt.*;
import javax.swing.*;

public class Canvas extends JComponent {
    public void paintComponent(Graphics g) {
        super.paintComponents(g);
        Graphics2D g2d = (Graphics2D)g;
        
        // СОЛНЦЕ
        g2d.setPaint(Color.YELLOW);
        g.drawOval(480, 30, 75, 75);
        g2d.fillOval(480, 30, 75, 75);
        
        // КРЫША
        g2d.setPaint(Color.BLACK);
        g2d.drawLine(25, 175, 125, 75);
        g2d.drawLine(125, 75, 225, 175);
        
        // СТЕНА
        g2d.setPaint(Color.ORANGE);
        g2d.drawRect(50, 150, 150, 150);
        g2d.fillRect(50, 150, 150, 150);
        
        // ОКНО
        g2d.setPaint(Color.CYAN);
        g2d.drawRect(75, 200, 50, 50);
        g2d.fillRect(75, 200, 50, 50);
        
        // ТРУБА
        g2d.setPaint(Color.BLACK);
        g.drawLine(150, 100, 150, 75);
        g.drawLine(150, 75, 175, 75);
        g.drawLine(175, 75, 175, 125);
        
        // ТРАВА
        g2d.setPaint(Color.GREEN);
        g.drawLine(25, 300, 425, 300);
        
        // ДЕРЕВО
        g2d.setPaint(Color.GREEN);
        g.drawOval(350, 150, 75, 100);
        g2d.fillOval(350, 150, 75, 100);
        g2d.setPaint(Color.BLACK);
        g.drawLine(385, 250, 385, 300);
        g.drawLine(395, 250, 395, 300);
        
        // ОБЛАКА
        g2d.setPaint(Color.LIGHT_GRAY);
        g.drawOval(280, 30, 150, 75);
        g2d.fillOval(280, 30, 150, 75);
        g2d.setPaint(Color.LIGHT_GRAY);
        g.drawOval(110, 20, 160, 50);
        g2d.fillOval(110, 20, 160, 50);
        g.drawOval(0, 20, 100, 50);
        g2d.fillOval(0, 20, 100, 50);
        
        super.repaint();
    }
    
    public static void main(String[] args) {
        JFrame w = new JFrame("Окно с изображением");
        w.setSize(600, 600);
        w.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        w.setLayout(new BorderLayout(1,1));
        
        Canvas canv = new Canvas();
        w.add(canv);
        w.setVisible(true);
    }
} 