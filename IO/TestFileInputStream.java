package IO;

import java.io.*;

public class TestFileInputStream {
	public static void main(String args[]){
		int b = 0;
		FileInputStream in = null;
		try{
			in = new FileInputStream("E:\\MyJAVA\\TEST\\src\\IO\\TestFileInputStream.java");//向里向外都是只针对写的程序而言。
		} catch(FileNotFoundException e){
			System.out.println("cannot find the selected file.");
			System.exit(-1);
		}
		
		try{
			long num = 0;
			while((b=in.read())!=-1){
				System.out.print((char)b);//结果打印出这个程序的代码
				num++;//计数读了多少个字字符
			}
			in.close();
			System.out.println();
			System.out.println("read "+num+" characters in total.");
		}catch(IOException e1){
			System.out.println("error in reading the file.");
			System.exit(-1);//0表示正常退出，其他非零数表示错误退出，号码为错误编号。System为java一个类。System。exit()方法表示终止虚拟机停止程序。
		}
	}
}
