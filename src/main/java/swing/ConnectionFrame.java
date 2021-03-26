package swing;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.HeadlessException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class ConnectionFrame extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ConnectionFrame() {
		Container content = getContentPane();
		content.add(getLoginPanel(), BorderLayout.CENTER);
		content.add(getButtonPanel(), BorderLayout.SOUTH);
		setVisible(true);

	}
	
	public JPanel getLoginPanel() {
		JPanel panel = new JPanel(new BorderLayout());
		JPanel labelPanel = new JPanel(new GridLayout(2,0));
		JLabel userIdLabel = new JLabel("User ID:");
		labelPanel.add(userIdLabel);
		JLabel passwordLabel = new JLabel("Password:");
		labelPanel.add(passwordLabel);
		panel.add(labelPanel, BorderLayout.WEST);
		JPanel fieldPanel = new JPanel(new GridLayout(2,0));
		JTextField userIdField = new JTextField(10);
		fieldPanel.add(userIdField);
		JPasswordField passwordField = new JPasswordField(10);
		fieldPanel.add(passwordField);
		panel.add(fieldPanel, BorderLayout.CENTER);
		
		JLabel title = new JLabel("Connexion");
		JPanel centerPanel = new JPanel(new FlowLayout());
		centerPanel.add(title);
		
		panel.add(centerPanel, BorderLayout.NORTH);
		return panel;
	}
	
	public JPanel getButtonPanel() {
		JPanel panel = new JPanel(new FlowLayout());	
		JButton okButton = new JButton("OK");
		panel.add(okButton);
		return panel;
	}
	
 

}
