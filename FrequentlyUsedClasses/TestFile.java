package FrequentlyUsedClasses;

import java.io.File;
import java.io.IOException;

public class TestFile {
	public static void main(String args[]){
		String separator = File.separator;
		String filename = "myfile.txt";
		String directory = "mydir1"+separator+"mydir2";//或者用正斜杠“/”代替separator，绝不能用反斜杠，一是java内反斜杠是转义字符，而是Linux不识别反斜杠。
		
		File f = new File(directory,filename);
		
		if(f.exists()){
			System.out.println("文件名："+f.getAbsolutePath());//父路径不包括package，package+class实际是完整名字
			System.out.println("文件大小："+f.length());
		}
		else{
			f.getParentFile().mkdirs();//取得父路径然后make directories即 mkdirs；//创造新文件
			try{
				f.createNewFile();
			}catch(IOException e){
				e.printStackTrace();
			}
			
		}
	}
}
