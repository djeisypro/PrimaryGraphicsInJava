import java.awt.*;
import javax.swing.*;

public class Fractal extends JComponent {
    static int my = 1200, mx = 1500;

    public void paintComponent(Graphics g) {
        super.paintComponents(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setPaint(Color.BLACK);

        // Рисуем треугольники слева
        for (int i = 0; i < 5; i++) {
            int[] xPoints = {100 + i*50, 150 + i*50, 200 + i*50};
            int[] yPoints = {300, 200, 300};
            g2d.drawPolygon(xPoints, yPoints, 3);
        }

        // Рисуем звезду в центре
        int[] xPoints = {600, 650, 700, 650, 600, 550, 500, 550};
        int[] yPoints = {200, 250, 300, 350, 300, 350, 300, 250};
        g2d.drawPolygon(xPoints, yPoints, 8);

        // Рисуем снежинку справа
        for (int i = 0; i < 6; i++) {
            int[] xPoints1 = {800 + i*30, 850 + i*30, 900 + i*30};
            int[] yPoints1 = {300, 200, 300};
            g2d.drawPolygon(xPoints1, yPoints1, 3);
        }
    }

    public static void main(String[] args) {
        JFrame w = new JFrame("Фрактальная графика");
        Fractal canv = new Fractal();
        w.add(canv);
        w.setSize(mx, my);
        w.setVisible(true);
        w.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        w.setLayout(new BorderLayout(1, 1));
    }
} 