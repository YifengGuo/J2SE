package FrequentlyUsedClasses;

import java.io.*;

public class T�ݹ鷨�����ļ��� {
	public static void main(String args[]){
		File f = new File("E:/MyJava/A");
		System.out.println(f.getName());
		tree(f,1);
	}
	
	private static void tree(File f,int level){//����ݹ���ҵķ���,level��ʾ�ڼ����ļ���
		
		String preStr = "";
		for(int i = 0;i<level;i++){
			preStr+="����������";
		}
		
		File childs[] = f.listFiles();
		for(int i=0;i<childs.length;i++){
			System.out.println(preStr+childs[i].getName());
			if(childs[i].isDirectory())//��ʾ���child��i����ʾһ��Ŀ¼���򷵻�true��һֱִ�е�����û����Ŀ¼
				tree(childs[i],level+1);
		}
	}
}
