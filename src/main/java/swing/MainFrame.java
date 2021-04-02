package swing;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.time.Year;

import javax.swing.BoxLayout;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;

public class MainFrame extends JFrame {


	private JLabel label;

	@SuppressWarnings("rawtypes")
	public MainFrame() {

		Container panel = getContentPane();
		panel.setLayout(new BorderLayout());
		panel.add(getHeader(), BorderLayout.NORTH);
		panel.add(getList(), BorderLayout.CENTER);

	}

	public JPanel getList() {
		JPanel listcontainer = new JPanel();
		JPanel centerPanel = new JPanel();
		
		centerPanel.add(getQuestion("Question 1"));
		centerPanel.add(getQuestion("Question 2"));
		centerPanel.add(getQuestion("Question 3"));
		centerPanel.add(getQuestion("Question 4"));
		centerPanel.add(getQuestion("Question 5"));
		centerPanel.add(getQuestion("Question 6"));
		centerPanel.add(getQuestion("Question 7"));
		centerPanel.add(getQuestion("Question 8"));
		centerPanel.add(getQuestion("Question 9"));
		
		listcontainer.add(centerPanel);
		centerPanel.setLayout(new BoxLayout(centerPanel, BoxLayout.Y_AXIS));
		return listcontainer;
	}
	
	public JPanel getQuestion (String questionNumero) {
		JPanel questionPanel = new JPanel();
		questionPanel.setLayout(new FlowLayout());
		
		JLabel questionLabel = new JLabel();
		questionLabel.setText(questionNumero);
		
		JButton selectButton = new JButton("Voir");
		
		questionPanel.add(questionLabel);
		questionPanel.add(selectButton);
		
		return questionPanel;
	}
	
	public JPanel getHeader() {
			
		JPanel ConnectionPannel = new JPanel();
		JButton connectionButton = new JButton("Se connecter");
		ConnectionPannel.add(connectionButton);
		ConnectionPannel.setLayout(new FlowLayout(FlowLayout.TRAILING));
		
		JPanel titleContainer = new JPanel();
		label = new JLabel();
		label.setText("Questions");
		label.setFont(label.getFont().deriveFont(30.0f));
		titleContainer.add(label);

		JPanel headerPannel = new JPanel();
		headerPannel.setLayout(new BoxLayout(headerPannel, BoxLayout.Y_AXIS));
		headerPannel.add(ConnectionPannel);
		headerPannel.add(titleContainer);
				
		return headerPannel;
	}
	


}
