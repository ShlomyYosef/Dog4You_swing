package View;


import java.awt.EventQueue;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

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
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


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
		
		JTextPane txtpn_dear_user = new JTextPane();
		txtpn_dear_user.setEditable(false);
		txtpn_dear_user.setEnabled(false);
		txtpn_dear_user.setText("Dear");
		txtpn_dear_user.setBounds(10, 11, 66, 20);
		contentPane.add(txtpn_dear_user);
		
		JTextPane txtpnSearch = new JTextPane();
		txtpnSearch.setText("Search");
		txtpnSearch.setEditable(false);
		txtpnSearch.setBounds(10, 42, 44, 20);
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
		
		JComboBox cb_age = new JComboBox();
		cb_age.setBounds(86, 104, 94, 20);
		contentPane.add(cb_age);
		
		JComboBox cb_race = new JComboBox();
		cb_race.setBounds(86, 73, 94, 20);
		contentPane.add(cb_race);
		
 

		
		JTextPane txtpnLocation = new JTextPane();
		txtpnLocation.setEditable(false);
		txtpnLocation.setText("Location:");
		txtpnLocation.setBounds(10, 137, 57, 20);
		contentPane.add(txtpnLocation);
		
		JComboBox cb_location = new JComboBox();
		cb_location.setBounds(86, 135, 94, 20);
		contentPane.add(cb_location);
		
		JTextPane txtpnPersonality = new JTextPane();
		txtpnPersonality.setEditable(false);
		txtpnPersonality.setText("Personality:");
		txtpnPersonality.setBounds(10, 228, 72, 20);
		contentPane.add(txtpnPersonality);
		txtpnPersonality.setVisible(false);
		
		JComboBox cb_Presonality = new JComboBox();
		cb_Presonality.setBounds(86, 228, 94, 20);
		contentPane.add(cb_Presonality);
		cb_Presonality.setVisible(false);
		
		JTextPane txtpnVaccine = new JTextPane();
		txtpnVaccine.setEditable(false);
		txtpnVaccine.setText("Vaccine:");
		txtpnVaccine.setBounds(10, 271, 57, 20);
		contentPane.add(txtpnVaccine);
		txtpnVaccine.setVisible(false);
		
		JRadioButton rb_vaccine_yes = new JRadioButton("Yes");
		rb_vaccine_yes.setBounds(86, 271, 57, 23);
		contentPane.add(rb_vaccine_yes);
		rb_vaccine_yes.setVisible(false);
		
		JRadioButton rb_vaccine_no = new JRadioButton("No");
		rb_vaccine_no.setBounds(145, 271, 57, 23);
		contentPane.add(rb_vaccine_no);
		rb_vaccine_no.setVisible(false);
		
		JTextPane txtpnTrained = new JTextPane();
		txtpnTrained.setText("Trained:");
		txtpnTrained.setBounds(10, 311, 44, 20);
		contentPane.add(txtpnTrained);
		txtpnTrained.setVisible(false);
		
		JRadioButton rb_trained_yes = new JRadioButton("Yes");
		rb_trained_yes.setBounds(86, 308, 57, 23);
		contentPane.add(rb_trained_yes);
		 rb_trained_yes.setVisible(false);
		
		JRadioButton rb_trained_no = new JRadioButton("No");
		rb_trained_no.setBounds(145, 311, 44, 23);
		contentPane.add(rb_trained_no);
		rb_trained_no.setVisible(false);
		
		JTextPane txtpnFurtille = new JTextPane();
		txtpnFurtille.setText("Furtille:");
		txtpnFurtille.setBounds(10, 347, 44, 20);
		contentPane.add(txtpnFurtille);
		txtpnFurtille.setVisible(false);
		
		JRadioButton rb_furtille_yes = new JRadioButton("Yes");
		rb_furtille_yes.setBounds(86, 344, 57, 23);
		contentPane.add(rb_furtille_yes);
		rb_furtille_yes.setVisible(false);
		
		JRadioButton rb_furtille_no = new JRadioButton("No");
		rb_furtille_no.setBounds(145, 344, 109, 23);
		contentPane.add(rb_furtille_no);
		rb_furtille_no.setVisible(false);
		
		JCheckBox cb_AdvancedOptions = new JCheckBox("Advanced options");
		cb_AdvancedOptions.addItemListener(new ItemListener() {    
            public void itemStateChanged(ItemEvent e) {    
            	boolean flag = false;
             if(e.getStateChange()==1) 
            	 flag = true;
             
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
         });   
		cb_AdvancedOptions.setBounds(10, 180, 141, 23);
		contentPane.add(cb_AdvancedOptions);
		
		

		JList list = new JList();
		list.setBounds(317, 104, 462, 362);
		contentPane.add(list);

		
		JButton btnNewButton = new JButton("Search");
		btnNewButton.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				DefaultListModel DLM=new DefaultListModel();
				DLM.addElement("shlomy");
				DLM.addElement("dvir");
				DLM.addElement("adir");
				DLM.addElement("daniel");
				list.setModel(DLM);
			}
			
		});
		btnNewButton.setBounds(175, 180, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Go back");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Login().setVisible(true);
				Exit();
			
			}
		});
		btnNewButton_1.setBounds(54, 464, 89, 23);
		contentPane.add(btnNewButton_1);
			}
}
