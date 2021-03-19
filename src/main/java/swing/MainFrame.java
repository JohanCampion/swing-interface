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
		panel.add(getTitlePanel(), BorderLayout.NORTH);
		panel.add(getList());

	}

	public JPanel getList() {
		JPanel listcontainer = new JPanel();
		listcontainer.setLayout(new BoxLayout(listcontainer,BoxLayout.Y_AXIS));
		
		listcontainer.add(new JLabel("Question 1"));
		listcontainer.add(new JLabel("Question 2"));
		listcontainer.add(new JLabel("Question 3"));
		listcontainer.add(new JLabel("Question 4"));
		listcontainer.add(new JLabel("Question 5"));
		listcontainer.add(new JLabel("Question 6"));
		listcontainer.add(new JLabel("Question 7"));
		listcontainer.add(new JLabel("Question 8"));
		listcontainer.add(new JLabel("Question 9"));
		
		listcontainer.setAlignmentX(CENTER_ALIGNMENT);
		
		listcontainer.setBackground(Color.red);

		
		
		
		return listcontainer;
	}
	
	public JPanel getTitlePanel() {
		
		JPanel titleContainer = new JPanel();
		
		label = new JLabel();
		label.setText("Questions");
		label.setFont(label.getFont().deriveFont(30.0f));
		
		titleContainer.add(label, BorderLayout.CENTER);
		
		titleContainer.setBackground(Color.blue);
		
		return titleContainer;
	}

}
