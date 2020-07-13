package View;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import java.awt.event.ActionListener;
import java.awt.event.ItemListener;

import javax.swing.JTextPane;
import javax.swing.JTextField;
import javax.swing.ButtonGroup;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JToggleButton;
import javax.swing.JComboBox;
import javax.swing.JTable;
import java.awt.event.ActionEvent;

public class KennelUI extends JFrame {

	private JPanel contentPane;
	private JTextPane txtpn_dear_user;
	private JButton btn_goBack;
	private JButton btn_search;
	private JTextField txtNameDog;
	private JTextField txtKeneelName;
	private JTextPane txtpnPersonality;
	private JTextPane txtpnFurtille;
	private JTextPane txtpnTrained;
	private JTextPane txtpnVaccine;
	private JCheckBox cb_AdvancedOptions;
	private JTextPane txtpnGender;

	
	private JComboBox cb_location;
	private JComboBox cb_breed;
	private JComboBox cb_Personality;
	private JComboBox cb_age;
	private JComboBox cb_FinalSize;	
	private JComboBox cb_Gender;
	

	
	private JRadioButton rb_vaccine_yes;
	private JRadioButton rb_vaccine_no;
	private JRadioButton rb_furtille_yes;
	private JRadioButton rb_furtille_no;
	private JRadioButton rb_trained_yes;
	private JRadioButton rb_trained_no;
	private ButtonGroup groupFurtille;
	private ButtonGroup groupTrained;
	private ButtonGroup groupVaccine;
	
	
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
	private void Exit() {
		// TODO Auto-generated method stub
		this.dispose();
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
		txtpnKennelName.setBounds(10, 275, 83, 20);
		contentPane.add(txtpnKennelName);
		
		txtNameDog = new JTextField();
		txtNameDog.setColumns(10);
		txtNameDog.setBounds(123, 56, 96, 20);
		contentPane.add(txtNameDog);

	
		txtpnGender = new JTextPane();
		txtpnGender.setText("Gander:");
		txtpnGender.setEditable(false);
		txtpnGender.setBounds(10, 244, 83, 20);
		contentPane.add(txtpnGender);
		
		
		txtKeneelName = new JTextField();
		txtKeneelName.setColumns(10);
		txtKeneelName.setBounds(123, 275, 96, 20);
		contentPane.add(txtKeneelName);
		txtpnVaccine = new JTextPane();
		txtpnVaccine.setEditable(false);
		txtpnVaccine.setText("Vaccine:");
		txtpnVaccine.setBounds(10, 372, 57, 20);
		txtpnVaccine.setEditable(false);
		contentPane.add(txtpnVaccine);
		txtpnVaccine.setVisible(false);
		
		rb_vaccine_yes = new JRadioButton("Yes");
		rb_vaccine_yes.setBounds(73, 372, 57, 23);
		rb_vaccine_yes.setActionCommand("Yes");
		contentPane.add(rb_vaccine_yes);
		rb_vaccine_yes.setVisible(false);
		
		rb_vaccine_no = new JRadioButton("No");
		rb_vaccine_no.setBounds(123, 372, 57, 23);
		rb_vaccine_no.setActionCommand("No");
		contentPane.add(rb_vaccine_no);
		rb_vaccine_no.setVisible(false);
		
		txtpnTrained = new JTextPane();
		txtpnTrained.setEditable(false);
		txtpnTrained.setText("Trained:");
		txtpnTrained.setBounds(10, 413, 44, 20);
		contentPane.add(txtpnTrained);
		txtpnTrained.setVisible(false);
		
		rb_trained_yes = new JRadioButton("Yes");
		rb_trained_yes.setBounds(73, 410, 57, 23);
		rb_trained_yes.setActionCommand("Yes");
		contentPane.add(rb_trained_yes);
		rb_trained_yes.setVisible(false);
		
		rb_trained_no = new JRadioButton("No");
		rb_trained_no.setBounds(123, 410, 44, 23);
		rb_trained_no.setActionCommand("No");
		contentPane.add(rb_trained_no);
		rb_trained_no.setVisible(false);
		
		txtpnFurtille = new JTextPane();
		txtpnFurtille.setEditable(false);
		txtpnFurtille.setText("Furtille:");
		txtpnFurtille.setBounds(10, 455, 44, 20);
		contentPane.add(txtpnFurtille);
		
		rb_furtille_yes = new JRadioButton("Yes");
		rb_furtille_yes.setBounds(73, 452, 57, 23);
		rb_furtille_yes.setActionCommand("Yes");
		contentPane.add(rb_furtille_yes);
		rb_furtille_yes.setVisible(false);
		
		rb_furtille_no = new JRadioButton("No");
		rb_furtille_no.setBounds(123, 455, 109, 23);
		rb_furtille_no.setActionCommand("No");
		contentPane.add(rb_furtille_no);
		rb_furtille_no.setVisible(false);
		

		groupFurtille = new ButtonGroup();
		groupFurtille.add(rb_furtille_yes);
		groupFurtille.add(rb_furtille_no);

		
		groupTrained = new ButtonGroup();
		groupTrained.add(rb_trained_yes);
		groupTrained.add(rb_trained_no);

		groupVaccine = new ButtonGroup();
		groupVaccine.add(rb_vaccine_yes);
		groupVaccine.add(rb_vaccine_no);

		
		cb_location = new JComboBox();
		cb_location.setBounds(123, 211, 96, 22);
		contentPane.add(cb_location);
		
		cb_Personality = new JComboBox();
		cb_Personality.setBounds(123, 118, 96, 22);
		contentPane.add(cb_Personality);
		
		cb_age = new JComboBox();
		cb_age.setBounds(123, 149, 96, 22);
		contentPane.add(cb_age);
		
		cb_FinalSize = new JComboBox();
		cb_FinalSize.setBounds(123, 178, 96, 22);
		contentPane.add(cb_FinalSize);
		
		cb_breed = new JComboBox();
		cb_breed.setBounds(123, 85, 96, 22);
		contentPane.add(cb_breed);

		cb_Gender = new JComboBox();
		cb_Gender.setBounds(123, 244, 96, 22);
		contentPane.add(cb_Gender);
		
		 
		btn_goBack = new JButton("Go back");
		btn_goBack.setBounds(218, 351, 89, 23);
		contentPane.add(btn_goBack);
		
		
			}
	
