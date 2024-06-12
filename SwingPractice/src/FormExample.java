import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class FormExample extends JFrame {
    private JPanel formPanel;

    public FormExample() {
        setTitle("Form Example");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 300);
        setLayout(new BorderLayout());
        getContentPane().setBackground(new Color(240, 240, 240)); // Set background color

        formPanel = new JPanel();
        formPanel.setLayout(new GridLayout(6, 2, 10, 10));
        formPanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20)); // Add padding

        // Set font
        Font labelFont = new Font("Arial", Font.BOLD, 14);
        Font fieldFont = new Font("Arial", Font.PLAIN, 14);

        // Set label color
        Color labelColor = new Color(50, 50, 50);

        // Set text field color
        Color textFieldColor = new Color(220, 220, 220);

        // Add components
        JLabel nameLabel = new JLabel("Name:");
        nameLabel.setFont(labelFont);
        nameLabel.setForeground(labelColor);
        JTextField nameField = new JTextField();
        nameField.setFont(fieldFont);
        nameField.setBackground(textFieldColor);
        formPanel.add(nameLabel);
        formPanel.add(nameField);

        JLabel genderLabel = new JLabel("Gender:");
        genderLabel.setFont(labelFont);
        genderLabel.setForeground(labelColor);
        JRadioButton maleRadioButton = new JRadioButton("Male");
        JRadioButton femaleRadioButton = new JRadioButton("Female");
        maleRadioButton.setFont(fieldFont);
        femaleRadioButton.setFont(fieldFont);
        maleRadioButton.setForeground(labelColor);
        femaleRadioButton.setForeground(labelColor);
        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(maleRadioButton);
        genderGroup.add(femaleRadioButton);
        JPanel genderPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        genderPanel.add(maleRadioButton);
        genderPanel.add(femaleRadioButton);
        genderPanel.setBackground(new Color(240, 240, 240));
        formPanel.add(genderLabel);
        formPanel.add(genderPanel);

        JLabel countryLabel = new JLabel("Country:");
        String[] countries = {"USA", "Canada", "UK", "Australia", "Other"};
        JComboBox<String> countryComboBox = new JComboBox<>(countries);
        countryComboBox.setFont(fieldFont);
        countryComboBox.setBackground(textFieldColor);
        formPanel.add(countryLabel);
        formPanel.add(countryComboBox);

        JLabel interestsLabel = new JLabel("Interests:");
        interestsLabel.setFont(labelFont);
        interestsLabel.setForeground(labelColor);
        JCheckBox javaCheckBox = new JCheckBox("Java");
        JCheckBox pythonCheckBox = new JCheckBox("Python");
        javaCheckBox.setFont(fieldFont);
        pythonCheckBox.setFont(fieldFont);
        JPanel interestsPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        interestsPanel.add(javaCheckBox);
        interestsPanel.add(pythonCheckBox);
        interestsPanel.setBackground(new Color(240, 240, 240));
        formPanel.add(interestsLabel);
        formPanel.add(interestsPanel);

        JLabel commentsLabel = new JLabel("Comments:");
        commentsLabel.setFont(labelFont);
        commentsLabel.setForeground(labelColor);
        JTextArea commentsTextArea = new JTextArea(4, 20);
        commentsTextArea.setFont(fieldFont);
        commentsTextArea.setBackground(textFieldColor);
        JScrollPane commentsScrollPane = new JScrollPane(commentsTextArea);
        formPanel.add(commentsLabel);
        formPanel.add(commentsScrollPane);

        JButton submitButton = new JButton("Submit");
        submitButton.setFont(labelFont);
        submitButton.setBackground(new Color(100, 180, 255)); // Button background color
        submitButton.setForeground(Color.WHITE); // Button text color
        submitButton.setBorder(BorderFactory.createEmptyBorder(5, 15, 5, 15)); // Button padding
        submitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Handle form submission here
            }
        });
        add(formPanel, BorderLayout.CENTER);
        add(submitButton, BorderLayout.SOUTH);

        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new FormExample();
            }
        });
    }
}
