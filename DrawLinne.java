import javax.swing.*;
import java.awt.*;

public class DrawLinne extends JFrame {

    public DrawLinne(){
        setTitle("My Frame");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
        setSize(400,400);

    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(Color.red);
        g.drawLine(100,200,150,200);
        g.drawLine(100,300,150,300);
        g.setColor(Color.BLUE);
        g.drawLine(100,300,100,200);
        g.drawLine(150,300,150,200);

    }

    public static void main(String[] args) {
        new DrawLinne();
    }
}
