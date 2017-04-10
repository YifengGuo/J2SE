package IO;
import java.io.*;
public class TestTransForm2SystemIn {
	public static void main(String args[]){
		InputStreamReader isr = new InputStreamReader(System.in);//System.in就是终端输入命令(阻塞命令or同步命令)，不输入则等待。
		BufferedReader br = new BufferedReader(isr);//为了使用readLine()将bufferedreader套在转换流InputStreamReader上;
		String s = null;
		try{
			s = br.readLine();//先读一行。
			while(s!=null){
				if(s.equalsIgnoreCase("exit")) break;//忽略大小写遇到exit则退出输入窗口。
				System.out.println(s.toUpperCase());//如果没有退出则将读到的字符换为大写。
				s = br.readLine();//读下一行。
			}
			br.close();
		}catch(IOException e){
			e.printStackTrace();
		}
	}
}
