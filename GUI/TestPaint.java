package GUI;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
public class TestPaint {
	public static void main(String[] args){
		new PaintFrame().launch();
	}
}

class PaintFrame extends Frame{
	public void launch(){
		setBackground(Color.lightGray);
		setBounds(200,200,640,480);
		setVisible(true);
		this.addWindowListener(new WindowAdapter(){

			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
			
		});
	}
	public void paint(Graphics g){//Graphics g��ͬһ֧����;��дpaint()���ɿ�ʼ������
								  //��Frame��Ҫ�ػ���ʱ��Paint()�Զ����ã������ı䴰�ڴ�С����С��;
		Color c = g.getColor();
		g.setColor(Color.red);
		g.fillOval(50, 50, 30, 30);//���ε�������Բ��
		g.setColor(Color.green);
		g.fillRect(80, 80, 40, 40);
		g.setColor(c);//�����ʵ���ɫ��ԭΪ��ʼɫ;
	}
}
