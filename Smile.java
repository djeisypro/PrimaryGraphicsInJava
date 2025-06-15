import java.awt.*;
import javax.swing.*;

public class Smile extends JComponent {
    int x = 0, y = 550, // Координаты желтого лица по х и у
        x1 = 20, y1 = 570, // Координаты первого левого глаза по х и у
        x2 = 55, y2 = 570, // Координаты второго правого глаза по х и у
        x3 = 40, y3 = 615, // Координаты черного шарика рта по х и у
        x4 = 40, y4 = 610, // Координаты желтого шарика перекрывающего координаты черного шарика рта по х и у
        x5 = 40, y5 = 610, // Координаты первой левой ноздри по х и у
        x6 = 55, y6 = 610; // Координаты второй правой ноздри по х и у
    int nColor = 0;
    Color[] A = {Color.YELLOW, Color.GREEN, Color.BLUE, Color.RED};
    
    static int my = 1200, mx = 900;
    boolean flagx = false, flagy = false;
    
    private void moveSmile() {
        if(x == 0) {flagx = true; nColor+=1; if(nColor>=3) {nColor=0;}}
        if(x == mx - 50) {flagx = false; nColor+=1; if(nColor>=3) {nColor=0;}}
        if(flagx) x+=1; 
        else x-=1;
        if(y == 0) {flagy = true; nColor+=1; if(nColor>=3) {nColor=0;}}
        if(y == my - 590) {flagy = false; nColor+=1; if(nColor>=3) {nColor=0;}}
        if(flagy) y+=1;
        else y-=1;
        
        if(x1 == 0) {flagx = true; nColor+=1; if(nColor>=3) {nColor=0;}}
        if(x1 == mx - 50) {flagx = false; nColor+=1; if(nColor>=3) {nColor=0;}}
        if(flagx) x1+=1;
        else x1-=1;
        if(y1 == 0) {flagy = true; nColor+=1; if(nColor>=3) {nColor=0;}}
        if(y1 == my - 590) {flagy = false; nColor+=1; if(nColor>=3) {nColor=0;}}
        if(flagy) y1+=1;
        else y1-=1;
        
        if(x2 == 0) {flagx = true; nColor+=1; if(nColor>=3) {nColor=0;}}
        if(x2 == mx - 50) {flagx = false; nColor+=1; if(nColor>=3) {nColor=0;}}
        if(flagx) x2+=1;
        else x2-=1;
        if(y2 == 0) {flagy = true; nColor+=1; if(nColor>=3) {nColor=0;}}
        if(y2 == my - 590) {flagy = false; nColor+=1; if(nColor>=3) {nColor=0;}}
        if(flagy) y2+=1;
        else y2-=1;
        
        if(x3 == 0) {flagx = true; nColor+=1; if(nColor>=3) {nColor=0;}}
        if(x3 == mx - 50) {flagx = false; nColor+=1; if(nColor>=3) {nColor=0;}}
        if(flagx) x3+=1;
        else x3-=1;
        if(y3 == 0) {flagy = true; nColor+=1; if(nColor>=3) {nColor=0;}}
        if(y3 == my - 590) {flagy = false; nColor+=1; if(nColor>=3) {nColor=0;}}
        if(flagy) y3+=1;
        else y3-=1;
        
        if(x4 == 0) {flagx = true; nColor+=1; if(nColor>=3) {nColor=0;}}
        if(x4 == mx - 50) {flagx = false; nColor+=1; if(nColor>=3) {nColor=0;}}
        if(flagx) x4+=1;
        else x4-=1;
        if(y4 == 0) {flagy = true; nColor+=1; if(nColor>=3) {nColor=0;}}
        if(y4 == my - 590) {flagy = false; nColor+=1; if(nColor>=3) {nColor=0;}}
        if(flagy) y4+=1;
        else y4-=1;
        
        if(x5 == 0) {flagx = true; nColor+=1; if(nColor>=3) {nColor=0;}}
        if(x5 == mx - 50) {flagx = false; nColor+=1; if(nColor>=3) {nColor=0;}}
        if(flagx) x5+=1;
        else x5-=1;
        if(y5 == 0) {flagy = true; nColor+=1; if(nColor>=3) {nColor=0;}}
        if(y5 == my - 590) {flagy = false; nColor+=1; if(nColor>=3) {nColor=0;}}
        if(flagy) y5+=1;
        else y5-=1;
        
        if(x6 == 0) {flagx = true; nColor+=1; if(nColor>=3) {nColor=0;}}
        if(x6 == mx - 50) {flagx = false; nColor+=1; if(nColor>=3) {nColor=0;}}
        if(flagx) x6+=1;
        else x6-=1;
        if(y6 == 0) {flagy = true; nColor+=1; if(nColor>=3) {nColor=0;}}
        if(y6 == my - 590) {flagy = false; nColor+=1; if(nColor>=3) {nColor=0;}}
        if(flagy) y6+=1;
        else y6-=1;
    }
    
