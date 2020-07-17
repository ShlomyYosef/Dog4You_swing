package View;


import java.awt.EventQueue;
import javax.swing.DefaultListModel;
import javax.swing.JButton;

import javax.swing.JFrame;
import javax.swing.JPanel;

import javax.swing.border.EmptyBorder;

import model.Client;
import model.Dog;

import javax.swing.JList;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;




public class AdminUI extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private DefaultListModel DLM_result;
	private JList list;
	private JPanel contentPane;
	private JButton btn_logout;
	private JButton btn_remove;
	private JButton btn_add;
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
	public AdminUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 587, 550);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		

		
		list = new JList();
		list.setBounds(10, 0, 524, 356);
		contentPane.add(list);
		
		btn_add = new JButton("Add");
		btn_add.setBounds(10, 395, 89, 23);
		contentPane.add(btn_add);
		
		btn_remove = new JButton("Remove");
		btn_remove.setBounds(445, 395, 89, 23);
		contentPane.add(btn_remove);
		
		btn_logout = new JButton("logout");
		btn_logout.setBounds(249, 477, 89, 23);
		contentPane.add(btn_logout);
		DLM_result=new DefaultListModel();


			}
	
	//making the page visible and setting up the user name on top left
	public void displayPage() {
		this.setVisible(true);	
	}
	
	public void addGoBackListener(ActionListener goBack) {
		
		btn_logout.addActionListener(goBack);
	}
	
	public void addClientListener(ActionListener addUser) {
		btn_add.addActionListener(addUser);
	}
	
	public void addDeleteListener(ActionListener removeUser) {
		btn_remove.addActionListener(removeUser);
	}
	
	public void displayErrorMessage(String errorMsg) {
		JOptionPane.showMessageDialog(this,errorMsg);
	}
	
	public void exitPage() {
		Exit();
	}
	
	public void clearList() {
		list.removeAll();
	}
	
	public void setListResult() {
		list.setModel(DLM_result);
	}
	
	public void addClientToListElement(Client element) {
		DLM_result.addElement(element);
	}
	
	public void removeItemFromList(int index) {
		DLM_result.remove(index);
}
	public Client getSelectedItem() {
		return (Client)list.getSelectedValue();
	}
	public int getSelectedIndex() {
		return list.getSelectedIndex();
	}
}
