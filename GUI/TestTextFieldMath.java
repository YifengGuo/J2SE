package GUI;
import java.awt.*;
import java.awt.event.*;

public class TestTextFieldMath {
	public static void main(String[] args){
		new TFFrame3().launchFrame();
	}
}

class TFFrame3 extends Frame{
	TextField num1,num2,num3;//����ȫ�ֱ���;
	public void launchFrame(){
		num1 = new TextField(10);
		num2 = new TextField(10);
		num3 = new TextField(15);
		Label lblPlus = new Label("+");
		Button btnEqual = new Button("=");
		
		btnEqual.addActionListener(new EqualMonitor());
		//btnEqual.addActionListener(new EqualMonitor(num1,num2,num3));//����
		setLayout(new FlowLayout());
		add(num1);
		add(lblPlus); 
		add(num2);
		add(btnEqual);
		add(num3);
		pack();
		setVisible(true);

	}
	class EqualMonitor implements ActionListener{//����,�������������ڳ�������Frame��������ã��������ڲ���;
												//����ֱ�ӷ����ⲿ��װ��ĳ�Ա�����ͱ�����class��$��ʾ�ڲ���;
		public void actionPerformed(ActionEvent e){
			int n1 = Integer.parseInt(num1.getText());
			int n2 = Integer.parseInt(num2.getText());
			num3.setText(""+(n1+n2));
		}
	}
}
/*
class EqualMonitor implements ActionListener{//��һ,�������������ڳ�������Frame��������ã�
	TFFrame3 tf = null;
	
	public EqualMonitor(TFFrame3 tf){
		this.tf = tf;
	}
	public void actionPerformed(ActionEvent e){
		int n1 = Integer.parseInt(tf.num1.getText());
		int n2 = Integer.parseInt(tf.num2.getText());
		tf.num3.setText(""+(n1+n2));
	}
}

*/

/*class EqualMonitor implements ActionListener{����(������);
	TextField num1,num2,num3;
	public EqualMonitor(TextField num1,TextField num2,TextField num3){
		this.num1 = num1;
		this.num2 = num2;
		this.num3 = num3;
	}
	public void actionPerformed(ActionEvent e){//e��btnEqual�����ġ����ȡ��num��ֵ��
											   //��Textfield�Ķ�����Ϊȫ�ֱ������ڼ�������д���캯������ת��Ϊint����;
		int n1 = Integer.parseInt(num1.getText());
		int n2 = Integer.parseInt(num2.getText());
		num3.setText(""+(n1+n2));
		
	}
}*/