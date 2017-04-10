package GUI;
import java.awt.*;
public class TestBorderLayout {
	public static void main(String[] args){
		Frame f = new Frame("Border Layout");
		Button bn = new Button("BN");
		Button bs = new Button("BS");
		Button bw = new Button("BW");
		Button be = new Button("BE");
		Button bc = new Button("BC");

		f.add(bn, BorderLayout.NORTH);
		f.add(bs, BorderLayout.SOUTH);
		f.add(bw, BorderLayout.WEST);
		f.add(be, BorderLayout.EAST);
		f.add(bc, BorderLayout.CENTER);
		
		/*
		f.add(bn,"NORTH");
		f.add(bs,"South");
		f.add(bw,"West");
		f.add(be,"East");
		f.add(bc,"Center");
		*/
		f.setSize(200,200);
		f.setVisible(true);
	}
}	
