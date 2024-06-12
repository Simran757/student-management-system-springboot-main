import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ColourPicker extends JFrame {
    private JPanel colorPanel;
    private JButton chooseButton
            ;

    public ColourPicker() {
        setTitle("Color Picker");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 200);
        setLayout(new BorderLayout());

        colorPanel = new JPanel();
        colorPanel.setBackground(Color.WHITE);
        add(colorPanel, BorderLayout.CENTER);

        chooseButton = new JButton("Choose Color");
        chooseButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Color color = JColorChooser.showDialog(null, "Choose a Color", Color.WHITE);
                if (color != null) {
                    colorPanel.setBackground(color);
                }
            }
        });
        add(chooseButton, BorderLayout.SOUTH);

        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new ColourPicker();
            }
        });
    }
}
