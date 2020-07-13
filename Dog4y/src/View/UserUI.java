package View;


import java.awt.EventQueue;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ButtonGroup;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextPane;
import javax.swing.border.EmptyBorder;

import javax.swing.JList;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;



public class UserUI extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextPane txtpn_dear_user;
	private JButton btn_goBack;
	private JButton btn_search;
	private JComboBox cb_breed;
	private JComboBox cb_Presonality;
	private JComboBox cb_location;
	private JComboBox cb_age;
	private JCheckBox cb_AdvancedOptions;
	private JTextPane txtpnPersonality;
	private JTextPane txtpnFurtille;
	private JTextPane txtpnTrained;
	private JTextPane txtpnVaccine;
	

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
					UserUI frame = new UserUI();
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
	public UserUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 851, 550);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtpn_dear_user = new JTextPane();
		txtpn_dear_user.setEditable(false);
		txtpn_dear_user.setBounds(10, 11, 66, 20);
		contentPane.add(txtpn_dear_user);
		
		JTextPane txtpnSearch = new JTextPane();
		txtpnSearch.setText("Search");
		txtpnSearch.setEditable(false);
		txtpnSearch.setBounds(10, 42, 44, 20);
		contentPane.add(txtpnSearch);
		
		JTextPane txtpnRace = new JTextPane();
		txtpnRace.setEditable(false);
		txtpnRace.setText("Breed :");
		txtpnRace.setBounds(10, 73, 66, 20);
		contentPane.add(txtpnRace);
		
		JTextPane txtpnAge = new JTextPane();
		txtpnAge.setEditable(false);
		txtpnAge.setText("Age:");
		txtpnAge.setBounds(10, 104, 44, 20);
		contentPane.add(txtpnAge);
		String[] age1 = {"","0-1","1-2","3-4"};
		cb_age = new JComboBox(age1);
		cb_age.setBounds(86, 104, 94, 20);
		contentPane.add(cb_age);
		
		 String[] bre1 = {"","8","9","10"};
		cb_breed = new JComboBox(bre1);
		cb_breed.setBounds(86, 73, 94, 20);
		contentPane.add(cb_breed);
		

		JTextPane txtpnLocation = new JTextPane();
		txtpnLocation.setEditable(false);
		txtpnLocation.setText("Location:");
		txtpnLocation.setBounds(10, 137, 57, 20);
		contentPane.add(txtpnLocation);
		
		 String[] loc1 = {"","4","5","6"};
		cb_location = new JComboBox(loc1);
		cb_location.setBounds(86, 135, 94, 20);
		contentPane.add(cb_location);
		
		txtpnPersonality = new JTextPane();
		txtpnPersonality.setEditable(false);
		txtpnPersonality.setText("Personality:");
		txtpnPersonality.setBounds(10, 228, 66, 20);
		contentPane.add(txtpnPersonality);
		txtpnPersonality.setVisible(false);
		
		 String[] person = {"","1","2","3"};
		cb_Presonality = new JComboBox(person);
		cb_Presonality.setBounds(86, 228, 94, 20);
		contentPane.add(cb_Presonality);
		cb_Presonality.setVisible(false);
		
		txtpnVaccine = new JTextPane();
		txtpnVaccine.setEditable(false);
		txtpnVaccine.setText("Vaccine:");
		txtpnVaccine.setBounds(10, 271, 57, 20);
		txtpnVaccine.setEditable(false);
		contentPane.add(txtpnVaccine);
		txtpnVaccine.setVisible(false);
		
		rb_vaccine_yes = new JRadioButton("Yes");
		rb_vaccine_yes.setBounds(86, 271, 57, 23);
		rb_vaccine_yes.setActionCommand("Yes");
		contentPane.add(rb_vaccine_yes);
		rb_vaccine_yes.setVisible(false);
		
		rb_vaccine_no = new JRadioButton("No");
		rb_vaccine_no.setBounds(145, 271, 57, 23);
		rb_vaccine_no.setActionCommand("No");
		contentPane.add(rb_vaccine_no);
		rb_vaccine_no.setVisible(false);
		
		txtpnTrained = new JTextPane();
		txtpnTrained.setText("Trained:");
		txtpnTrained.setBounds(10, 311, 44, 20);
		txtpnTrained.setEditable(false);
		contentPane.add(txtpnTrained);
		txtpnTrained.setVisible(false);
		
		rb_trained_yes = new JRadioButton("Yes");
		rb_trained_yes.setBounds(86, 308, 57, 23);
		rb_trained_yes.setActionCommand("Yes");
		contentPane.add(rb_trained_yes);
		 rb_trained_yes.setVisible(false);
		
		rb_trained_no = new JRadioButton("No");
		rb_trained_no.setBounds(145, 308, 44, 23);
		rb_trained_no.setActionCommand("No");
		contentPane.add(rb_trained_no);
		rb_trained_no.setVisible(false);
		
		txtpnFurtille = new JTextPane();
		txtpnFurtille.setText("Furtille:");
		txtpnFurtille.setBounds(10, 347, 44, 20);
		txtpnFurtille.setEditable(false);
		contentPane.add(txtpnFurtille);
		txtpnFurtille.setVisible(false);
		
		rb_furtille_yes = new JRadioButton("Yes");
		rb_furtille_yes.setBounds(86, 344, 57, 23);
		rb_furtille_yes.setActionCommand("Yes");
		contentPane.add(rb_furtille_yes);
		rb_furtille_yes.setVisible(false);
		
		rb_furtille_no = new JRadioButton("No");
		rb_furtille_no.setBounds(145, 344, 109, 23);
		rb_furtille_no.setActionCommand("No");
		contentPane.add(rb_furtille_no);
		rb_furtille_no.setVisible(false);
		
		cb_AdvancedOptions = new JCheckBox("Advanced options");  
		cb_AdvancedOptions.setBounds(10, 180, 141, 23);
		contentPane.add(cb_AdvancedOptions);
		
		groupFurtille = new ButtonGroup();
		groupFurtille.add(rb_furtille_yes);
		groupFurtille.add(rb_furtille_no);

		
		groupTrained = new ButtonGroup();
		groupTrained.add(rb_trained_yes);
		groupTrained.add(rb_trained_no);

		groupVaccine = new ButtonGroup();
		groupVaccine.add(rb_vaccine_yes);
		groupVaccine.add(rb_vaccine_no);

		
		JList list = new JList();
		list.setBounds(317, 104, 462, 362);
		contentPane.add(list);

		
		 btn_search = new JButton("Search");
		 btn_search.setBounds(175, 180, 89, 23);
		 contentPane.add(btn_search);
			
//			public void actionPerformed(ActionEvent e) {
//				DefaultListModel DLM=new DefaultListModel();
//				DLM.addElement("shlomy");
//				DLM.addElement("dvir");
//				DLM.addElement("adir");
//				DLM.addElement("daniel");
//				list.setModel(DLM);
//			}
//			
//		});

		
		btn_goBack = new JButton("Go back");
		btn_goBack.setBounds(54, 464, 89, 23);
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
    	
    	cb_Presonality.setVisible(flag);
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
		
		return cb_Presonality.getSelectedItem().toString();
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
