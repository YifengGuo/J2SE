package IO;
import java.io.*;
public class TestFileOutputStream {
	public static void main(String aegs[]){
		int b = 0;
		FileInputStream in = null;
		FileOutputStream out = null;
		try{
			in = new FileInputStream("");//往外读数据；
			out = new FileOutputStream("");//往内传输数据；如果没有该文件，自动新建一个。
			while((b=in.read())!=-1){
				out.write(b);//相当于将in文件中的字节一个一个读出来再写再out文件中。等于将in文件内容复制到了out文件中
			}
			in.close();
			out.close();//关闭管道。
		}catch (FileNotFoundException e2){
			System.out.print("cannot find file.");System.exit(-1);
		}catch (IOException e1){
			System.out.print("error in file copy");System.exit(-1);
		}
		System.out.print("File has been copied");
	}
}
