import java.awt.Color;

import javax.swing.*;

public class FrameBuilder {
	
	private JFrame frame;
	
	public FrameBuilder() {
		frame = new JFrame("Personenstrom");
		frame.setSize(200, 200);
		frame.setVisible(true);
		JPanel jpanel = new JPanel();
		jpanel.setBackground(Color.red);
		frame.add(jpanel);
		jpanel.setBackground(Color.green);
		frame.add(jpanel);
	}

}
