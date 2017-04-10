package IO;

import java.io.*;

public class TestFileInputStream {
	public static void main(String args[]){
		int b = 0;
		FileInputStream in = null;
		try{
			in = new FileInputStream("E:\\MyJAVA\\TEST\\src\\IO\\TestFileInputStream.java");//�������ⶼ��ֻ���д�ĳ�����ԡ�
		} catch(FileNotFoundException e){
			System.out.println("cannot find the selected file.");
			System.exit(-1);
		}
		
		try{
			long num = 0;
			while((b=in.read())!=-1){
				System.out.print((char)b);//�����ӡ���������Ĵ���
				num++;//�������˶��ٸ����ַ�
			}
			in.close();
			System.out.println();
			System.out.println("read "+num+" characters in total.");
		}catch(IOException e1){
			System.out.println("error in reading the file.");
			System.exit(-1);//0��ʾ�����˳���������������ʾ�����˳�������Ϊ�����š�SystemΪjavaһ���ࡣSystem��exit()������ʾ��ֹ�����ֹͣ����
		}
	}
}
