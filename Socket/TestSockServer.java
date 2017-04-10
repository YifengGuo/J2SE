package socket;
import java.io.*;
import java.net.*;
public class TestSockServer {
	public static void main(String[] args){
		InputStream in = null;
		OutputStream out = null;
		try{
			ServerSocket ss = new ServerSocket(5888);
			while(true){
			Socket socket = ss.accept();//����һ��client;
			in = socket.getInputStream();
			out = socket.getOutputStream();
			DataInputStream dis = new DataInputStream(in);
			DataOutputStream dos = new DataOutputStream(out);
			String s = null;
			if((s=dis.readUTF())!=null){
				System.out.println(s);
				System.out.println("from: "+socket.getInetAddress());//client��IP�Ͷ˿�;
				System.out.println("port: "+socket.getPort());
			}
			dos.writeUTF("hi there!");//server�����ȶ���д������client����Ҫ��д�����ٶ�;
			dos.close();
			dis.close();
			socket.close();
			}
		}catch(IOException e){e.printStackTrace();}
	}
}
