package socket;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class Homework_6_Server {
	public static void main(String[] args) {
		if (args.length != 1) { // Test for correct num. of arguments
			System.err.println("ERROR server port number not given");
			System.exit(1);
		}
		int port_num = Integer.parseInt(args[0]);
		ServerSocket rv_sock = null;
		try {
			rv_sock = new ServerSocket(port_num);
		} catch (IOException ex) {
			ex.printStackTrace();
		}
		while (true) { // run forever, waiting for clients to connect
			System.out.println("\nWaiting for client to connect...");
			try {
				
				Socket s_sock = rv_sock.accept();//Initialize server socket
				BufferedReader in = new BufferedReader(new InputStreamReader(s_sock.getInputStream()));//obtain the input info from client
				PrintWriter out = new PrintWriter(new OutputStreamWriter(s_sock.getOutputStream()), true);//output the response to the console
				
				String path = "C:/Users/ÒÝ·ç/Desktop/Test.txt";
				BufferedReader br = new BufferedReader(new FileReader(path));
				String line = "";
				ArrayList<String> arr = new ArrayList<>();
				while((line = br.readLine()) != null) {
					arr.add(line);
				}
				String msg = in.readLine();
				
				/*BOUNCE Function */
				if(msg.trim().split(":")[0].equals("BOUNCE")){
					System.out.println("Client's message: " + msg.split(":")[1]);
				}
				
				/*GET Function*/
				if(msg.trim().equals("GET")) {
					
					out.println("I got your message.");
					out.flush();
					out.println("Here is the content of the Test.txt:");
					out.println("-------------------------------------");
					
					System.out.println("Here is the content of the Test.txt:");
					System.out.println("-------------------------------------");
					out.flush();
					for(int i = 0; i < arr.size(); i++) {
						out.flush();
						out.println(arr.get(i));
						System.out.println(arr.get(i));
					}
					out.println("-------------------------------------");
					System.out.println("-------------------------------------");
				}
				
				/* EXIT Code Function */
				if(msg.trim().split(":")[0].equals("EXIT")){
					System.out.println("EXIT CODE: " + msg.split(":")[1]);
				}
				
				/* Default EXIT Function */
				if(msg.trim().equals("exit")) {
					System.out.println("The server is normally exiting...");
					out.close();
					in.close();
					br.close();
					s_sock.close();
					return;
				}
				
				out.close();
				in.close();
				br.close();
				s_sock.close();
				//rv_sock.close();
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}
	}
}