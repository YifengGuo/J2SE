package GUI;
import java.awt.*;
public class TestFlowLayout2 {
	public static void main(String args[]){
	Frame f = new Frame();
	f.setLayout(new FlowLayout(FlowLayout.CENTER,20,40));
	for(int i=0;i<7;i++){
		f.add(new Button("Button"+i));
	}
	f.setSize(300, 300);
	f.setVisible(true);
	}
}
