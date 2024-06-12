import javax.swing.*;

public class Calculator extends JFrame {

    Calculator() {
        JFrame Frame = new JFrame();
        JTextField tf1 = new JTextField();
        tf1.setBounds(50,50,150,20);
        JTextField tf2 = new JTextField();
        tf2.setBounds(50,100,150,20);
        JTextField tf3 = new JTextField();
        tf3.setBounds(50,150,150,20);
        tf3.setEditable(false);
        JButton button = new JButton("+");
        JButton button2 = new JButton("-");
        button.setBounds(50,200,50,50);
        button2.setBounds(120,200,50,50);
        Frame.add(tf1);
        Frame.add(tf2);
        Frame.add(tf3);
        Frame.add(button);
        Frame.add(button2);
        Frame.setSize(300,300);
        Frame.setLayout(null);
        Frame.setVisible(true);

    }

    public static void main(String[] args) {
        new Calculator();
    }
}
