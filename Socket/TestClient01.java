package socket;
import java.io.*;
import java.net.*;
public class TestClient01 {
	public static void main(String[] args){
		try{
		Socket s1 = new Socket("127.0.0.1",8888);
		InputStream is = s1.getInputStream();
		DataInputStream dis = new DataInputStream(is);
		System.out.println(dis.readUTF());
		dis.close();
		s1.close();
		}catch(IOException e1){e1.printStackTrace();
		}//catch(ConnectException e2){e2.printStackTrace();System.out.println("error in connecting with server!");
		//}
	}
}