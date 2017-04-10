package IO;
import java.io.*;
public class TestTransForm1转换流1 {
	public static void main(String args[]){
		try{
			OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("E:\\MyJAVA\\TEST\\src\\IO\\transForm.txt"));
			osw.write("ABCDEFGHIJKLMNOPQRSTUVWXYZ");
			System.out.println(osw.getEncoding());//getEncoding()是返回与指定代码页标识符关联的编码；
			osw.close();//GBK是汉字编码标准之一；国标；即为什么返回的是GBK。
			osw = new OutputStreamWriter(new FileOutputStream("E:\\MyJAVA\\TEST\\src\\IO\\transForm.txt",true),"ISO8859_1");
			//ISO8859所有西欧语言的编码
			//true表示是在文件内容后面跟着添加的内容;如果没有true，则会把原文件覆盖掉重新写内容。
			osw.write("ABCDEFGHIJKLMNOPQRSTUVWXYZ");
			System.out.println(osw.getEncoding());
			osw.close();
		}catch(IOException e1){
			e1.printStackTrace();
		}
	}
}
