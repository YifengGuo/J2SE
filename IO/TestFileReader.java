package IO;
import java.io.*;
public class TestFileReader {
	public static void main(String args[]){
		//FileReader fr = null;
		int c = 0;
		try{
			FileReader fr = new FileReader("E:\\MyJAVA\\TEST\\src\\IO\\TestFileReader.java");
			while((c = fr.read())!=-1){
				System.out.print((char)c);
			}
			fr.close();
		}catch(FileNotFoundException e2){
			System.out.println("cannot find file.");
		}catch(IOException e1){
			System.out.println("error in reading the file.");
		}
	}
}
