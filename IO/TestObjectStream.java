package IO;
import java.io.*;
import java.util.*;
public class TestObjectStream {
	public static void main(String args[]){
		T t = new T();
		t.k = 15;
		try{
		FileOutputStream fos = new FileOutputStream("E:\\MyJAVA\\TEST\\src\\IO\\TestObjectStream.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(t);//直接将t写入文件内。
		oos.flush();
		oos.close();
		
		
		FileInputStream fis = new FileInputStream("E:\\MyJAVA\\TEST\\src\\IO\\TestObjectStream.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		T tReaded = (T)ois.readObject();
		System.out.println(tReaded.i+" "+tReaded.j+" "+tReaded.k+" "+tReaded.d);
		}catch(FileNotFoundException e1){
			System.out.println("error:file cannot be found.");
		}catch(IOException e2){
			e2.printStackTrace();
		}catch(ClassNotFoundException e3){
			System.out.println("error:The class has not been found.");
		}
	}
}

class T implements Serializable{//标记此类对象可以序列化。
	int i = 8;
	int j = 10;
	int k = 12;
	double d = 2.3;
}