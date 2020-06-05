package View;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JFormattedTextField;
import javax.swing.DropMode;
import javax.swing.JTextPane;
import javax.swing.JButton;

public class Login extends JFrame {

	private JPanel contentPane;
	private JPasswordField passwordField;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Login() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 453, 497);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		passwordField = new JPasswordField();
		passwordField.setToolTipText("");
		passwordField.setBounds(171, 250, 139, 20);
		contentPane.add(passwordField);
		
		textField = new JTextField();
		textField.setToolTipText("Username");
		textField.setBounds(171, 208, 139, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JTextPane txtpnLogInTo = new JTextPane();
		txtpnLogInTo.setEditable(false);
		txtpnLogInTo.setText("User");
		txtpnLogInTo.setBounds(84, 208, 57, 20);
		contentPane.add(txtpnLogInTo);
		
		JTextPane txtpnPassword = new JTextPane();
		txtpnPassword.setText("Password");
		txtpnPassword.setBounds(84, 252, 66, 20);
		contentPane.add(txtpnPassword);
		
		JTextPane txtpnLogInTo_1 = new JTextPane();
		txtpnLogInTo_1.setEditable(false);
		txtpnLogInTo_1.setText("Log in to your account");
		txtpnLogInTo_1.setBounds(131, 177, 139, 20);
		contentPane.add(txtpnLogInTo_1);
		
		JButton btnNewButton = new JButton("Log in");
		btnNewButton.setBounds(84, 356, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Sign in");
		btnNewButton_1.setBounds(221, 356, 89, 23);
		contentPane.add(btnNewButton_1);
	}
}
