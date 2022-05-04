import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;

public class MouseListener extends JFrame implements java.awt.event.MouseListener {
    @Override
    public void mouseClicked(MouseEvent e) {
        Graphics g = getGraphics();
        g.setColor(Color.red);
        g.drawRect(e.getX(),e.getY(),100,100);
        g.drawString("Hello World",200,300);
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    public static void main(String[] args) {
        new MouseListener();

    }

     public MouseListener(){
        setTitle("My mouse listener");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setLocationRelativeTo(null);
        setVisible(true);
        setSize(500,500);
        addMouseListener(this);
     }
}

