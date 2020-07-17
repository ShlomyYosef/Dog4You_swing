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
import java.awt.Font;
import java.awt.SystemColor;


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
	private JButton btn_contact;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_5;
	private JLabel lblNewLabel_6;
	
	
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
		setBounds(100, 100, 451, 513);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		passwordField = new JPasswordField();
		passwordField.setToolTipText("");
		passwordField.setBounds(159, 256, 139, 20);
		contentPane.add(passwordField);
		
		txt_user_name = new JTextField();
		txt_user_name.setToolTipText("Username");
		txt_user_name.setBounds(159, 225, 139, 20);
		contentPane.add(txt_user_name);
		txt_user_name.setColumns(10);

		btn_login = new JButton("Log in");	
		btn_login.setBounds(67, 344, 85, 23);
		contentPane.add(btn_login);
		
		btn_sign_in = new JButton("Sign up");
		btn_sign_in.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btn_sign_in.setBounds(296, 344, 85, 23);
		contentPane.add(btn_sign_in);
		
		btn_guest = new JButton("Continue as a guest");
		btn_guest.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btn_guest.setBounds(148, 390, 149, 53);
		contentPane.add(btn_guest);
		
		btn_contact  = new JButton("Contact us");		
		btn_contact.setBounds(332, 116, 99, 23);
		contentPane.add(btn_contact);

		JLabel lblWantYourAds = new JLabel("want your ads here?");
		lblWantYourAds.setBounds(332, 91, 133, 14);
		contentPane.add(lblWantYourAds);
		
		

		
		lblNewLabel_2 = new JLabel("Welcome to Dog4y");
		lblNewLabel_2.setForeground(SystemColor.activeCaption);
		lblNewLabel_2.setFont(new Font("Georgia", Font.BOLD | Font.ITALIC, 28));
		lblNewLabel_2.setBounds(64, 0, 326, 43);
		contentPane.add(lblNewLabel_2);
	
		lblNewLabel_3 = new JLabel("Adopt A Dog");
		lblNewLabel_3.setForeground(SystemColor.activeCaption);
		lblNewLabel_3.setFont(new Font("Georgia", Font.BOLD, 18));
		lblNewLabel_3.setBounds(138, 45, 160, 35);
		contentPane.add(lblNewLabel_3);
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(Login.class.getResource("/Image/banner.jpg")));
		lblNewLabel_1.setBounds(332, 27, 99, 53);
		contentPane.add(lblNewLabel_1);
	
		lblNewLabel_4 = new JLabel("Username:");
		lblNewLabel_4.setForeground(SystemColor.activeCaptionText);
		lblNewLabel_4.setFont(new Font("Georgia", Font.BOLD, 22));
		lblNewLabel_4.setBounds(10, 209, 194, 43);
		contentPane.add(lblNewLabel_4);
		
		lblNewLabel_5 = new JLabel("Password:");
		lblNewLabel_5.setFont(new Font("Georgia", Font.BOLD, 22));
		lblNewLabel_5.setBounds(10, 231, 129, 60);
		contentPane.add(lblNewLabel_5);
		
		lblNewLabel_6 = new JLabel("Forgot password?");
		lblNewLabel_6.setForeground(new Color(0, 0, 255));
		lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_6.setBounds(169, 287, 129, 20);
		contentPane.add(lblNewLabel_6);
	


		JLabel lblNewLabel_6_1 = new JLabel("Contact Us");
		lblNewLabel_6_1.setForeground(Color.BLUE);
		lblNewLabel_6_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_6_1.setBounds(198, 304, 69, 20);
		contentPane.add(lblNewLabel_6_1);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Login.class.getResource("/Image/Login1.jpg")));
		lblNewLabel.setBounds(-4, 0, 445, 473);
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
	
	public void addContactUsListener(ActionListener contactListener) {
		btn_contact.addActionListener(contactListener);
	}
	
	
	public void displayPage() {
		this.setVisible(true);
	}
}
