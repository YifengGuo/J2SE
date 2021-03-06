package socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.ArrayList;

public class Homework_6_Client {
	public static void main(String[] args) {
		if (args.length != 2) { // Test for correct num. of arguments
			System.err.println("ERROR server host name AND port number not given");
			System.exit(1);
		}
		int port_num = Integer.parseInt(args[1]);
		try {
			Socket c_sock = new Socket(args[0], port_num);
			BufferedReader in = new BufferedReader(new InputStreamReader(c_sock.getInputStream()));
			PrintWriter out = new PrintWriter(new OutputStreamWriter(c_sock.getOutputStream()), true);
			BufferedReader userEntry = new BufferedReader(new InputStreamReader(System.in));
			System.out.print("User, enter your message: ");
			out.println(userEntry.readLine());
			//System.out.println("Server says: " + in.readLine());
			String server_msg = "";
			ArrayList<String> arr = new ArrayList<>();
			while((server_msg = in.readLine()) != null) {
				arr.add(server_msg);
//				System.out.println("Server says: " + in.readLine());
			}
			for(int i = 0; i < arr.size(); i++) {
				System.out.println(arr.get(i));
			}
			c_sock.close();
		} catch (IOException ex) {
			ex.printStackTrace();
		}
		System.exit(0);
	}
}
