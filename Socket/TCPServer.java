package socket;
import java.net.*;
import java.io.*;
public class TCPServer {
	public static void main(String[] args) throws Exception{
		ServerSocket ss = new ServerSocket(6666);//����ʽ�ģ���client��һֱ�ȴ��ͻ�������;Ӧ��ʼ��port number;
		while(true){
		Socket s = ss.accept();
		DataInputStream dis = new DataInputStream(s.getInputStream());
		System.out.println(dis.readUTF());//readUTF()Ҳ������ʽ���ȴ�write();
		dis.close();
		s.close();
		System.out.println("A client connected!");
		}
	}
}
