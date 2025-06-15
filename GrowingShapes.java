import java.awt.*;
import javax.swing.*;

public class GrowingShapes extends JComponent {
    int x = 200, y = 625, xx = 50, yy = 0,
        a = 220, b = 650, aa = 5, bb = 5,
        x1 = 600, y1 = 625, xx1 = 50, yy1 = 0,
        a1 = 620, b1 = 650, aa1 = 5, bb1 = 5,
        x2 = 1000, y2 = 625, xx2 = 50, yy2 = 0,
        a2 = 1020, b2 = 650, aa2 = 5, bb2 = 5;

    static int my = 1200, mx = 1500;
    boolean flagx = true, flagy = true, flaga = false, flagb = true,
            flagx1 = true, flagx2 = true, flaga1 = true, flaga2 = true;

    private void GrowRect() {
        // Увеличение зеленого стебля
        if (yy < 500 && flagx) {
            yy += 2;
            y -= 1;
            b -= 1;
        }
        if (yy == 500) flagx = false;

        // Увеличение желтого шарика 
        if (aa < 400 && bb < 400) {
            b -= 2;
            a -= 1;
            aa += 2;
            bb += 2;
        }
        if (aa == 400 && bb == 400) flaga = false;

        // Увеличение синего стебля
        if (yy1 < 500 && flagx1) {
            yy1 += 2;
            y1 -= 1;
            b1 -= 1;
        }
        if (yy1 == 500) flagx1 = false;

        // Увеличение оранжевого шарика 
        if (aa1 < 400 && bb1 < 400) {
            b1 -= 2;
            a1 -= 1;
            aa1 += 2;
            bb1 += 2;
        }
        if (aa1 == 400 && bb1 == 400) flaga1 = false;

        // Увеличение серого стебля
        if (yy2 < 500 && flagx2) {
            yy2 += 2;
            y2 -= 1;
            b2 -= 1;
        }
        if (yy2 == 500) flagx2 = false;

        // Увеличение розового шарика 
        if (aa2 < 400 && bb2 < 400) {
            b2 -= 2;
            a2 -= 1;
            aa2 += 2;
            bb2 += 2;
        }
        if (aa2 == 400 && bb2 == 400) flaga2 = false;
    }

    public void paintComponent(Graphics g) {
        super.paintComponents(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setPaint(Color.GREEN);
        g2d.fillRect(x, y, xx, yy);
        Color color = new Color(1, 0, 0, 0.0f);
        g2d.setPaint(color);
        g2d.drawRect(x, y, xx, yy);

        Graphics2D g2s = (Graphics2D) g;
        g2s.setPaint(Color.YELLOW);
        g2s.fillOval(a, b, aa, bb);
        Color color1 = new Color(1, 0, 0, 0.0f);
        g2s.setPaint(color1);
        g2s.drawOval(a, b, aa, bb);

        Graphics2D g2a = (Graphics2D) g;
        g2a.setPaint(Color.BLUE);
        g2a.fillRect(x1, y1, xx1, yy1);
        Color color2 = new Color(1, 0, 0, 0.0f);
        g2a.setPaint(color2);
        g2a.drawRect(x1, y1, xx1, yy1);

        Graphics2D g2z = (Graphics2D) g;
        g2z.setPaint(Color.ORANGE);
        g2z.fillOval(a1, b1, aa1, bb1);
        Color color3 = new Color(1, 0, 0, 0.0f);
        g2z.setPaint(color3);
        g2z.drawOval(a1, b1, aa1, bb1);

        Graphics2D g2q = (Graphics2D) g;
        g2q.setPaint(Color.GRAY);
        g2q.fillRect(x2, y2, xx2, yy2);
        Color color4 = new Color(1, 0, 0, 0.0f);
        g2q.setPaint(color4);
        g2q.drawRect(x2, y2, xx2, yy2);

        Graphics2D g2f = (Graphics2D) g;
        g2f.setPaint(Color.PINK);
        g2f.fillOval(a2, b2, aa2, bb2);
        Color color5 = new Color(1, 0, 0, 0.0f);
        g2f.setPaint(color5);
        g2f.drawOval(a2, b2, aa2, bb2);
    }

    public static void main(String[] args) throws InterruptedException {
        JFrame w = new JFrame("Растущие фигуры");
        GrowingShapes canv = new GrowingShapes();
        w.add(canv);
        w.setSize(mx, my);
        w.setVisible(true);
        w.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        w.setLayout(new BorderLayout(1, 1));

        while (true) {
            Thread.sleep(10);
            canv.GrowRect();
            canv.repaint();
        }
    }
} 