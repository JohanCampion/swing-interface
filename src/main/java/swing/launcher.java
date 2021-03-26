package swing;

import javax.swing.JFrame;

public class launcher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JFrame test = new MainFrame();
		test.setSize(500,500);
		test.setVisible(true);
		
		JFrame test2 = new ConnectionFrame();
		test2.setSize(200,140);

	}

}
