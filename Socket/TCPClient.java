package socket;
import java.io.DataOutputStream;
import java.io.OutputStream;
import java.net.*;
public class TCPClient {
	public static void main(String[] args) throws Exception{
		Socket s = new Socket("127.0.0.1",6666);
		OutputStream os = s.getOutputStream();
		DataOutputStream dos = new DataOutputStream(os);
		dos.writeUTF("Hello server!");
		dos.flush();
		dos.close();
		s.close();
	}
}