    public void paintComponent(Graphics g) {
        super.paintComponents(g);
        Graphics2D g2d = (Graphics2D)g;
        g2d.setPaint(A[nColor]);
        g2d.fillOval(x, y, 100, 100);
        Color color = new Color(1,0,0,0.0f);
        g2d.setPaint(color);
        g2d.drawOval(x, y, 100, 100);
        
        super.paintComponents(g);
        Graphics2D g2s = (Graphics2D)g;
        g2s.setPaint(Color.BLACK);
        g2s.fillOval(x1, y1, 30, 30);
        Color color1 = new Color(1,0,0,0.0f);
        g2s.setPaint(color1);
        g2s.drawOval(x1, y1, 30, 30);
        
        super.paintComponents(g);
        Graphics2D g2q = (Graphics2D)g;
        g2q.setPaint(Color.BLACK);
        g2q.fillOval(x2, y2, 30, 30);
        Color color2 = new Color(1,0,0,0.0f);
        g2q.setPaint(color2);
        g2q.drawOval(x2, y2, 30, 30);
        
        super.paintComponents(g);
        Graphics2D g2a = (Graphics2D)g;
        g2a.setPaint(Color.BLACK);
        g2a.fillOval(x3, y3, 30, 30);
        Color color3 = new Color(1,0,0,0.0f);
        g2a.setPaint(color3);
        g2a.drawOval(x3, y3, 30, 30);
        
        super.paintComponents(g);
        Graphics2D g2z = (Graphics2D)g;
        g2z.setPaint(A[nColor]);
        g2z.fillOval(x4, y4, 30, 30);
        Color color4 = new Color(1,0,0,0.0f);
        g2z.setPaint(color4);
        g2z.drawOval(x4, y4, 30, 30);
        
        super.paintComponents(g);
        Graphics2D g2x = (Graphics2D)g;
        g2x.setPaint(Color.BLACK);
        g2x.fillOval(x5, y5, 10, 10);
        Color color5 = new Color(1,0,0,0.0f);
        g2x.setPaint(color5);
        g2x.drawOval(x5, y5, 10, 10);
        
        super.paintComponents(g);
        Graphics2D g2t = (Graphics2D)g;
        g2t.setPaint(Color.BLACK);
        g2t.fillOval(x6, y6, 10, 10);
        Color color6 = new Color(1,0,0,0.0f);
        g2t.setPaint(color6);
        g2t.drawOval(x6, y6, 10, 10);
    }
    
    public static void main(String[] args) throws InterruptedException {
        JFrame w = new JFrame("Окно с изображением");
        Smile canv = new Smile();
        w.add(canv);
        w.setSize(mx, my);
        w.setVisible(true);
        w.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        w.setLayout(new BorderLayout(1,1));
        
        while(true) {
            canv.moveSmile();
            canv.repaint();
            Thread.sleep(2);
        }
    }
} 