package IO;
import java.io.*;
public class TestDataStream {
	public static void main(String args[]){
		ByteArrayOutputStream baos = new ByteArrayOutputStream();//�������ڴ��з�����һ���ֽ�����;Ȼ��һ��baos�ܵ����ϡ�
		DataOutputStream dos = new DataOutputStream(baos);//dos����baos�ϡ�
		try{
			dos.writeDouble(Math.random());//д��double���ͣ���һ��8�ֽڵ���ͨ��dos->daos->bytearray(�ַ�������Ĭ�ϴ�С).
			dos.writeBoolean(true);//boolean���ڴ���ռ1-byte,����DataArray�б�д��9bytes�����ݡ�
			ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());//.toByteArray()����һ������,����������baos�׵������ϡ�
			System.out.println(bais.available());//�ж��ٸ�byte�����ڶ���
			DataInputStream dis = new DataInputStream(bais);//����DataInputStream��ʵ�ֶ��ֽڶ�ȡ
			System.out.println(dis.readDouble());//��д��һ��Ҫ�ȶ�(FIFO)
			System.out.println(dis.readBoolean());
			dos.close();
			dis.close();
		}catch(IOException e){
			e.printStackTrace();
		}
	}

}
