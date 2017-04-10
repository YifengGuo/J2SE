package GUI;
import java.awt.*;	
import java.awt.event.*;
public class TestActionEvent {
	public static void main(String[] args){
		Frame f = new Frame("TestActionEvent");
		Button b = new Button("Press Me!");
		f.add(b,BorderLayout.CENTER);
		
		Monitor bh = new Monitor();
		
		b.addActionListener(bh);
		f.pack();
		f.setVisible(true);
	}
}

class Monitor implements ActionListener{//事件模型; 
	public void actionPerformed(ActionEvent e){//系统将事件包装成对象，传到ActionEvent e里面。通过对象e可以知道事件的具体信息;
											   //Button被按下的这件事是ActionEvent e;
		System.out.println("a button has been pressed!");
	}
}