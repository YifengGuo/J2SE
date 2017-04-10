package GUI;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
public class MyMouseAdapter {
	public static void main(String[] args){
		new MyFrame9("Mouse dot");
	}
}

class MyFrame9 extends Frame{
	ArrayList points = null;
	MyFrame9(String s){
		super(s);
		points = new ArrayList();
		setLayout(null);
		setBounds(300,300,400,400);
		this.setBackground(new Color(204,204,255));
		this.addMouseListener(new MyMouseListener());
		this.setVisible(true);
		this.addWindowListener(new WindowAdapter(){//�ֲ��࣬�������ڲ���;new��һ��WindowAdapter������䵱��WindowAdapter������;
			public void windowClosing(WindowEvent e){
				setVisible(false);
				System.exit(0);
			}
		});
	}
	public void paint(Graphics g){
		Iterator i = points.iterator();//��ArrayList()�����е������
		while(i.hasNext()){//��ArrayList�е����е��ó���Paint()��ÿ�����ϻ�һ��ʵ��Բ;
			Point p = (Point)i.next();//Point��
			g.setColor(Color.BLUE);
			g.fillOval(p.x, p.y, 10, 10);//����һ�ξ�newһ��Point��ArrayList�У�Ȼ�����õ�����ѭ��������
									    //һ�е�������ó���Paintһ��ʵ��Բ�ڵ��������;(Main Thought)
		}
	}
	
	public void addPoint(Point p){
		points.add(p);//ÿ��һ�����ͽ�new�����ĵ����ArrayList()�С�
	}
}

class MyMouseListener extends MouseAdapter{//��implements��Ҫ��д�ķ���̫�࣬����ʹ�� extends MouseAdapter���Դ�������MouseListener�Ŀշ���;
	public void mousePressed(MouseEvent e){//ֻ��Ҫ��д��Ҫ��mousePressed()����;
		MyFrame9 mf = (MyFrame9)e.getSource();
		mf.addPoint(new Point(e.getX(),e.getY()));//Ҫ֪���¼�������ʲôλ�ã�e��װ���¼�(MyFrame9)�����ĵص㡣
												  //���ÿ��һ�»�newһ��Point�������;
		mf.repaint(); //��frameǿ�ƽ����ػ�,���򿴲������ĵ�;
	}
}