	//making the page visible and setting up the user name on top left
	public void displayPage(String userName) {
		setDearUserName(userName);
		this.setVisible(true);	
	}
	
	// set the user name on top left corner
	public void setDearUserName(String userName) {
		if(userName!=null)
		txtpn_dear_user.setText("Dear "+userName+",");
	}
	
	
	public void addAdvancedListener(ItemListener press) {
		cb_AdvancedOptions.addItemListener(press);
	}


	public void addGoBackListener(ActionListener goBack) {
		btn_goBack.addActionListener(goBack);
	}
	
	public void addSearchListener(ActionListener search) {
		btn_search.addActionListener(search);
	}
	
	public void displayErrorMessage(String errorMsg) {
		JOptionPane.showMessageDialog(this,errorMsg);
	}
	
	public void setAdvancedVisible(boolean flag) {
	
    	txtpnPersonality.setVisible(flag);
    	txtpnFurtille.setVisible(flag);
    	txtpnTrained.setVisible(flag);
    	txtpnVaccine.setVisible(flag);
    	
    	cb_Personality.setVisible(flag);
    	rb_vaccine_yes.setVisible(flag);
    	rb_vaccine_no.setVisible(flag);
    	rb_furtille_yes.setVisible(flag);
    	rb_furtille_no.setVisible(flag);
       	rb_trained_yes.setVisible(flag);
    	rb_trained_no.setVisible(flag);
	}
	

	public String getBreed() {

			
		return cb_breed.getSelectedItem().toString();
}
	
	public String getAge() {
		
		return cb_age.getSelectedItem().toString();
}
	
	public String getDogLocation() {
		return cb_location.getSelectedItem().toString();
	}

	public String getPersonality() {
		
		return cb_Personality.getSelectedItem().toString();
}
	// get the button value
	public String getFurtille() {
		return groupFurtille.getSelection().getActionCommand();
	}
	
	public String getVaccine() {
		return groupVaccine.getSelection().getActionCommand();
	}
	
	public String getTrained() {
		return groupTrained.getSelection().getActionCommand();
	}
	
	public void exitPage() {
		Exit();
	}
	
	
}
	
	
