package graphic;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FirstGUI extends JFrame implements ActionListener {

    JLabel lblFirst, lblSecond, lblResult;
    JButton btnAdd, btnSubtract, btnMultiply, btnDivide;
    JTextField txtFirst;
    JTextField txtSecond;

    //constructor

    public FirstGUI() {
        setTitle("Hello World:");
        setLayout(null);
       // setSize(400, 400);
       // setLocationRelativeTo(null);
        //setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container c = getContentPane();

        lblFirst = new JLabel("LabelFirst");
        setBounds(20, 20, 150, 30);
        lblSecond = new JLabel("labelSecond");
        setBounds(20, 60, 150, 30);

        txtFirst = new JTextField("enter the first number");
        txtFirst.setBounds(180,20,150,30);
        txtSecond = new JTextField("enter the second number");
        txtSecond.setBounds(180,60,150,30);

        btnAdd = new JButton("Add");
        setBounds(20, 100, 150, 40);
        btnSubtract = new JButton("Subtract");
        setBounds(180, 100, 200, 40);
        btnMultiply = new JButton("Multiply");
        setBounds(20, 150, 150, 40);
        btnDivide = new JButton("Divide");
        setBounds(180, 150, 200, 40);
        txtFirst = new JTextField();
        setBounds(180, 20, 150, 30);
        txtSecond = new JTextField();
        setBounds(180, 60, 150, 30);

        lblResult = new JLabel("Result=0");
        setBounds(20, 200, 150, 30);

        c.add(lblFirst);
        c.add(btnAdd);
        c.add(lblSecond);
        c.add(lblResult);
        c.add(btnDivide);
        c.add(btnMultiply);
        c.add(btnSubtract);
        c.add(txtFirst);
        c.add(txtSecond);

        btnAdd.addActionListener(this);
        btnDivide.addActionListener(this);
        btnMultiply.addActionListener(this);
        btnSubtract.addActionListener(this);

        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setSize(400,400);


    }

    public static void main(String[] args) {
        new FirstGUI();
    }

    public static int add(int first, int second) {
        int result = first + second;
        return result;
    }

    public static int subtract(int first, int second) {
        int result = first - second;
        return result;
    }

    public static int Divide(int first, int second) {
        int result = first / second;
        return result;
    }

    public static int Multiply(int first, int second) {
        int result = first * second;
        return result;
    }

    @Override
    public void actionPerformed(ActionEvent e) {


        if (e.getSource() == btnAdd) {
            int first = Integer.parseInt((txtFirst.getText()));
            int second = Integer.parseInt(txtSecond.getText());
            int result = add(first, second);
            lblResult.setText(Integer.toString(result));

        } else if (e.getSource() == btnSubtract) {
            int first = Integer.parseInt(txtFirst.getText());
            int second = Integer.parseInt((txtSecond.getText()));
            int result = subtract(first, second);
            lblResult.setText(Integer.toString(result));
        }



        else if(e.getSource() == btnMultiply){
            int first = Integer.parseInt(txtFirst.getText());
            int second = Integer.parseInt(txtSecond.getText());
            int result = Multiply(first,second);
            lblResult.setText(Integer.toString(result));
        }

    }


}

