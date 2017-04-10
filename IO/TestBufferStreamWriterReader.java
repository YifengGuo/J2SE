package IO;
import java.io.*;		
public class TestBufferStreamWriterReader {
	public static void main(String args[]){
		try{
			BufferedWriter bw = new BufferedWriter(new FileWriter("E:\\MyJAVA\\TEST\\src\\IO\\bw.text"));
			BufferedReader br = new BufferedReader(new FileReader("E:\\MyJAVA\\TEST\\src\\IO\\bw.text"));
			String s = null;
			for(int i = 0;i<=10;i++){
				s = String.valueOf(Math.random());//因为是字符流，所以需要把随机数转换为String类型.
				bw.write(s);//打印10个随机数
				bw.newLine();//写一个数据换一行
			}
			bw.flush();
			while((s=br.readLine())!=null){//读一行数据，方法定义中返回的就是字符串类型，所以不用强制转换。
				System.out.println(s);
			}
			bw.close();
			br.close();
		}catch(IOException e1){
			e1.printStackTrace();
		}
	}
}
