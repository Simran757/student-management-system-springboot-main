import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        JFrame jFrame =new JFrame();
        JButton jButton =new JButton("click");
        jButton.setSize(100,50);
        jButton.setBounds(150,80,90,20);
        jFrame.add(jButton);
        jFrame.setSize(400,500);
        jFrame.setVisible(true);

    }
}