package IO;
import java.io.*;
public class TestWriter {
	public static void main(String args[]){
		//FileWriter fw = null;
		try{
			FileWriter fw = new FileWriter("E:\\MyJAVA\\TEST\\src\\IO\\unicode.txt");
			for(int i = 0;i<65535;i++){
				fw.write(i);
			}
			fw.close();
		}catch(IOException e1){
			e1.printStackTrace();
			System.out.println("error in writing the file");System.exit(-1);
		}
	}
}
