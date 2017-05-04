package thePackage;

import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JLabel;
import javax.swing.JScrollBar;
import javax.swing.JPanel;
import java.awt.GridLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import javax.swing.JButton;
import java.awt.Insets;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextPane;
import javax.swing.AbstractAction;
import javax.swing.Action;

public class Interface {

	private JFrame frame;
	private JTextField textField;
	private String text;
	private final Action action = new SwingAction();
	private TextLoader textLoader; 
	private Charger charger;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Interface window = new Interface();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Interface() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setSize(879, 512);
		frame.setBackground(Color.BLACK);
		frame.getContentPane().setLayout(null);
		
		
		JButton btnSearch = new JButton("Search");
		btnSearch.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent hola){
				ioText();
			}
		});
		btnSearch.setBounds(717, 33, 89, 23);
		frame.getContentPane().add(btnSearch);
		
		textField = new JTextField();
		textField.setBounds(24, 34, 670, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JScrollBar scrollBar = new JScrollBar();
		scrollBar.setBounds(841, 11, 17, 455);
		frame.getContentPane().add(scrollBar);
		
		JTextPane txtpnGoogleFinder = new JTextPane();
		txtpnGoogleFinder.setText("Google Finder");
		txtpnGoogleFinder.setBounds(24, 11, 220, 20);
		txtpnGoogleFinder.setEditable(false);
		frame.getContentPane().add(txtpnGoogleFinder);
	}
	
	public void ioText(){
		this.text = this.textField.getText();
		textLoader = new TextLoader();
		textLoader.readText(this.text);
		
	}
	
	public String getText() {
		return text;
	}
	
	private class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(NAME, "SwingAction");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
		}
	}
}
