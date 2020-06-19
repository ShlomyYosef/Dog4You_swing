package View;


import java.awt.EventQueue;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

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

import javax.swing.JList;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JToggleButton;
import javax.swing.DefaultComboBoxModel;


public class SignInUI extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SignInUI frame = new SignInUI();
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
	public SignInUI() {
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
		contentPane.add(txtpnFirstName);

		JTextPane txtpnLastName = new JTextPane();
		txtpnLastName.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtpnLastName.setText("Last name:");
		txtpnLastName.setBounds(23, 108, 110, 33);
		contentPane.add(txtpnLastName);
		
		JTextPane txtpnEmail = new JTextPane();
		txtpnEmail.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtpnEmail.setText("Email:");
		txtpnEmail.setBounds(23, 161, 67, 33);
		contentPane.add(txtpnEmail);

		JTextPane txtpnAddress = new JTextPane();
		txtpnAddress.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtpnAddress.setText("Address:");
		txtpnAddress.setBounds(25, 205, 84, 33);
		contentPane.add(txtpnAddress);
		
		JTextPane txtpnPhonenumber = new JTextPane();
		txtpnPhonenumber.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtpnPhonenumber.setText("Phone number:");
		txtpnPhonenumber.setBounds(23, 261, 144, 33);
		contentPane.add(txtpnPhonenumber);
		
		JTextPane txtpnUsername = new JTextPane();
		txtpnUsername.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtpnUsername.setText("Username:");
		txtpnUsername.setBounds(23, 313, 110, 33);
		contentPane.add(txtpnUsername);
		
		JTextPane txtpnPassword = new JTextPane();
		txtpnPassword.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtpnPassword.setText("Password:");
		txtpnPassword.setBounds(23, 368, 97, 33);
		contentPane.add(txtpnPassword);
		

		
		JLabel lblNewLabel_1 = new JLabel("Register page");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(313, 11, 141, 29);
		contentPane.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(229, 61, 158, 33);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(229, 161, 158, 33);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(229, 108, 158, 33);
		contentPane.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(229, 205, 158, 33);
		contentPane.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(229, 261, 158, 33);
		contentPane.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(229, 313, 158, 33);
		contentPane.add(textField_5);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(229, 362, 158, 33);
		contentPane.add(passwordField);
	
		
		JComboBox cb_race = new JComboBox();
		cb_race.setFont(new Font("Tahoma", Font.PLAIN, 15));
		cb_race.setModel(new DefaultComboBoxModel(new String[] {"0-User", "1-Keneel", "2-Admin"}));
		cb_race.setBounds(229, 429, 158, 33);
		contentPane.add(cb_race);
		
		JTextPane txtpnPrem = new JTextPane();
		txtpnPrem.setText("Permissions");
		txtpnPrem.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtpnPrem.setBounds(23, 429, 120, 33);
		contentPane.add(txtpnPrem);
		
		JButton btnNewButton = new JButton("Sign up");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton.setBounds(486, 402, 110, 49);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Guest");
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton_1.setBounds(486, 297, 110, 49);
		contentPane.add(btnNewButton_1);
		
		
		
		JLabel lblDs = new JLabel("");
		lblDs.setHorizontalAlignment(SwingConstants.CENTER);
		lblDs.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblDs.setBounds(-22, 11, 897, 531);
		lblDs.setIcon(new ImageIcon(SignInUI.class.getResource("/Image/3232.jpg")));
		contentPane.add(lblDs);
		
		
			}
	
}
