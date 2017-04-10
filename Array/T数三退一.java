package Array;

public class T数三退一 {
	public static void main(String args[]){
		boolean arr[] = new boolean[500];
		for(int i=0;i<arr.length;i++){
			arr[i] = true;
		}
		
		int leftCount = arr.length;//圈里还剩下的人的个数；
		int countNum = 0;//每当其看到一个人，便加1；
		int index = 0;//人的编号
		
		
		while(leftCount>1){//只要圈里还有一个人以上，就一直数数。
			if(arr[index]==true){//人还在圈内
				countNum++;
				if(countNum==3){
					countNum=0;//数的数归零。
					arr[index]=false;//有一人出圈
					leftCount--;//剩下的人数减一。
				}
			}
			index++;
			
			if(index==arr.length){
				index=0;//如果已经数到最后一个人，继续数下去必须又从第一个开始数。
			}
		}
		for(int i=0;i<arr.length;i++){
			if(arr[i]==true){
				System.out.println(i);
			}
		}
	}
}
