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
	public void paint(Graphics g){//Graphics g如同一支画笔;重写paint()即可开始作画。
								  //当Frame需要重画的时候，Paint()自动调用！包括改变窗口大小和最小化;
		Color c = g.getColor();
		g.setColor(Color.red);
		g.fillOval(50, 50, 30, 30);//矩形的内切椭圆。
		g.setColor(Color.green);
		g.fillRect(80, 80, 40, 40);
		g.setColor(c);//将画笔的颜色还原为起始色;
	}
}
