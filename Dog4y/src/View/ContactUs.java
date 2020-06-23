package View;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextPane;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ContactUs extends JFrame {

	private JPanel contentPane;

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
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JTextPane txtpnContactUsAt = new JTextPane();
		txtpnContactUsAt.setForeground(Color.WHITE);
		txtpnContactUsAt.setBackground(Color.BLUE);
		txtpnContactUsAt.setFont(new Font("Tahoma", Font.PLAIN, 30));
		txtpnContactUsAt.setText("contact us at:\r\nphone: 054-XXX-XXXX\r\nemail: Dog4y@gmail.com\r\n");
		contentPane.add(txtpnContactUsAt, BorderLayout.CENTER);
		
		JButton btnNewButton = new JButton("Go back");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

	    		new Login().setVisible(true);
	    		Exit();
			}
		});
		contentPane.add(btnNewButton, BorderLayout.SOUTH);
	}

}
