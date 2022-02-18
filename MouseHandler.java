package execises;

import java.awt.*;
import java.awt.event.*;
public class MouseHandler extends Frame implements MouseListener,
MouseMotionListener
{
MouseHandler()
 {
 setSize(300,300);
 setTitle("Experiment16");
 setLayout(null);
 setVisible(true);
 addWindowListener(new WindowAdapter() {
 @Override
 public void windowClosing(WindowEvent e) {
 System.exit(0);
 }
 });
 addMouseListener(this);
 addMouseMotionListener(this);
 }
 
 public void mouseClicked(MouseEvent e)
 {
 setBackground(Color.orange);
 }
 public void mousePressed(MouseEvent e)
 {
 setBackground(Color.red);
 }
 public void mouseReleased(MouseEvent e)
 {
 }
 public void mouseEntered(MouseEvent e)
 {
 setBackground(Color.blue);
 }
 public void mouseExited(MouseEvent e)
 {
 setBackground(Color.magenta);
 }
 public static void main(String[] args)
 {
 new MouseHandler();
 }
 public void mouseDragged(MouseEvent e)
 {
 Graphics g = getGraphics();
 g.fillOval(e.getX(),e.getY(),15,15);
 setBackground(Color.gray);
 }
 public void mouseMoved(MouseEvent e)
 {
 Graphics g = getGraphics();
 g.drawString("Moving", getMousePosition().x, getMousePosition().y);
 setBackground(Color.magenta);
 }
}
