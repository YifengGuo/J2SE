package GUI;
import java.awt.*;
import java.awt.event.*;
public class TestTFPassword {
	public static void main(String[] args){
		new TFFrame2();
	}
}

class TFFrame2 extends Frame{
	TFFrame2(){
		TextField tf = new TextField();
		add(tf);
		tf.addActionListener(new TFActionListener2());
		pack();
		tf.setEchoChar('*');//�������textfield����ʾ��Ϊ*;
		setVisible(true);
	}
}

class TFActionListener2 implements ActionListener{
	public void actionPerformed(ActionEvent e){
		TextField tf = (TextField)e.getSource();
		System.out.println(tf.getText());
		tf.setText("");
	}
}