package IO;
import java.io.*;
public class TestTransForm2SystemIn {
	public static void main(String args[]){
		InputStreamReader isr = new InputStreamReader(System.in);//System.in�����ն���������(��������orͬ������)����������ȴ���
		BufferedReader br = new BufferedReader(isr);//Ϊ��ʹ��readLine()��bufferedreader����ת����InputStreamReader��;
		String s = null;
		try{
			s = br.readLine();//�ȶ�һ�С�
			while(s!=null){
				if(s.equalsIgnoreCase("exit")) break;//���Դ�Сд����exit���˳����봰�ڡ�
				System.out.println(s.toUpperCase());//���û���˳��򽫶������ַ���Ϊ��д��
				s = br.readLine();//����һ�С�
			}
			br.close();
		}catch(IOException e){
			e.printStackTrace();
		}
	}
}
