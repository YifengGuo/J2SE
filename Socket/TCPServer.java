package socket;
import java.net.*;
import java.io.*;
public class TCPServer {
	public static void main(String[] args) throws Exception{
		ServerSocket ss = new ServerSocket(6666);//阻塞式的，无client则一直等待客户端连接;应初始化port number;
		while(true){
		Socket s = ss.accept();
		DataInputStream dis = new DataInputStream(s.getInputStream());
		System.out.println(dis.readUTF());//readUTF()也是阻塞式。等待write();
		dis.close();
		s.close();
		System.out.println("A client connected!");
		}
	}
}
