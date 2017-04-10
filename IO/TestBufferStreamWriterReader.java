package IO;
import java.io.*;		
public class TestBufferStreamWriterReader {
	public static void main(String args[]){
		try{
			BufferedWriter bw = new BufferedWriter(new FileWriter("E:\\MyJAVA\\TEST\\src\\IO\\bw.text"));
			BufferedReader br = new BufferedReader(new FileReader("E:\\MyJAVA\\TEST\\src\\IO\\bw.text"));
			String s = null;
			for(int i = 0;i<=10;i++){
				s = String.valueOf(Math.random());//��Ϊ���ַ�����������Ҫ�������ת��ΪString����.
				bw.write(s);//��ӡ10�������
				bw.newLine();//дһ�����ݻ�һ��
			}
			bw.flush();
			while((s=br.readLine())!=null){//��һ�����ݣ����������з��صľ����ַ������ͣ����Բ���ǿ��ת����
				System.out.println(s);
			}
			bw.close();
			br.close();
		}catch(IOException e1){
			e1.printStackTrace();
		}
	}
}
