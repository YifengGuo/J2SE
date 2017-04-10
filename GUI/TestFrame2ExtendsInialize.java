package GUI;
import java.awt.*;
public class TestFrame2ExtendsInialize {
	public static void main(String[] args){
		myFrame mf1 = new myFrame(100,100,100,100,Color.white);
		myFrame mf2 = new myFrame(100,200,100,100,Color.blue);
		myFrame mf3 = new myFrame(100,300,100,100,Color.yellow);
		myFrame mf4 = new myFrame(100,400,100,100,Color.red);

	}
}


class myFrame extends Frame{ 
	static int id = 0;
	myFrame(int x,int y,int w,int h, Color color){
		super("myFrame "+ (++id));
		setBackground(color);
		setBounds(x,y,w,h);
		setLayout(null);//布局管理器设为空;
		setVisible(true);
	}
}