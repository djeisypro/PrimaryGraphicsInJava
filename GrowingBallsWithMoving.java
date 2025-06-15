import java.awt.*;
import javax.swing.*;

public class GrowingBallsWithMoving extends JComponent {
    int x = 300, y = 325, xx = 0, yy = 0,
        a = 620, b = 0, aa = 650, bb = 650,
        c = 0, d = 0, cc = 0, dd = 0;

    static int my = 1200, mx = 1500;
    boolean flagx = true, flagy = true, flaga = false, flagb = true, flagc = true, flagd = true;

    private void GrowBall() {
        // Увеличение
        if (xx < 650 && yy < 650 && flagx) {
            xx += 2;
            yy += 2;
            x -= 1;
            y -= 1;
        }
        if (xx == 650 && yy == 650) flagx = false;
        // Уменьшение
        if (xx >= 0 && yy >= 0 && !flagx) {
            xx -= 2;
            yy -= 2;
            x += 1;
            y += 1;
        }
        if (xx == 0 && yy == 0) flagx = true;
    }

    private void GrowBall1() {
        // Уменьшение
        if (aa >= 0 && bb >= 0 && !flaga) {
            aa -= 2;
            bb -= 2;
            a += 1;
            b += 1;
        }
        if (aa == 0 && bb == 0) flaga = true;
        // Увеличение
        if (aa < 650 && bb < 650 && flaga) {
            aa += 2;
            bb += 2;
            a -= 1;
            b -= 1;
        }
        if (aa == 650 && bb == 650) flaga = false;
    }

    private void moveBall() {
        if (c < 650 && d < 650 && flagc) {
            c += 2;
            d += 2;
        }
        if (c == 650 && d == 650) flagc = false;
        if (c >= 0 && d >= 0 && !flagc) {
            c -= 2;
            d -= 2;
        }
        if (c == 0 && d == 0) flagc = true;
    }

    public void paintComponent(Graphics g) {
        super.paintComponents(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setPaint(Color.BLUE);
        g2d.fillOval(x, y, xx, yy);
        Color color = new Color(1, 0, 0, 0.0f);
        g2d.setPaint(color);
        g2d.drawOval(x, y, xx, yy);

        Graphics2D g2s = (Graphics2D) g;
        g2s.setPaint(Color.RED);
        g2s.fillOval(a, b, aa, bb);
        Color color1 = new Color(1, 0, 0, 0.0f);
        g2s.setPaint(color1);
        g2s.drawOval(a, b, aa, bb);

        Graphics2D g2f = (Graphics2D) g;
        g2f.setPaint(Color.GREEN);
        g2f.fillOval(c, d, cc, dd);
        Color color2 = new Color(1, 0, 0, 0.0f);
        g2f.setPaint(color2);
        g2f.drawOval(c, d, cc, dd);
    }

    public static void main(String[] args) throws InterruptedException {
        JFrame w = new JFrame("Растущие шарики с движущимся");
        GrowingBallsWithMoving canv = new GrowingBallsWithMoving();
        w.add(canv);
        w.setSize(mx, my);
        w.setVisible(true);
        w.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        w.setLayout(new BorderLayout(1, 1));

        while (true) {
            canv.GrowBall();
            canv.GrowBall1();
            canv.moveBall();
            canv.repaint();
            Thread.sleep(2);
        }
    }
} 