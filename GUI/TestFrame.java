package GUI;
import java.awt.*;
public class TestFrame {
	public static void main(String[] args){
		Frame f = new Frame("First");
		f.setBackground(Color.white);
		f.setSize(200,200);
		f.setResizable(false);//cannot change the size of the frame. 
		f.setVisible(true);
	}
}
