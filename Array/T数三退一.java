package Array;

public class T������һ {
	public static void main(String args[]){
		boolean arr[] = new boolean[500];
		for(int i=0;i<arr.length;i++){
			arr[i] = true;
		}
		
		int leftCount = arr.length;//Ȧ�ﻹʣ�µ��˵ĸ�����
		int countNum = 0;//ÿ���俴��һ���ˣ����1��
		int index = 0;//�˵ı��
		
		
		while(leftCount>1){//ֻҪȦ�ﻹ��һ�������ϣ���һֱ������
			if(arr[index]==true){//�˻���Ȧ��
				countNum++;
				if(countNum==3){
					countNum=0;//���������㡣
					arr[index]=false;//��һ�˳�Ȧ
					leftCount--;//ʣ�µ�������һ��
				}
			}
			index++;
			
			if(index==arr.length){
				index=0;//����Ѿ��������һ���ˣ���������ȥ�����ִӵ�һ����ʼ����
			}
		}
		for(int i=0;i<arr.length;i++){
			if(arr[i]==true){
				System.out.println(i);
			}
		}
	}
}
