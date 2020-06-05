package View;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextPane;

public class UserUI extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UserUI frame = new UserUI();
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
	public UserUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 851, 550);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextPane txtpnDear = new JTextPane();
		txtpnDear.setEditable(false);
		txtpnDear.setEnabled(false);
		txtpnDear.setText("Dear");
		txtpnDear.setBounds(10, 11, 66, 20);
		contentPane.add(txtpnDear);
		
		JTextPane txtpnSearch = new JTextPane();
		txtpnSearch.setText("Search");
		txtpnSearch.setEditable(false);
		txtpnSearch.setBounds(10, 105, 102, 20);
		contentPane.add(txtpnSearch);
		
		JTextPane txtpnRace = new JTextPane();
		txtpnRace.setText("Race :");
		txtpnRace.setBounds(10, 147, 66, 20);
		contentPane.add(txtpnRace);
		
		JTextPane txtpnAge = new JTextPane();
		txtpnAge.setText("Age:");
		txtpnAge.setBounds(10, 193, 66, 20);
		contentPane.add(txtpnAge);
	}

}
