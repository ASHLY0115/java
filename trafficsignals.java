


import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

class GUITrafficLight extends JPanel implements ActionListener {

	JRadioButton r1,r2,r3;
	Color red_c, yellow_c, green_c;
	
	public GUITrafficLight() {
		setBounds(0,0,640,480);
		r1 = new JRadioButton("Red");
		r2 = new JRadioButton("Yellow");
		r3 = new JRadioButton("Green");
		r1.setSelected(true);
		
		red_c = Color.red;
		yellow_c = getBackground();
		green_c = getBackground();
		
		ButtonGroup group = new ButtonGroup();
		r1.addActionListener(this);
		r2.addActionListener(this);
		r3.addActionListener(this);

		group.add(r1);
		group.add(r2);
		group.add(r3);

		
		add(r1);
		add(r2);
		add(r3);
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(r1.isSelected() == true) {
			red_c = Color.red;
			yellow_c = getBackground();
			green_c = getBackground();
		}
		else if(r2.isSelected() == true) {
			red_c = getBackground();
			yellow_c = Color.yellow;
			green_c = getBackground();
		}
		else if(r3.isSelected() == true) {
			red_c = getBackground();
			yellow_c = getBackground();
			green_c = Color.green;
		}
		repaint();
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawOval(50,50,50,50);
		g.drawOval(50,110,50,50);
		g.drawOval(50,170,50,50);
		g.setColor(red_c);
		g.fillOval(50,50,50,50);
		g.setColor(yellow_c);
		g.fillOval(50,110,50,50);
		g.setColor(green_c);
		g.fillOval(50,170,50,50);
	}
	
}

public class trafficsignals {
	
	public static void main(String[] args) {
		JFrame frame = new JFrame("Traffic Light");
		frame.setSize(640,480);
		frame.setLayout(null);
		GUITrafficLight gtf = new GUITrafficLight();
		frame.add(gtf);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}