import javax.swing.*;
import java.awt.*;

public class DrawTriangle extends JFrame {

    public DrawTriangle(){
        setTitle("the triangle");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);
        setSize(400,400);
        setVisible(true);

    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(Color.red);
        g.drawRect(100,29,56,78);
        g.fillRect(100,29,56,78);
        g.drawLine(100,50,200,50);
        g.drawLine(180,200,100,50);
        g.drawLine(200,50,180,200);

    }

    public static void main(String[] args) {
        new DrawTriangle();
    }
}
