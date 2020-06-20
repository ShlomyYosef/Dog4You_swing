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
		txtpnUser.setBounds(84, 163, 57, 20);
		contentPane.add(txtpnUser);
		
		JTextPane txtpnPassword = new JTextPane();
		txtpnPassword.setText("Password");
		txtpnPassword.setBounds(84, 194, 66, 20);
		contentPane.add(txtpnPassword);
		
		JTextPane txtpnLogTitle = new JTextPane();
		txtpnLogTitle.setEditable(false);
		txtpnLogTitle.setText("Log in to your account");
		txtpnLogTitle.setBounds(85, 132, 139, 20);
		contentPane.add(txtpnLogTitle);

		JButton btn_login = new JButton("Log in");
		btn_login.addActionListener(new ActionListener(){  
	    	public void actionPerformed(ActionEvent e){  
	    		//if its user open this ui 
	    		new UserUI().setVisible(true);
                //if its Admin open admin ui
	    		// new AdminUI().setVisible(true);
	        	Exit();
	    		
	    	        }

	 
	    	    }); 
		
		btn_login.setBounds(85, 297, 91, 23);
		contentPane.add(btn_login);
		
		JButton btn_sign_in = new JButton("Sign up");
		btn_sign_in.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			
	    		new SignUpUI().setVisible(true);
	    		Exit();
			}
		});
		btn_sign_in.setBounds(219, 297, 91, 23);
		contentPane.add(btn_sign_in);
		
		JButton btn_guest = new JButton("Continue as a guest");
		btn_guest.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

	    		new UserUI().setVisible(true);
			}
		});
		btn_guest.setBounds(116, 347, 174, 49);
		contentPane.add(btn_guest);
		
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Login.class.getResource("/Image/Welcome1.jpg")));
		lblNewLabel.setBounds(10, 11, 450, 451);
		contentPane.add(lblNewLabel);
		
		JTextPane txtpnForgotPassword = new JTextPane();
		txtpnForgotPassword.setForeground(Color.BLUE);
		txtpnForgotPassword.setEditable(false);
		txtpnForgotPassword.setText("Forgot password?");
		txtpnForgotPassword.setBounds(171, 225, 139, 20);
		contentPane.add(txtpnForgotPassword);
	}
}
