package GUI;
import java.awt.*;
import java.awt.event.*;
public class TestTextField {
	public static void main(String[] args){
		new TFFrame();
	}
}

class TFFrame extends Frame{
	TFFrame(){
		TextField tf = new TextField();
		add(tf);
		tf.addActionListener(new TFActionListener());
		pack();
		setVisible(true);
	}
}

class TFActionListener implements ActionListener{
	public void actionPerformed(ActionEvent e){
		TextField tf = (TextField)e.getSource();//getSource()返回的是事件一开始发生于的对象，返回值是Object，所以需要强制转换;
												//getSource的作用是在一个类里面访问另一个类的事件源对象;
		System.out.println(tf.getText());
		tf.setText("");//再把TextField的值设为空，以便重新输入新的文本;
	}
}
