package IO;
import java.io.*;		
public class TestBufferStream1 {
	public static void main(String args[]){
		try{
		FileInputStream fis = new FileInputStream("E:\\MyJAVA\\TEST\\src\\IO\\TestBufferStream1.java");
		BufferedInputStream bis = new BufferedInputStream(fis);
		int c = 0;
		System.out.println((char)bis.read());
		System.out.println((char)bis.read());
		bis.mark(100);//�ӵ�100����ʼ��
		for(int i = 0; i<=10 && (c=bis.read())!=-1;i++){
			System.out.print((char)c+" "); 
		}
		System.out.println();
		bis.reset();//�ص���100����λ��
		for(int i = 0;i<=10 && (c=bis.read())!=-1;i++){
			System.out.print((char)c+" ");
		}
		bis.close();
		}catch(IOException e1){
			e1.printStackTrace();//���ٵ���������λ�á�
		}
	}
}
