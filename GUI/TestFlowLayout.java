package GUI;
import java.awt.*;
public class TestFlowLayout {
	public static void main(String args[]){
		Frame f = new Frame("FlowLayout");
		Button button1 = new Button("Ok");
		Button button2 = new Button("Open");
		Button button3 = new Button("Close");
		f.setLayout(new FlowLayout(FlowLayout.LEFT));
		f.add(button1);
		f.add(button2);
		f.add(button3);
		f.setSize(100, 100);
		f.setVisible(true);
	}
}