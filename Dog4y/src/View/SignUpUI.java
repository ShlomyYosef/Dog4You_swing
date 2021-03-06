package View;


import java.awt.EventQueue;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyAdapter;

import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextPane;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.JList;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Font;
import java.awt.Panel;

import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JToggleButton;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.KeyEvent;


public class SignUpUI extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txt_FirstName;
	private JTextField txt_Email;
	private JTextField txt_LastName;
	private JTextField txt_PhoneNum;
	private JTextField txt_Address;
	private JTextField txt_UserName;
	private JPasswordField passwordField;
	private JComboBox cb_Permissions;
    private String[] permission = { "User","Kennel"};
    private JButton btn_signUp;
    JButton btn_goBack;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SignUpUI frame = new SignUpUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	private void Exit() {
		// TODO Auto-generated method stub
		this.dispose();
	} 
	
	/**
	 * Create the frame.
	 */
	public SignUpUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 842, 550);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		JTextPane txtpnFirstName = new JTextPane();
		txtpnFirstName.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtpnFirstName.setText("First name:");
		txtpnFirstName.setBounds(23, 61, 110, 33);
		txtpnFirstName.setEditable(false);
		contentPane.add(txtpnFirstName);

		txt_FirstName = new JTextField();
		txt_FirstName.setBounds(229, 61, 158, 33);
		txt_FirstName.addKeyListener(new KeyAdapter()
				{
	//		String s = textField_Username.getText();
				});
		
		contentPane.add(txt_FirstName);
		txt_FirstName.setColumns(10);

		
		
		JTextPane txtpnLastName = new JTextPane();
		txtpnLastName.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtpnLastName.setText("Last name:");
		txtpnLastName.setBounds(23, 108, 110, 33);
		txtpnLastName.setEditable(false);
		contentPane.add(txtpnLastName);
		
		txt_Email = new JTextField();
		txt_Email.setColumns(10);
		txt_Email.setBounds(229, 161, 158, 33);
		contentPane.add(txt_Email);
		
		
		JTextPane txtpnEmail = new JTextPane();
		txtpnEmail.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtpnEmail.setText("Email:");
		txtpnEmail.setBounds(23, 161, 67, 33);
		txtpnEmail.setEditable(false);
		contentPane.add(txtpnEmail);

		txt_LastName = new JTextField();
		txt_LastName.setColumns(10);
		txt_LastName.setBounds(229, 108, 158, 33);
		contentPane.add(txt_LastName);
		
		
		JTextPane txtpnAddress = new JTextPane();
		txtpnAddress.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtpnAddress.setText("Address:");
		txtpnAddress.setBounds(25, 205, 84, 33);
		txtpnAddress.setEditable(false);
		contentPane.add(txtpnAddress);
		

		txt_PhoneNum = new JTextField();
		txt_PhoneNum.setColumns(10);
		txt_PhoneNum.setBounds(229, 261, 158, 33);
		contentPane.add(txt_PhoneNum);
		
		
		
		JTextPane txtpnPhonenumber = new JTextPane();
		txtpnPhonenumber.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtpnPhonenumber.setText("Phone number:");
		txtpnPhonenumber.setBounds(23, 261, 144, 33);
		txtpnPhonenumber.setEditable(false);
		contentPane.add(txtpnPhonenumber);
		
		txt_Address = new JTextField();
		txt_Address.setColumns(10);
		txt_Address.setBounds(229, 205, 158, 33);
		contentPane.add(txt_Address);
		
		
		JTextPane txtpnUsername = new JTextPane();
		txtpnUsername.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtpnUsername.setText("Username:");
		txtpnUsername.setBounds(23, 313, 110, 33);
		txtpnUsername.setEditable(false);
		contentPane.add(txtpnUsername);


		txt_UserName = new JTextField();
		txt_UserName.setColumns(10);
		txt_UserName.setBounds(229, 313, 158, 33);
		contentPane.add(txt_UserName);
		
		
		JTextPane txtpnPassword = new JTextPane();
		txtpnPassword.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtpnPassword.setText("Password:");
		txtpnPassword.setBounds(23, 368, 97, 33);
		txtpnPassword.setEditable(false);
		contentPane.add(txtpnPassword);
		

		
		JLabel lblNewLabel_1 = new JLabel("Register page");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(313, 11, 141, 29);
		contentPane.add(lblNewLabel_1);
		
		
		passwordField = new JPasswordField();
		passwordField.setBounds(229, 362, 158, 33);
		contentPane.add(passwordField);
		
		
		
		cb_Permissions = new JComboBox(permission);
		cb_Permissions.setFont(new Font("Tahoma", Font.PLAIN, 15));
		cb_Permissions.setBounds(229, 429, 158, 33);
		contentPane.add(cb_Permissions);
		
	


		
		JTextPane txt_Permissions = new JTextPane();
		txt_Permissions.setText("Permissions");
		txt_Permissions.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txt_Permissions.setBounds(23, 429, 120, 33);
		txt_Permissions.setEditable(false);
		contentPane.add(txt_Permissions);
		
		btn_signUp = new JButton("Sign up");
		btn_signUp.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btn_signUp.setBounds(457, 320, 110, 49);
		contentPane.add(btn_signUp);
		
		btn_goBack = new JButton("Go Back");
		btn_goBack.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btn_goBack.setBounds(457, 406, 110, 49);
		contentPane.add(btn_goBack);
		
		// setting background image
		JLabel lblDs = new JLabel("");
		lblDs.setHorizontalAlignment(SwingConstants.CENTER);
		lblDs.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblDs.setBounds(-15, 11, 897, 531);
		lblDs.setIcon(new ImageIcon(SignUpUI.class.getResource("/Image/signup.jpg")));
		contentPane.add(lblDs);
		
			}
	
	public void addPhoneNumberKeyListener(KeyAdapter key){
		txt_PhoneNum.addKeyListener(key);
	}
	
	// get string from textBox
	public String getFirstName() {
		return txt_FirstName.getText();
	}
	
	public String getLastName() {
		return txt_LastName.getText();
	}
	
	public String getEmail() {
		return txt_Email.getText();
	}
	
	public String getAddress(){
		return txt_Address.getText();
	}
	
	public String getPhone() {
		return txt_PhoneNum.getText();
	}
	
	public String getUserName() {
		return txt_UserName.getText();
	}
	
	public char[] getPassword(){
		return passwordField.getPassword();
	}
	
	public String getPermissons() {
		//System.out.print(cb_Permissions.getSelectedItem());
		
		return cb_Permissions.getSelectedItem().toString();
}
	
	//listen to button press
	public void addSignUpListener(ActionListener signupListener) {
		btn_signUp.addActionListener(signupListener);
	}
	
	public void addGoBackListener(ActionListener goBackListener) {
		 btn_goBack.addActionListener(goBackListener);
	}
	//show error dialog
	public void displayErrorMessage(String errorMsg) {
		JOptionPane.showMessageDialog(this,errorMsg);
	}
	
	public void setFocusUserName() {
		txt_UserName.requestFocus();
		txt_UserName.setBorder(new LineBorder(Color.RED, 2));
	}
	
	public void exitPage() {
		Exit();
	}
	
	public void displayPage() {
		this.setVisible(true);
	}
}
