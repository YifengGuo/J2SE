package socket;
import java.io.*;
import java.net.*;
public class TestSockClient {
	public static void main(String[] args){
		InputStream is = null;
		OutputStream os = null;
		try{
			Socket socket = new Socket("localhost",5888);
			is = socket.getInputStream();
			os = socket.getOutputStream();
			DataInputStream dis = new DataInputStream(is);
			DataOutputStream dos = new DataOutputStream(os);
			dos.writeUTF("Hey!");
			String s = null;
			if((s=dis.readUTF())!=null){
				System.out.println(s);
			}
			dos.close();
			dis.close();
			socket.close();
		}catch(IOException e){
			e.printStackTrace();
		}
	}
}
