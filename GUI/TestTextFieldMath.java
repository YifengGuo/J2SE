package GUI;
import java.awt.*;
import java.awt.event.*;

public class TestTextFieldMath {
	public static void main(String[] args){
		new TFFrame3().launchFrame();
	}
}

class TFFrame3 extends Frame{
	TextField num1,num2,num3;//设置全局变量;
	public void launchFrame(){
		num1 = new TextField(10);
		num2 = new TextField(10);
		num3 = new TextField(15);
		Label lblPlus = new Label("+");
		Button btnEqual = new Button("=");
		
		btnEqual.addActionListener(new EqualMonitor());
		//btnEqual.addActionListener(new EqualMonitor(num1,num2,num3));//法二
		setLayout(new FlowLayout());
		add(num1);
		add(lblPlus); 
		add(num2);
		add(btnEqual);
		add(num3);
		pack();
		setVisible(true);

	}
	class EqualMonitor implements ActionListener{//法三,在整个监听器内持有整个Frame对象的引用！并且是内部类;
												//可以直接访问外部包装类的成员方法和变量；class带$表示内部类;
		public void actionPerformed(ActionEvent e){
			int n1 = Integer.parseInt(num1.getText());
			int n2 = Integer.parseInt(num2.getText());
			num3.setText(""+(n1+n2));
		}
	}
}
/*
class EqualMonitor implements ActionListener{//法一,在整个监听器内持有整个Frame对象的引用！
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

/*class EqualMonitor implements ActionListener{法二(不方便);
	TextField num1,num2,num3;
	public EqualMonitor(TextField num1,TextField num2,TextField num3){
		this.num1 = num1;
		this.num2 = num2;
		this.num3 = num3;
	}
	public void actionPerformed(ActionEvent e){//e是btnEqual发出的。如何取得num的值？
											   //将Textfield的对象设为全局变量，在监听器中写构造函数，再转换为int类型;
		int n1 = Integer.parseInt(num1.getText());
		int n2 = Integer.parseInt(num2.getText());
		num3.setText(""+(n1+n2));
		
	}
}*/