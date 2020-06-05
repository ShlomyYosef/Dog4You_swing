package View;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextPane;
import javax.swing.JSpinner;
import javax.swing.JTextArea;
import javax.swing.JList;
import javax.swing.JComboBox;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;
import javax.swing.JButton;

public class UserUI extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
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
		txtpnSearch.setBounds(10, 42, 102, 20);
		contentPane.add(txtpnSearch);
		
		JTextPane txtpnRace = new JTextPane();
		txtpnRace.setEditable(false);
		txtpnRace.setText("Race :");
		txtpnRace.setBounds(10, 73, 66, 20);
		contentPane.add(txtpnRace);
		
		JTextPane txtpnAge = new JTextPane();
		txtpnAge.setEditable(false);
		txtpnAge.setText("Age:");
		txtpnAge.setBounds(10, 104, 44, 20);
		contentPane.add(txtpnAge);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(86, 104, 94, 20);
		contentPane.add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(86, 73, 94, 20);
		contentPane.add(comboBox_1);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Advanced options");
		chckbxNewCheckBox.setBounds(10, 180, 141, 23);
		contentPane.add(chckbxNewCheckBox);
		
		JTextPane txtpnLocation = new JTextPane();
		txtpnLocation.setEditable(false);
		txtpnLocation.setText("Location:");
		txtpnLocation.setBounds(10, 137, 57, 20);
		contentPane.add(txtpnLocation);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setBounds(86, 135, 94, 20);
		contentPane.add(comboBox_2);
		
		JTextPane txtpnPersonality = new JTextPane();
		txtpnPersonality.setEditable(false);
		txtpnPersonality.setText("Personality:");
		txtpnPersonality.setBounds(10, 228, 72, 20);
		contentPane.add(txtpnPersonality);
		
		JComboBox comboBox_3 = new JComboBox();
		comboBox_3.setBounds(86, 228, 94, 20);
		contentPane.add(comboBox_3);
		
		JTextPane txtpnVaccine = new JTextPane();
		txtpnVaccine.setEditable(false);
		txtpnVaccine.setText("Vaccine:");
		txtpnVaccine.setBounds(10, 271, 57, 20);
		contentPane.add(txtpnVaccine);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Yes");
		rdbtnNewRadioButton.setBounds(86, 271, 57, 23);
		contentPane.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("No");
		rdbtnNewRadioButton_1.setBounds(145, 271, 57, 23);
		contentPane.add(rdbtnNewRadioButton_1);
		
		JTextPane txtpnTrained = new JTextPane();
		txtpnTrained.setText("Trained:");
		txtpnTrained.setBounds(10, 311, 44, 20);
		contentPane.add(txtpnTrained);
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("Yes");
		rdbtnNewRadioButton_2.setBounds(86, 308, 57, 23);
		contentPane.add(rdbtnNewRadioButton_2);
		
		JRadioButton rdbtnNewRadioButton_3 = new JRadioButton("No");
		rdbtnNewRadioButton_3.setBounds(145, 311, 44, 23);
		contentPane.add(rdbtnNewRadioButton_3);
		
		JTextPane txtpnFurtille = new JTextPane();
		txtpnFurtille.setText("Furtille:");
		txtpnFurtille.setBounds(10, 347, 44, 20);
		contentPane.add(txtpnFurtille);
		
		JRadioButton rdbtnNewRadioButton_4 = new JRadioButton("Yes");
		rdbtnNewRadioButton_4.setBounds(86, 344, 57, 23);
		contentPane.add(rdbtnNewRadioButton_4);
		
		JRadioButton rdbtnNewRadioButton_5 = new JRadioButton("No");
		rdbtnNewRadioButton_5.setBounds(145, 344, 109, 23);
		contentPane.add(rdbtnNewRadioButton_5);
		
		JButton btnNewButton = new JButton("Search");
		btnNewButton.setBounds(180, 180, 89, 23);
		contentPane.add(btnNewButton);
	}
}
