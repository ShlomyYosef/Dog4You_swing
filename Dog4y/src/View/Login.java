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
		setBounds(100, 100, 453, 497);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		passwordField = new JPasswordField();
		passwordField.setToolTipText("");
		passwordField.setBounds(171, 250, 139, 20);
		contentPane.add(passwordField);
		
		txt_user_name = new JTextField();
		txt_user_name.setToolTipText("Username");
		txt_user_name.setBounds(171, 208, 139, 20);
		contentPane.add(txt_user_name);
		txt_user_name.setColumns(10);
		
		JTextPane txtpnUser = new JTextPane();
		txtpnUser.setEditable(false);
		txtpnUser.setText("User");
		txtpnUser.setBounds(84, 208, 57, 20);
		contentPane.add(txtpnUser);
		
		JTextPane txtpnPassword = new JTextPane();
		txtpnPassword.setText("Password");
		txtpnPassword.setBounds(84, 252, 66, 20);
		contentPane.add(txtpnPassword);
		
		JTextPane txtpnLogTitle = new JTextPane();
		txtpnLogTitle.setEditable(false);
		txtpnLogTitle.setText("Log in to your account");
		txtpnLogTitle.setBounds(84, 177, 139, 20);
		contentPane.add(txtpnLogTitle);

		JButton btn_login = new JButton("Log in");
		btn_login.addActionListener(new ActionListener(){  
	    	public void actionPerformed(ActionEvent e){  
	    		//if its user open this ui 
	    		new UserUI().setVisible(true);
                //if its Admin open admin ui
	    		new AdminUI().setVisible(true);
	        	Exit();
	    		
	    	        }

	 
	    	    }); 
		
		btn_login.setBounds(84, 356, 91, 23);
		contentPane.add(btn_login);
		
		JButton btn_sign_in = new JButton("Sign in");
		btn_sign_in.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				
			}
		});
		btn_sign_in.setBounds(219, 356, 91, 23);
		contentPane.add(btn_sign_in);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Login.class.getResource("/Image/dog-icon.png")));
		lblNewLabel.setBounds(151, 34, 139, 110);
		contentPane.add(lblNewLabel);
		
		JButton btn_guest = new JButton("Guest");
		btn_guest.setBounds(151, 310, 89, 23);
		contentPane.add(btn_guest);
	}
}
