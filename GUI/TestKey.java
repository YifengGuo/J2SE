package GUI;
import java.awt.*;
import java.awt.event.*;
public class TestKey {
	public static void main(String[] args){
		new KeyFrame("keyframe");
	}
}

class KeyFrame extends Frame{
	    KeyFrame(String s){
		super(s);
		this.setSize(200,200);
		this.setLocation(300,300);
		this.addKeyListener(new MyKeyListener());
		this.setVisible(true);
	}
}

class MyKeyListener extends KeyAdapter{
	public void keyPressed(KeyEvent e){
		int keyCode = e.getKeyCode();
		if(keyCode == e.VK_UP){
		//KeyFrame kf = (KeyFrame)e.getSource();
		//kf.setVisible(false);
		System.exit(0);
		}
	}
}