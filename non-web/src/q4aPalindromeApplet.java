import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class q4aPalindromeApplet extends Applet implements KeyListener{

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	TextField tf=new TextField(10);
	public void init()
	{
		
		add(new Label("Enter the string"));
		add(tf);
		tf.addKeyListener(this);
		
	}
	
	public boolean palin(String s)
	{
		int i,j;
		for(i=0,j=s.length()-1;i<j;i++,j--)
		{
			if(s.charAt(i)!=s.charAt(j))
				return false;
		}
		return true;
	}
	public void keyPressed(KeyEvent e) {

		String inp=tf.getText();
		if(e.getKeyChar()=='p'){
		if(palin(inp)){
			showStatus("It is a palindrome");
		}
		else showStatus("Not a palindrome");
		}
		else showStatus("Key Pressed");
		
	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		
	}

	@Override
	public void keyTyped(KeyEvent e) {

	}
	
}

