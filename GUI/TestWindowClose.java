package GUI;
import java.awt.*;
import java.awt.event.*;
public class TestWindowClose {
	public static void main(String[] args){
		new MyFrame10("Window closes");
	}
}

class MyFrame10 extends Frame{
	MyFrame10(String s){
		super(s);
		this.setBackground(new Color(204,204,255));
		this.setBounds(300,300,400,400);
		this.setLayout(null);
		this.setVisible(true);
		this.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e){
				setVisible(false);
				System.exit(-1);
			}
		});
	}
}