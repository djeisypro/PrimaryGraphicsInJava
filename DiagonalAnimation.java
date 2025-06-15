import java.awt.*;
import javax.swing.*;

public class DiagonalAnimation extends JComponent {
    int x = 0, y = 0;
    static int my = 500, mx = 500;
    boolean flagx = false, flagy = false;

    protected void moveBall() {
        if (x == 0) flagx = true;
        if (x == mx - 45) flagx = false;
        if (flagx) x += 1;
        else x -= 1;
        if (y == 0) flagy = true;
        if (y == my - 85) flagy = false;
        if (flagy) y += 1;
        else y -= 1;
    }

    public void paintComponent(Graphics g) {
        super.paintComponents(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.fillOval(x, y, 30, 30);
        Color color = new Color(1, 0, 0, 0.0f);
        g2d.setPaint(color);
        g2d.drawOval(x, y, 30, 30);
    }

    public static void main(String[] args) throws InterruptedException {
        JFrame w = new JFrame("Анимация по диагонали");
        DiagonalAnimation animation = new DiagonalAnimation();
        
        w.add(animation);
        w.setSize(500, 500);
        w.setVisible(true);
        w.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        w.setLayout(new BorderLayout(1, 1));

        while (true) {
            animation.moveBall();
            animation.repaint();
            Thread.sleep(2);
        }
    }
} 