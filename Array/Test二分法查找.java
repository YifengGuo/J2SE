package Array;

public class Test���ַ����� {
	public static void main(String args[]){
		int a[] = {1,2,5,7,9,11,14,16,18,23,25,31,35,37,42,61};
		int i = 14;
		System.out.println(binarySearch(a,i));
	}


	/*public static int search(int a[],int num){
		for(int i = 0;i<a.length;i++){
			if(a[i]==num) return i;
		}
		return -1;
	}*/
	
	
	
	public static int binarySearch(int a[],int num){
		if(a.length==0) return -1;
		
		int StartPos = 0;//��ʼλ��
		int EndPos = a.length-1;//��ֹλ��
		int m = (StartPos + EndPos)/2;//�м�λ��
		while(StartPos<=EndPos){
			if(num==a[m]) return m;
			if(num<a[m]){
				EndPos = m-1;
			}
			if(num>a[m]){
				StartPos = m+1;
			}
			m = (StartPos+EndPos)/2;
		}
		return -1;
	}
}