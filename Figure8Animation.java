import java.awt.*;
import javax.swing.*;

public class Figure8Animation extends JComponent {
    int x = 0, y = 0;
    static int my = 1000, mx = 1000;
    boolean flagx = false, flagy = false;

    protected void moveBall() {
        // Вверху направо
        if (x < 455 && y == 0 && !flagx && !flagy) x += 1;
        if (x == 455 && y == 0) flagx = true;
        // Движение по диагонали справо налево вниз
        if (x > 0 && y < 455 && flagx && !flagy) {
            x -= 1;
            y += 1;
        }
        // Внизу направо
        if (x < 455 && y == 455 && !flagy) {
            x += 1;
        }
        // По диагонали слево направо вверх
        if (x > 0 && y > 0 && flagx && flagy) {
            x -= 1;
            y -= 1;
        }
        if (x == 0 && y == 0) {
            flagx = false;
            flagy = false;
        }
        if (x == 455 && y == 455) flagy = true;
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
        JFrame w = new JFrame("Анимация в виде восьмерки");
        Figure8Animation animation = new Figure8Animation();
        
        w.add(animation);
        w.setSize(1000, 1000);
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