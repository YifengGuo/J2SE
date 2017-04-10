package IO;
import java.io.*;
import java.util.*;
public class TestPrintStream3 {
	public static void main(String args[]){
		InputStreamReader fr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(fr);
		String s = null;
		try{
			FileWriter fw = new FileWriter("E:\\MyJAVA\\TEST\\src\\IO\\TestPrintStream3Log.txt",true);
			PrintWriter log = new PrintWriter(fw);
			while((s=br.readLine())!=null){
				if(s.equalsIgnoreCase("exit")) break;
				System.out.println(s.toUpperCase());
				log.println("----------");//每读一行往log文件里写一行
				log.println(s.toUpperCase());
				log.flush();
			}
			log.println("==="+new Date()+"===");
			log.flush();
			log.close();
		}catch(IOException e){
			e.printStackTrace();
		}
	}
}
