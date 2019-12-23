import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class eventh extends Applet implements ActionListener, MouseListener,KeyListener
{
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	public void init()
	{
		Button but = new Button("press this hoe");
		add(but);
		but.addActionListener(this);
		addMouseListener(this);
		but.addKeyListener(this);
	}
	
	
	public void mouseEntered(MouseEvent a)
	{
		showStatus("lol");
	}


	@Override
	public void keyPressed(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	
}
