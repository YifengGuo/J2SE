package IO;
import java.io.*;
public class TestDataStream {
	public static void main(String args[]){
		ByteArrayOutputStream baos = new ByteArrayOutputStream();//首先在内存中分配了一个字节数组;然后一根baos管道插上。
		DataOutputStream dos = new DataOutputStream(baos);//dos套在baos上。
		try{
			dos.writeDouble(Math.random());//写的double类型，即一个8字节的数通过dos->daos->bytearray(字符数组有默认大小).
			dos.writeBoolean(true);//boolean在内存中占1-byte,所以DataArray中被写入9bytes的内容。
			ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());//.toByteArray()返回一个数组,即读套在了baos套的数组上。
			System.out.println(bais.available());//有多少个byte可用于读。
			DataInputStream dis = new DataInputStream(bais);//套上DataInputStream可实现多字节读取
			System.out.println(dis.readDouble());//先写的一定要先读(FIFO)
			System.out.println(dis.readBoolean());
			dos.close();
			dis.close();
		}catch(IOException e){
			e.printStackTrace();
		}
	}

}
