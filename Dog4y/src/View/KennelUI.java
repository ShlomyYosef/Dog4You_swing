package View;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import javax.swing.JTextPane;

public class KennelUI extends JFrame {

	private JPanel contentPane;

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
	}
}
