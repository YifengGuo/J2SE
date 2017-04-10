package FrequentlyUsedClasses;

import java.io.*;

public class T递归法查找文件树 {
	public static void main(String args[]){
		File f = new File("E:/MyJava/A");
		System.out.println(f.getName());
		tree(f,1);
	}
	
	private static void tree(File f,int level){//构造递归查找的方法,level表示第几层文件夹
		
		String preStr = "";
		for(int i = 0;i<level;i++){
			preStr+="————》";
		}
		
		File childs[] = f.listFiles();
		for(int i=0;i<childs.length;i++){
			System.out.println(preStr+childs[i].getName());
			if(childs[i].isDirectory())//表示如果child【i】表示一个目录，则返回true，一直执行到里面没有子目录
				tree(childs[i],level+1);
		}
	}
}
