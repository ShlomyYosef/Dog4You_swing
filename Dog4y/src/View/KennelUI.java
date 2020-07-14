package View;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.border.EmptyBorder;

import model.Dog;
import model.DogDetails;

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
import javax.swing.DefaultComboBoxModel;

public class KennelUI extends JFrame {

	private JPanel contentPane;
	private JButton btn_goBack;
	private JButton btn_search;
	private JButton btnAddDog;
	private JButton btnEditDog;
	private JButton btnRemoveDog;
	private JTextField txtNameDog;
	private JTextPane txtpnPersonality;
	private JTextPane txtpnFurtille;
	private JTextPane txtpnTrained;
	private JTextPane txtpnVaccine;
	private JTextPane txtpnGender;

	
	private JComboBox cb_location;
	private JComboBox cb_breed;
	private JComboBox cb_Personality;
	private JComboBox cb_age;
	private JComboBox cb_FinalSize;	
	private JComboBox cb_Gender;
	private JList list;
	private DefaultListModel DLM_result;

	
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
		DogDetails details = new DogDetails(); // adding dog details
		
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
		
		txtNameDog = new JTextField();
		txtNameDog.setColumns(10);
		txtNameDog.setBounds(123, 56, 96, 20);
		contentPane.add(txtNameDog);

	
		txtpnGender = new JTextPane();
		txtpnGender.setText("Gender:");
		txtpnGender.setEditable(false);
		txtpnGender.setBounds(10, 244, 83, 20);
		contentPane.add(txtpnGender);
		txtpnVaccine = new JTextPane();
		txtpnVaccine.setEditable(false);
		txtpnVaccine.setText("Vaccine:");
		txtpnVaccine.setBounds(10, 290, 57, 20);
		txtpnVaccine.setEditable(false);
		contentPane.add(txtpnVaccine);
		
		rb_vaccine_yes = new JRadioButton("Yes");
		rb_vaccine_yes.setBounds(123, 290, 57, 23);
		rb_vaccine_yes.setActionCommand("Yes");
		contentPane.add(rb_vaccine_yes);
		
		
		rb_vaccine_no = new JRadioButton("No");
		rb_vaccine_no.setBounds(192, 290, 57, 23);
		rb_vaccine_no.setActionCommand("No");
		contentPane.add(rb_vaccine_no);
	
		
		txtpnTrained = new JTextPane();
		txtpnTrained.setEditable(false);
		txtpnTrained.setText("Trained:");
		txtpnTrained.setBounds(10, 335, 44, 20);
		contentPane.add(txtpnTrained);
		
		rb_trained_yes = new JRadioButton("Yes");
		rb_trained_yes.setBounds(123, 332, 57, 23);
		rb_trained_yes.setActionCommand("Yes");
		contentPane.add(rb_trained_yes);
		
		rb_trained_no = new JRadioButton("No");
		rb_trained_no.setBounds(192, 332, 44, 23);
		rb_trained_no.setActionCommand("No");
		contentPane.add(rb_trained_no);
		
		txtpnFurtille = new JTextPane();
		txtpnFurtille.setEditable(false);
		txtpnFurtille.setText("Furtille:");
		txtpnFurtille.setBounds(10, 374, 44, 20);
		contentPane.add(txtpnFurtille);
		
		rb_furtille_yes = new JRadioButton("Yes");
		rb_furtille_yes.setBounds(123, 371, 57, 23);
		rb_furtille_yes.setActionCommand("Yes");
		contentPane.add(rb_furtille_yes);
		
		rb_furtille_no = new JRadioButton("No");
		rb_furtille_no.setBounds(192, 371, 109, 23);
		rb_furtille_no.setActionCommand("No");
		contentPane.add(rb_furtille_no);
		

		groupFurtille = new ButtonGroup();
		groupFurtille.add(rb_furtille_yes);
		groupFurtille.add(rb_furtille_no);

		
		groupTrained = new ButtonGroup();
		groupTrained.add(rb_trained_yes);
		groupTrained.add(rb_trained_no);

		groupVaccine = new ButtonGroup();
		groupVaccine.add(rb_vaccine_yes);
		groupVaccine.add(rb_vaccine_no);

		
		cb_location = new JComboBox(details.getLocation());
		cb_location.setBounds(123, 211, 96, 22);
		contentPane.add(cb_location);
		
		cb_Personality = new JComboBox(details.getPersonality());
		cb_Personality.setBounds(123, 118, 96, 22);
		contentPane.add(cb_Personality);
		
