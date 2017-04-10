package socket;
import java.net.*;
import java.io.*;
public class TestServer01 {
	public static void main(String[] args){
		try{
			ServerSocket s = new ServerSocket(8888);
			while(true){
				Socket s1 = s.accept();
				OutputStream os = s1.getOutputStream();
				DataOutputStream dos = new DataOutputStream(os);
				dos.writeUTF("Hello,"+s1.getInetAddress()+"port#"+s1.getPort()+"bye-bye!");//提取的client的IP和端口;
				dos.close();
				s1.close();
			}
			
			
		}catch(IOException e){
			e.printStackTrace();
			System.out.println("error in program:"+e);
		}
	}
}