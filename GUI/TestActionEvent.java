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

class Monitor implements ActionListener{//�¼�ģ��; 
	public void actionPerformed(ActionEvent e){//ϵͳ���¼���װ�ɶ��󣬴���ActionEvent e���档ͨ������e����֪���¼��ľ�����Ϣ;
											   //Button�����µ��������ActionEvent e;
		System.out.println("a button has been pressed!");
	}
}