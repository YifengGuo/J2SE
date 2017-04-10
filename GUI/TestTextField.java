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
		TextField tf = (TextField)e.getSource();//getSource()���ص����¼�һ��ʼ�����ڵĶ��󣬷���ֵ��Object��������Ҫǿ��ת��;
												//getSource����������һ�������������һ������¼�Դ����;
		System.out.println(tf.getText());
		tf.setText("");//�ٰ�TextField��ֵ��Ϊ�գ��Ա����������µ��ı�;
	}
}
