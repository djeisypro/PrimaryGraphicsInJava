import java.awt.*;
import javax.swing.*;

public class GrowingAndMovingShapes extends JComponent {
    int x = 300, y = 325, xx = 0, yy = 0,
        a = 620, b = 0, aa = 650, bb = 650,
        m = 0, n = 625, q = 0, w = 625;

    static int my = 1200, mx = 1500;
    boolean flagx = true, flagy = true, flaga = false, flagb = true;

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
        // Снизу вверх
        if (m == 0 && n >= 0) n -= 1;
        // Слево направо
        if (m <= 1245 && n == 0) m += 1;
        // Сверху вниз
        if (m == 1245 && n <= 625) n += 1;
        // Справо налево
        if (m >= 0 && n == 625) m -= 1;
    }

    private void moveBall1() {
        // Внизу(направо)
        if (q <= 1245 && w == 625) q += 1;
        // Справа(вверх)
        if (q == 1245 && w >= 0) w -= 1;
        // Сверху(налево)
        if (q >= 0 && w == 0) q -= 1;
        // Слева вверх
        if (q == 0 && w <= 625) w += 1;
    }

    public void paintComponent(Graphics g) {
        super.paintComponents(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setPaint(Color.BLUE);
        g2d.fillRect(x, y, xx, yy);
        Color color = new Color(1, 0, 0, 0.0f);
        g2d.setPaint(color);
        g2d.drawRect(x, y, xx, yy);

        Graphics2D g2s = (Graphics2D) g;
        g2s.setPaint(Color.RED);
        g2s.fillRect(a, b, aa, bb);
        Color color1 = new Color(1, 0, 0, 0.0f);
        g2s.setPaint(color1);
        g2s.drawRect(a, b, aa, bb);

        Graphics2D g2a = (Graphics2D) g;
        g2a.setPaint(Color.GREEN);
        g2a.fillRect(m, n, 30, 30);
        Color color2 = new Color(1, 0, 0, 0.0f);
        g2a.setPaint(color2);
        g2a.drawRect(m, n, 30, 30);

        Graphics2D g2q = (Graphics2D) g;
        g2q.setPaint(Color.YELLOW);
        g2q.fillRect(q, w, 30, 30);
        Color color3 = new Color(1, 0, 0, 0.0f);
        g2q.setPaint(color3);
        g2q.drawRect(q, w, 30, 30);
    }

    public static void main(String[] args) throws InterruptedException {
        JFrame w = new JFrame("Растущие и движущиеся фигуры");
        GrowingAndMovingShapes canv = new GrowingAndMovingShapes();
        w.add(canv);
        w.setSize(mx, my);
        w.setVisible(true);
        w.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        w.setLayout(new BorderLayout(1, 1));

        while (true) {
            Thread.sleep(2);
            canv.GrowBall();
            canv.GrowBall1();
            canv.moveBall();
            canv.moveBall1();
            canv.repaint();
        }
    }
} 