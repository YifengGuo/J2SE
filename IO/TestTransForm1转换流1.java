package IO;
import java.io.*;
public class TestTransForm1ת����1 {
	public static void main(String args[]){
		try{
			OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("E:\\MyJAVA\\TEST\\src\\IO\\transForm.txt"));
			osw.write("ABCDEFGHIJKLMNOPQRSTUVWXYZ");
			System.out.println(osw.getEncoding());//getEncoding()�Ƿ�����ָ������ҳ��ʶ�������ı��룻
			osw.close();//GBK�Ǻ��ֱ����׼֮һ�����ꣻ��Ϊʲô���ص���GBK��
			osw = new OutputStreamWriter(new FileOutputStream("E:\\MyJAVA\\TEST\\src\\IO\\transForm.txt",true),"ISO8859_1");
			//ISO8859������ŷ���Եı���
			//true��ʾ�����ļ����ݺ��������ӵ�����;���û��true������ԭ�ļ����ǵ�����д���ݡ�
			osw.write("ABCDEFGHIJKLMNOPQRSTUVWXYZ");
			System.out.println(osw.getEncoding());
			osw.close();
		}catch(IOException e1){
			e1.printStackTrace();
		}
	}
}
