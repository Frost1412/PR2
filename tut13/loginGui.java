package PR2.tut13;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class loginGui implements ActionListener {
    private static JLabel titleLabel;
    private static JLabel userLabel;
    private static JTextField userText;
    private static JLabel passLabel;
    private static JPasswordField passText;
    private static JButton button;
    private static JLabel success;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Login Form");
        JPanel panel = new JPanel();
        frame.setSize(350, 250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);
        panel.setLayout(null);

        JLabel titleLabel = new JLabel("Simple Login Form");
        titleLabel.setBounds(10, 10, 320, 35);
        titleLabel.setHorizontalAlignment(JLabel.CENTER);
        Font Arial = new Font("Arial", Font.BOLD, 20);
        titleLabel.setFont(Arial);
        panel.add(titleLabel);

        userLabel = new JLabel("User");
        userLabel.setBounds(10, 60, 80, 25);
        panel.add(userLabel);

        userText = new JTextField(20);
        userText.setBounds(100, 60, 165, 25);
        panel.add(userText);

        passLabel = new JLabel("Password");
        passLabel.setBounds(10,90,80,25);
        panel.add(passLabel);

        passText = new JPasswordField();
        passText.setBounds(100,90,165,25);
        panel.add(passText);

        button = new JButton("Login");
        button.setBounds(100,120,80,25);
        button.addActionListener(new loginGui());
        panel.add(button);

        success = new JLabel("");
        success.setBounds(10,150,320,25);
        panel.add(success);
        
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String user = userText.getText();
        String password = String.valueOf(passText.getPassword());
        if(user.equals("Tuan")&&(password.equals("123"))){
            success.setText("Login successful!");
        }else{
            success.setText("Login Failed, please try again!");
        }
    }
}
