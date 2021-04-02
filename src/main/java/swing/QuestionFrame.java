package swing;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.HeadlessException;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;

import javax.imageio.ImageIO;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class QuestionFrame extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public QuestionFrame() {
		ConnectionFrame connectionFrame = new ConnectionFrame();
		Container content = getContentPane();
		content.setLayout(new BorderLayout());
		content.add(groupPanel(), BorderLayout.CENTER);
		
		setVisible(true);
		
	}
	
	
	
	public JPanel getQuestionLabel(String questionText) {
		JPanel questionPanel = new JPanel();
		questionPanel.setLayout(new FlowLayout());
		
		JLabel questionLabel = new JLabel();
		questionLabel.setText(questionText);
		
		questionPanel.add(questionLabel);
		
		return questionPanel;
	}
	
	public JPanel getInputLabel() {
		JPanel inputPanel = new JPanel();
		JPanel inputList = new JPanel();
		inputList.setLayout(new BoxLayout(inputList, BoxLayout.Y_AXIS));
		
		JRadioButton oui = new JRadioButton();
		oui.setText("oui");
		JRadioButton non = new JRadioButton();
		non.setText("non");
		inputList.add(oui);
		inputList.add(non);
		
		inputPanel.add(inputList);
		return inputPanel;
		
	}
	
	public JPanel getValidateButton() {
		JButton validate = new JButton();
		validate.setText("Valider");
		
		JPanel buttonPanel = new JPanel();
		buttonPanel.setLayout(new FlowLayout());
		buttonPanel.add(validate);
		return buttonPanel;
	}
	
	public JPanel groupPanel() {
		JPanel groupPanel = new JPanel();
		groupPanel.setLayout(new BoxLayout(groupPanel, BoxLayout.Y_AXIS));
		
		groupPanel.add(getQuestionLabel("Question 1 : Une classe peut elle avoir 2 constructeurs ?"));
		groupPanel.add(getQuestionImage());
		groupPanel.add(getInputLabel());
		groupPanel.add(getValidateButton());
		return groupPanel;
	}
	
	public JLabel getQuestionImage() { 
		
		JLabel label = new JLabel(new ImageIcon(getClass().getResource("/image.png")));
		
		return label;
	}
	
	
	

}