		cb_age = new JComboBox(details.getAge());
		cb_age.setBounds(123, 149, 96, 22);
		contentPane.add(cb_age);
		
		cb_FinalSize = new JComboBox(details.getFinalSize());
		cb_FinalSize.setBounds(123, 178, 96, 22);
		contentPane.add(cb_FinalSize);
		
		cb_breed = new JComboBox(details.getBreed());
		cb_breed.setBounds(123, 85, 96, 22);
		contentPane.add(cb_breed);

		cb_Gender = new JComboBox(details.getGender());
		cb_Gender.setBounds(123, 244, 96, 22);
		contentPane.add(cb_Gender);
		
		 
		btn_goBack = new JButton("Go back");
		btn_goBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btn_goBack.setBounds(10, 486, 89, 23);
		contentPane.add(btn_goBack);
		
		btnAddDog = new JButton("Add Dog");
		btnAddDog.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnAddDog.setBounds(218, 418, 89, 23);
		contentPane.add(btnAddDog);
		
		btnEditDog = new JButton("Edit Dog");
		btnEditDog.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnEditDog.setBounds(123, 418, 89, 23);
		contentPane.add(btnEditDog);
		
		btnRemoveDog = new JButton("Remove Dog");
		btnRemoveDog.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnRemoveDog.setBounds(0, 418, 111, 23);
		contentPane.add(btnRemoveDog);
		
		list = new JList();
		list.setBounds(302, 35, 363, 373);
		contentPane.add(list);
	
		DLM_result=new DefaultListModel();
			}
	
	

	public void addGoBackListener(ActionListener goBack) {
		btn_goBack.addActionListener(goBack);
	}
	
	public void addAddDogListener(ActionListener add) {
		btnAddDog.addActionListener(add);
	}
	
	public void addRemoveDogListener(ActionListener remove) {
		btnRemoveDog.addActionListener(remove);
	}
	
	public void addEditDogListener(ActionListener goBack) {
		btnEditDog.addActionListener(goBack);
	}
	
	
	public void addSearchListener(ActionListener search) {
		btn_search.addActionListener(search);
	}
	
	public void displayErrorMessage(String errorMsg) {
		JOptionPane.showMessageDialog(this,errorMsg);
	}
	
	public void displayMessage(String msg) {
		JOptionPane.showMessageDialog(this,msg);
	}
	
	public String getDogName() {
	return txtNameDog.getText();
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
	
	public String getDogGender() {
		return cb_Gender.getSelectedItem().toString();
	}
	
	public String getDogFinalSize() {
		return cb_FinalSize.getSelectedItem().toString();
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
	
	public void clearText() {
		groupFurtille.clearSelection();
		groupTrained.clearSelection();
		groupVaccine.clearSelection();
		cb_location.setSelectedIndex(0);
		cb_Personality.setSelectedIndex(0);
		cb_FinalSize.setSelectedIndex(0);
		cb_Gender.setSelectedIndex(0);
		cb_age.setSelectedIndex(0);
		cb_breed.setSelectedIndex(0);
		txtNameDog.setText("");
	}
	
	public void setListResult() {
		list.setModel(DLM_result);
	}
	
	public Dog getSelectedItem() {
		return (Dog)list.getSelectedValue();
	}
	public int getSelectedIndex() {
		return list.getSelectedIndex();
	}
	
	public void addItemElementToList(Dog element) {
		DLM_result.addElement(element);
	}
	public void setDetailsForEdit(Dog dog) {
		
		txtNameDog.setText(dog.getName());
		cb_FinalSize.setSelectedItem(dog.getFinalSize());
		cb_Personality.setSelectedItem(dog.getCharacter());
		cb_Gender.setSelectedItem(dog.getGender());
		cb_location.setSelectedItem(dog.getLocation());
		cb_age.setSelectedItem(dog.getDogAge());
		cb_breed.setSelectedItem(dog.getBreed());
		
		
		rb_furtille_no.setSelected(!dog.isFurtille());
		rb_furtille_yes.setSelected(dog.isFurtille());
		
		rb_trained_yes.setSelected(dog.isTamed());
		rb_trained_no.setSelected(!dog.isTamed());
		
		rb_vaccine_no.setSelected(!dog.isVaccsine());
		rb_vaccine_yes.setSelected(dog.isVaccsine());
	}
	public void exitPage() {
		Exit();
	}
	public void removeItemFromList(int index) {
			DLM_result.remove(index);
	}
}
	
	
