
public class Test101��200�ڵ����� {
	public static void main(String args[]){
		
		for(int i=101;i<=200;i++){
			boolean f = true;//��fΪ��ʱ��ʾ����������
			for(int j=2;j<i;j++){	
				if(i%j==0){
					f = false;
					break;
				}	
			}	
			if(!f) continue;//���i�����������������һ��i++ѭ����
			else	System.out.println("i="+i);
		}
	}
}
