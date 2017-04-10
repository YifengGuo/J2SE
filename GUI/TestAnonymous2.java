package GUI;
import java.awt.*;
import java.awt.event.*;
public class TestAnonymous2 {
	Frame f = new Frame("TestAnonymous2");
	TextField tf = new TextField(10);
	Button b = new Button("Start");
	
	public TestAnonymous2(){
		f.add(b,"North");
		f.add(tf,"South");
		f.setVisible(true);
		b.addActionListener(new ActionListener(){
			int i = 0;
			public void actionPerformed(ActionEvent e){
				tf.setText(e.getActionCommand() + ++i);
			}
		});
		f.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e){
				f.setVisible(false);
				System.exit(0);
			}
		});
		f.pack();
	}
	public static void main(String[] args){
		new TestAnonymous2();
	}
}
