package View;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextPane;
import javax.swing.JTable;
import javax.swing.border.BevelBorder;
import javax.swing.border.TitledBorder;
import java.awt.Color;
import javax.swing.UIManager;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AdminUI extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTable table_kennel;
	private JTable table_user;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminUI frame = new AdminUI();
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
	
	public AdminUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 828, 508);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		table_kennel = new JTable();
		table_kennel.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Kennels", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
		table_kennel.setBounds(10, 22, 344, 280);
		contentPane.add(table_kennel);
		
		table_user = new JTable();
		table_user.setBorder(new TitledBorder(null, "Users", TitledBorder.CENTER, TitledBorder.TOP, null, Color.BLACK));
		table_user.setBounds(461, 22, 344, 280);
		contentPane.add(table_user);
		
		JButton btnNewButton = new JButton("Add");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton.setBounds(10, 313, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Remove");
		btnNewButton_1.setBounds(136, 313, 89, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Edit");
		btnNewButton_2.setBounds(265, 313, 89, 23);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Add");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_3.setBounds(461, 313, 89, 23);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("Remove");
		btnNewButton_4.setBounds(592, 313, 89, 23);
		contentPane.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("Edit");
		btnNewButton_5.setBounds(716, 313, 89, 23);
		contentPane.add(btnNewButton_5);
		
		JButton btn_logout = new JButton("Logout");
		btn_logout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

	    		new Login().setVisible(true);
	    		Exit();
       	    		
			}
		});
		btn_logout.setBounds(716, 438, 89, 23);
		contentPane.add(btn_logout);
	}
}
