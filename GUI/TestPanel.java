package GUI;
import java.awt.*;
public class TestPanel {
	public static void main(String[] args){
		Frame f = new Frame("Frame with Panel");
		Panel p = new Panel(null);
		
		f.setLayout(null);
		f.setBackground(new Color(0,0,102));//三原色每个原色的分量;red,green,blue;
		f.setBounds(300, 300, 300, 300);
		
		p.setBounds(50, 50, 200, 200);//panel的坐标是相对于其承载的container; 
		p.setBackground(new Color(204,204,205));
		
		f.add(p);
		f.setVisible(true);
		
	}
}
