package View;



import java.awt.EventQueue;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import javax.swing.JPasswordField;
import javax.swing.JTextField;

import javax.swing.ImageIcon;
import javax.swing.JTextPane;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;


public class Login extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JPasswordField passwordField;
	private JTextField txt_user_name;
	private JButton btn_login;
	private JButton btn_sign_in;
	private JButton btn_guest;
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
	
	private void Exit() {
		// TODO Auto-generated method stub
		this.dispose();
	} 
	
	public Login() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 474, 499);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		passwordField = new JPasswordField();
		passwordField.setToolTipText("");
		passwordField.setBounds(171, 194, 139, 20);
		contentPane.add(passwordField);
		
		txt_user_name = new JTextField();
		txt_user_name.setToolTipText("Username");
		txt_user_name.setBounds(171, 163, 139, 20);
		contentPane.add(txt_user_name);
		txt_user_name.setColumns(10);
		
		JTextPane txtpnUser = new JTextPane();
		txtpnUser.setEditable(false);
		txtpnUser.setText("User");
		txtpnUser.setBounds(84, 163, 30, 20);
		contentPane.add(txtpnUser);
		
		JTextPane txtpnPassword = new JTextPane();
		txtpnPassword.setText("Password");
		txtpnPassword.setBounds(84, 194, 59, 20);
		txtpnPassword.setEditable(false);
		contentPane.add(txtpnPassword);
		
		JTextPane txtpnLogTitle = new JTextPane();
		txtpnLogTitle.setEditable(false);
		txtpnLogTitle.setText("Log in to your account");
		txtpnLogTitle.setBounds(85, 132, 124, 20);
		contentPane.add(txtpnLogTitle);

		btn_login = new JButton("Log in");	
		btn_login.setBounds(65, 313, 91, 23);
		contentPane.add(btn_login);
		
		btn_sign_in = new JButton("Sign up");
		btn_sign_in.setBounds(252, 313, 91, 23);
		contentPane.add(btn_sign_in);
		
		btn_guest = new JButton("Continue as a guest");
		btn_guest.setBounds(114, 366, 174, 49);
		contentPane.add(btn_guest);
		

		JTextPane txtpnForgotPassword = new JTextPane();
		txtpnForgotPassword.setForeground(Color.BLUE);
		txtpnForgotPassword.setEditable(false);
		txtpnForgotPassword.setText("Forgot password?");
		txtpnForgotPassword.setBounds(171, 225, 139, 20);
		contentPane.add(txtpnForgotPassword);

		JLabel lblWantYourAds = new JLabel("want your ads here?");
		lblWantYourAds.setBounds(356, 74, 104, 14);
		contentPane.add(lblWantYourAds);
	
		JButton btnNewButton = new JButton("Contact us");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
		
    		new ContactUs().setVisible(true);
    		Exit();
			}
		});
		btnNewButton.setBounds(356, 95, 99, 23);
		contentPane.add(btnNewButton);
		
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(Login.class.getResource("/Image/banner.jpg")));
		lblNewLabel_1.setBounds(346, -11, 143, 101);
		contentPane.add(lblNewLabel_1);
	
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Login.class.getResource("/Image/Welcome1.jpg")));
		lblNewLabel.setBounds(21, 11, 401, 449);
		contentPane.add(lblNewLabel);
		
		}
	
	
	// get the user name from text box 
	public String getUserName() {	
		return txt_user_name.getText();
	}
	
	public char[] getPassword() {
		return passwordField.getPassword();
	}
	
	public void addLoginListener(ActionListener actionLoginListener) {
		
		btn_login.addActionListener(actionLoginListener);	
	}
	
	
	public void displayErrorMessage(String errorMsg) {
		JOptionPane.showMessageDialog(this,errorMsg);
	}
	
	public void exitPage() {
		Exit();
	}
	
	public void displaySuccessMessage(String msg) {
		JOptionPane.showMessageDialog(this,msg);
	}

	public void addGuestListener(ActionListener guestListener) {
		btn_guest.addActionListener(guestListener);	
	}
	
	public void addSignUpListener(ActionListener signupListener) {
		btn_sign_in.addActionListener(signupListener);
	}
	
	public void displayPage() {
		this.setVisible(true);
	}
}
