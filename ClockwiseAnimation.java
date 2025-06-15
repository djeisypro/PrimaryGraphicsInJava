import java.awt.*;
import javax.swing.*;

public class ClockwiseAnimation extends JComponent {
    int x = 0, y = 434;
    static int my = 500, mx = 500;

    protected void moveBall() {
        // Снизу вверх
        if (x == 0 && y >= 0) y -= 1;
        // Слево направо
        if (x <= 455 && y == 0) x += 1;
        // Сверху вниз
        if (x == 455 && y <= 433) y += 1;
        // Справо налево
        if (x >= 0 && y == 434) x -= 1;
    }

    public void paintComponent(Graphics g) {
        super.paintComponents(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setPaint(Color.BLUE);
        g2d.fillOval(x, y, 30, 30);
        Color color = new Color(1, 0, 0, 0.0f);
        g2d.setPaint(color);
        g2d.drawOval(x, y, 30, 30);
    }

    public static void main(String[] args) throws InterruptedException {
        JFrame w = new JFrame("Анимация по часовой стрелке");
        ClockwiseAnimation animation = new ClockwiseAnimation();
        
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