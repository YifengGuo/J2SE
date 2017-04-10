package IO;
import java.io.*;
public class TestPrintStream {
	public static void main(String args[]){
		PrintStream ps = null;
		try{
			FileOutputStream fos = new FileOutputStream("E:\\MyJAVA\\TEST\\src\\IO\\TestPrintStream.txt");
			ps = new PrintStream(fos);
		}catch(IOException e){
			e.printStackTrace();
		}
		if(ps != null){
			System.setOut(ps);//system.out指向ps;
		}
		int ln = 0;
		for(char c = 0; c<=65535;c++){
			System.out.print(c+" ");
			if(ln++>=100){System.out.println(); ln = 0;}//每打印100个字符空一行;
		}
	}
}
