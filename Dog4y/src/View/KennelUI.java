package View;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import javax.swing.JTextPane;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JToggleButton;
import javax.swing.JComboBox;

public class KennelUI extends JFrame {

	private JPanel contentPane;
	private JTextField textField_1;
	private JTextField textField_6;
	private JComboBox cb_location;
	private JComboBox cb_breed;
	private JComboBox cb_Personality;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					KennelUI frame = new KennelUI();
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
	public KennelUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 703, 553);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextPane txtpnName = new JTextPane();
		txtpnName.setText("Dog Details");
		txtpnName.setEditable(false);
		txtpnName.setBounds(10, 11, 83, 20);
		contentPane.add(txtpnName);
		
		JTextPane txtpnDogBreed = new JTextPane();
		txtpnDogBreed.setText("Breed:");
		txtpnDogBreed.setEditable(false);
		txtpnDogBreed.setBounds(10, 87, 83, 20);
		contentPane.add(txtpnDogBreed);
		
		JTextPane txtpnDogPersonality = new JTextPane();
		txtpnDogPersonality.setText("Personality:");
		txtpnDogPersonality.setEditable(false);
		txtpnDogPersonality.setBounds(10, 118, 101, 20);
		contentPane.add(txtpnDogPersonality);
		
		JTextPane txtpnName_1 = new JTextPane();
		txtpnName_1.setText("Name:");
		txtpnName_1.setEditable(false);
		txtpnName_1.setBounds(10, 56, 83, 20);
		contentPane.add(txtpnName_1);
		
		JTextPane txtpnDogAge = new JTextPane();
		txtpnDogAge.setEditable(false);
		txtpnDogAge.setText("Dog Age:");
		txtpnDogAge.setBounds(10, 149, 83, 20);
		contentPane.add(txtpnDogAge);
		
		JTextPane txtpnFinalSize = new JTextPane();
		txtpnFinalSize.setEditable(false);
		txtpnFinalSize.setText("Final Size:");
		txtpnFinalSize.setBounds(10, 180, 83, 20);
		contentPane.add(txtpnFinalSize);
		
		JTextPane txtpnLocation = new JTextPane();
		txtpnLocation.setEditable(false);
		txtpnLocation.setText("Location:");
		txtpnLocation.setBounds(10, 211, 83, 20);
		contentPane.add(txtpnLocation);
		
		JTextPane txtpnKennelName = new JTextPane();
		txtpnKennelName.setEditable(false);
		txtpnKennelName.setText("Kennel Name:");
		txtpnKennelName.setBounds(10, 250, 83, 20);
		contentPane.add(txtpnKennelName);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(123, 56, 96, 20);
		contentPane.add(textField_1);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(123, 250, 96, 20);
		contentPane.add(textField_6);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Vaccsine");
		chckbxNewCheckBox.setBounds(12, 301, 99, 23);
		contentPane.add(chckbxNewCheckBox);
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("Furtille");
		chckbxNewCheckBox_1.setBounds(12, 336, 99, 23);
		contentPane.add(chckbxNewCheckBox_1);
		
		JCheckBox chckbxNewCheckBox_2 = new JCheckBox("Tamed");
		chckbxNewCheckBox_2.setBounds(12, 372, 99, 23);
		contentPane.add(chckbxNewCheckBox_2);
		
		cb_location = new JComboBox();
		cb_location.setBounds(123, 211, 96, 22);
		contentPane.add(cb_location);
		
		cb_Personality = new JComboBox();
		cb_Personality.setBounds(123, 118, 96, 22);
		contentPane.add(cb_Personality);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setBounds(123, 149, 96, 22);
		contentPane.add(comboBox_2);
		
		JComboBox comboBox_3 = new JComboBox();
		comboBox_3.setBounds(123, 178, 96, 22);
		contentPane.add(comboBox_3);
		
		cb_breed = new JComboBox();
		cb_breed.setBounds(123, 85, 96, 22);
		contentPane.add(cb_breed);
		
		
	}
}
