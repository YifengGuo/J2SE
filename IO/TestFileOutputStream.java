package IO;
import java.io.*;
public class TestFileOutputStream {
	public static void main(String aegs[]){
		int b = 0;
		FileInputStream in = null;
		FileOutputStream out = null;
		try{
			in = new FileInputStream("");//��������ݣ�
			out = new FileOutputStream("");//���ڴ������ݣ����û�и��ļ����Զ��½�һ����
			while((b=in.read())!=-1){
				out.write(b);//�൱�ڽ�in�ļ��е��ֽ�һ��һ����������д��out�ļ��С����ڽ�in�ļ����ݸ��Ƶ���out�ļ���
			}
			in.close();
			out.close();//�رչܵ���
		}catch (FileNotFoundException e2){
			System.out.print("cannot find file.");System.exit(-1);
		}catch (IOException e1){
			System.out.print("error in file copy");System.exit(-1);
		}
		System.out.print("File has been copied");
	}
}
