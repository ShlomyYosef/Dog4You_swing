package View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.event.ActionListener;
import javax.swing.JTextPane;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.Font;

import java.awt.Color;
import java.awt.SystemColor;

public class ContactUs extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JButton btn_goBack;
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ContactUs frame = new ContactUs();
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
	public ContactUs() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 715, 297);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
	
		JTextPane txtpnPhoneEmail = new JTextPane();
		txtpnPhoneEmail.setBackground(new Color(100, 149, 237));
		txtpnPhoneEmail.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtpnPhoneEmail.setText("phone: 054-XXX-XXXX \r\nemail: Dog4y@gmail.com");
		txtpnPhoneEmail.setBounds(45, 137, 282, 61);
		contentPane.add(txtpnPhoneEmail);
		
	
	 
		btn_goBack = new JButton("Go back");
		btn_goBack.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btn_goBack.setBounds(10, 209, 672, 51);
		contentPane.add(btn_goBack);
		
		
		JLabel lblDs = new JLabel("");
		lblDs.setHorizontalAlignment(SwingConstants.CENTER);
		lblDs.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblDs.setBounds(0, -18, 709, 242);
		lblDs.setIcon(new ImageIcon(SignUpUI.class.getResource("/Image/Contactus.jpg")));
		contentPane.add(lblDs);
	
}
	
	public void addGoBackListener(ActionListener goBack) {
		btn_goBack.addActionListener(goBack);
	}

	public void exitPage() {
		Exit();
	}
	public void displayErrorMessage(String errorMsg) {
		JOptionPane.showMessageDialog(this,errorMsg);
	}
	public void displayPage() {
		this.setVisible(true);
	}
}
	
	
