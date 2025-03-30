import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import com.intellij.uiDesigner.core.*;

public class RegistrationGUI {

    public RegistrationGUI() {
        initComponents();
    }

    public static void main(String[] args) {
        new LoginForm();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        // Generated using JFormDesigner Evaluation license - unknown
        var panel1 = new JPanel();

        //======== panel1 ========
        {
            panel1.setBorder (new javax. swing. border. CompoundBorder( new javax .swing .border .TitledBorder (new javax. swing. border. EmptyBorder(
            0, 0, 0, 0) , "JF\u006frmDes\u0069gner \u0045valua\u0074ion", javax. swing. border. TitledBorder. CENTER, javax. swing. border. TitledBorder
            . BOTTOM, new java .awt .Font ("D\u0069alog" ,java .awt .Font .BOLD ,12 ), java. awt. Color.
            red) ,panel1. getBorder( )) ); panel1. addPropertyChangeListener (new java. beans. PropertyChangeListener( ){ @Override public void propertyChange (java .
            beans .PropertyChangeEvent e) {if ("\u0062order" .equals (e .getPropertyName () )) throw new RuntimeException( ); }} );
            panel1.setLayout(new GridLayoutManager(1, 1, new Insets(0, 0, 0, 0), -1, -1));
        }
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }
}

class LoginForm {
    LoginForm() {
        JFrame frame = new JFrame("Login");
        frame.setSize(400, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBackground(new Color(30, 30, 30));

        JLabel titleLabel = new JLabel("Sign In");
        titleLabel.setFont(new Font("Arial", Font.BOLD, 24));
        titleLabel.setForeground(Color.WHITE);
        titleLabel.setBounds(150, 30, 200, 40);
        panel.add(titleLabel);

        JTextField usernameField = new JTextField("Username");
        usernameField.setBounds(100, 100, 200, 40);
        usernameField.setForeground(Color.GRAY);
        panel.add(usernameField);

        JPasswordField pwdPassword = new JPasswordField("Password");
        pwdPassword.setBounds(100, 160, 200, 40);
        pwdPassword.setForeground(Color.GRAY);
        pwdPassword.setEchoChar((char) 0); // Initially show text
        panel.add(pwdPassword);

        JButton loginButton = new JButton("Login");
        loginButton.setBounds(100, 260, 200, 40);
        panel.add(loginButton);

        JLabel registerLabel = new JLabel("<html><u>Don't have an account? Register Here</u></html>");
        registerLabel.setBounds(100, 370, 250, 20);
        registerLabel.setForeground(Color.WHITE);
        registerLabel.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        panel.add(registerLabel);

        registerLabel.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                new RegistrationForm();
                frame.dispose();
            }
        });

        frame.getContentPane().add(panel);
        frame.setVisible(true);
    }
}

class RegistrationForm {
    RegistrationForm() {
        JFrame frame = new JFrame("New Account Registration");
        frame.setSize(400, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(null);

        JLabel titleLabel = new JLabel("New Account Registration");
        titleLabel.setFont(new Font("Arial", Font.BOLD, 20));
        titleLabel.setBounds(80, 20, 300, 30);
        panel.add(titleLabel);

        // Labels for the input fields
        JLabel nameLabel = new JLabel("Name:");
        nameLabel.setBounds(50, 70, 100, 25);
        panel.add(nameLabel);

        JTextField nameField = new JTextField();
        nameField.setBounds(150, 70, 200, 25);
        panel.add(nameField);

        JLabel emailLabel = new JLabel("Email:");
        emailLabel.setBounds(50, 110, 100, 25);
        panel.add(emailLabel);

        JTextField emailField = new JTextField();
        emailField.setBounds(150, 110, 200, 25);
        panel.add(emailField);

        JLabel passwordLabel = new JLabel("Password:");
        passwordLabel.setBounds(50, 150, 100, 25);
        panel.add(passwordLabel);

        JPasswordField passwordField = new JPasswordField();
        passwordField.setBounds(150, 150, 200, 25);
        panel.add(passwordField);

        JLabel confirmPasswordLabel = new JLabel("Confirm Password:");
        confirmPasswordLabel.setBounds(20, 190, 130, 25);
        panel.add(confirmPasswordLabel);

        JPasswordField confirmPasswordField = new JPasswordField();
        confirmPasswordField.setBounds(150, 190, 200, 25);
        panel.add(confirmPasswordField);

        JLabel genderLabel = new JLabel("Gender:");
        genderLabel.setBounds(50, 230, 100, 25);
        panel.add(genderLabel);

        JRadioButton male = new JRadioButton("Male");
        JRadioButton female = new JRadioButton("Female");
        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(male);
        genderGroup.add(female);
        male.setBounds(150, 230, 70, 25);
        female.setBounds(220, 230, 70, 25);
        panel.add(male);
        panel.add(female);

        JLabel addressLabel = new JLabel("Address:");
        addressLabel.setBounds(50, 270, 100, 25);
        panel.add(addressLabel);

        JTextField addressField = new JTextField();
        addressField.setBounds(150, 270, 200, 25);
        panel.add(addressField);

        JLabel stateLabel = new JLabel("State:");
        stateLabel.setBounds(50, 310, 100, 25);
        panel.add(stateLabel);

        String[] states = {"Delhi", "Bengluru", "Bombay"};
        JComboBox<String> stateCombo = new JComboBox<>(states);
        stateCombo.setBounds(150, 310, 200, 25);
        panel.add(stateCombo);

        JLabel countryLabel = new JLabel("Country:");
        countryLabel.setBounds(50, 350, 100, 25);
        panel.add(countryLabel);

        JTextField countryField = new JTextField();
        countryField.setBounds(150, 350, 200, 25);
        panel.add(countryField);

        JLabel phoneLabel = new JLabel("Phone:");
        phoneLabel.setBounds(50, 390, 100, 25);
        panel.add(phoneLabel);

        JTextField phoneField = new JTextField();
        phoneField.setBounds(150, 390, 200, 25);
        panel.add(phoneField);

        JButton submitButton = new JButton("Submit");
        submitButton.setBounds(100, 440, 100, 30);
        panel.add(submitButton);

        JButton clearButton = new JButton("Clear");
        clearButton.setBounds(210, 440, 100, 30);
        panel.add(clearButton);

        submitButton.addActionListener(e -> JOptionPane.showMessageDialog(frame, "Registration Successful!"));

        clearButton.addActionListener(e -> {
            nameField.setText("");
            emailField.setText("");
            passwordField.setText("");
            confirmPasswordField.setText("");
            genderGroup.clearSelection();
            addressField.setText("");
            stateCombo.setSelectedIndex(0);
            countryField.setText("");
            phoneField.setText("");
        });

        frame.getContentPane().add(panel);
        frame.setVisible(true);
    }
}
