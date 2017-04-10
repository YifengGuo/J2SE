package FrequentlyUsedClasses;

import java.io.File;
import java.io.IOException;

public class TestFile {
	public static void main(String args[]){
		String separator = File.separator;
		String filename = "myfile.txt";
		String directory = "mydir1"+separator+"mydir2";//��������б�ܡ�/������separator���������÷�б�ܣ�һ��java�ڷ�б����ת���ַ�������Linux��ʶ��б�ܡ�
		
		File f = new File(directory,filename);
		
		if(f.exists()){
			System.out.println("�ļ�����"+f.getAbsolutePath());//��·��������package��package+classʵ������������
			System.out.println("�ļ���С��"+f.length());
		}
		else{
			f.getParentFile().mkdirs();//ȡ�ø�·��Ȼ��make directories�� mkdirs��//�������ļ�
			try{
				f.createNewFile();
			}catch(IOException e){
				e.printStackTrace();
			}
			
		}
	}
}
