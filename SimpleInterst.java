package graphic;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleInterst extends JFrame implements ActionListener {

    JLabel lblprincipal, lblRate, lblTime, lblInterest;
    JTextField txtprincipal, txtRate, txtTime, txtInterest;
    JButton calculate;


    public SimpleInterst() {
        setTitle("My Second Frame:");
        setLayout(null);
        Container c = getContentPane();


        lblprincipal = new JLabel("enter the principal");
        lblprincipal.setBounds(20, 20, 150, 30);
        txtprincipal = new JTextField();
        txtprincipal.setBounds(20, 100, 150, 30);
        lblRate = new JLabel("enter the rate:");
        lblRate.setBounds(180, 100, 150, 30);

        lblTime = new JLabel("enter the time");
        lblTime.setBounds(20, 60, 150, 30);
        txtTime = new JTextField();
        txtTime.setBounds(180, 60, 150, 30);


        calculate = new JButton("calculate");
        calculate.setBounds(180, 60, 150, 30);

        lblInterest = new JLabel("Interest is:");
        lblInterest.setBounds(20, 200, 150, 40);

        txtInterest = new JTextField();
        txtInterest.setBounds(180, 200, 150, 30);

        c.add(lblprincipal);
        c.add(lblRate);
        c.add(lblTime);
        c.add(lblInterest);
        c.add(txtInterest);
        c.add(txtprincipal);
        c.add(txtRate);
        c.add(txtTime);
        c.add(calculate);


        calculate.addActionListener(this);
        setVisible(true);
        setLocationRelativeTo(null);
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


    }


    public static void main(String[] args) {
        new SimpleInterst();
    }


    public static float Interest(float p, float t, float r) {
        float result = (p * t * r) / 100;
        return result;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (txtprincipal.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "enter principal");

            txtprincipal.requestFocus();

        }

     else if(txtTime.getText().isEmpty()){
         JOptionPane.showMessageDialog(null,"enter time");
         txtTime.requestFocus();

        }

        else if(txtRate.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"enter rate");
            txtRate.requestFocus();

        }
        else if(e.getSource() == calculate){
            float p = Float.parseFloat(txtprincipal.getText());
            float t = Float.parseFloat(txtTime.getText());
            float r = Float.parseFloat(txtRate.getText());
            float result = Interest(p,t,r);
            txtInterest.setText(String.valueOf(Float.parseFloat(txtprincipal.getText())));

        }

        else{
            System.exit(0);
        }
    }


}


