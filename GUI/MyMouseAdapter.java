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
		this.addWindowListener(new WindowAdapter(){//局部类，匿名的内部类;new了一个WindowAdapter类对象将其当成WindowAdapter类来用;
			public void windowClosing(WindowEvent e){
				setVisible(false);
				System.exit(0);
			}
		});
	}
	public void paint(Graphics g){
		Iterator i = points.iterator();//将ArrayList()中所有点遍历；
		while(i.hasNext()){//将ArrayList中的所有点拿出，Paint()在每个点上画一个实心圆;
			Point p = (Point)i.next();//Point类
			g.setColor(Color.BLUE);
			g.fillOval(p.x, p.y, 10, 10);//鼠标点一次就new一个Point到ArrayList中，然后利用迭代器循环遍历，
									    //一有点存入则拿出后Paint一个实心圆在点的坐标上;(Main Thought)
		}
	}
	
	public void addPoint(Point p){
		points.add(p);//每点一下鼠标就将new出来的点放入ArrayList()中。
	}
}

class MyMouseListener extends MouseAdapter{//用implements需要重写的方法太多，所以使用 extends MouseAdapter其自带了所有MouseListener的空方法;
	public void mousePressed(MouseEvent e){//只需要重写需要的mousePressed()方法;
		MyFrame9 mf = (MyFrame9)e.getSource();
		mf.addPoint(new Point(e.getX(),e.getY()));//要知道事件发生在什么位置，e包装了事件(MyFrame9)发生的地点。
												  //鼠标每点一下会new一个Point对象出来;
		mf.repaint(); //对frame强制进行重画,否则看不见画的点;
	}
}