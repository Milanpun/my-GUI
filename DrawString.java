import javax.swing.*;
import java.awt.*;

public class DrawString extends JFrame {

    public DrawString() {

        setTitle("myframe");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500,500);
        setVisible(true);
    }


        @Override
        public void paint (Graphics g){
            super.paint(g);
            g.setColor(Color.RED);
            g.setFont(new Font(Font.SERIF,Font.BOLD,24));
            g.drawString("Good",250,300);
        }


    public static void main(String[] args) {
        new DrawString();
    }
}
