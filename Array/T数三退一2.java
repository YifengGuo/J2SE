package Array;

public class T������һ2 {
	public static void main(String args[]){
		KidCircle kc = new KidCircle(500);
	    int countNum = 0;
	    Kid k = kc.first;
	    while(kc.count>1){
	    	countNum++;
	    	if(countNum==3){
	    		countNum = 0;
	    		kc.delete(k);
	    	}
	    	k = k.right;
	    }
	    System.out.println(kc.last.id);
	}
}




class Kid{
	int id;
	Kid left;
	Kid right;
}

class KidCircle{
	int count = 0;
	Kid first;
	Kid last;
	
	KidCircle(int n){
		for(int i = 0;i<n;i++){
			add();
		}
	}
	
	void add(){
		Kid k = new Kid();//k��ʾ���һ����ӵ��µ�С����
		k.id = count;
		if(count<=0){//Ȧ��һ��С����û�е�ʱ��k����Ψһһ��������һ�������һ��С����������������������Լ��������ұ�Ҳ�����Լ���
			first = k;
			last = k;
			k.left = k;
			k.right = k;
		}
		else{
			last.right = k;//�������ɸ�С������֮�����һ��С��������ǣ���ǵ�һ��С��
			k.left = last;
			k.right = first;
			first.left = k;
			last = k;//�����������һ��С������Ϊk
			
		}
		count++;
	}
	void delete(Kid k){
		if(count<=0){
			return;
		}
		else if(count==1){
			first = last = null;
		}
		else{
			k.left.right = k.right;
			k.right.left = k.left;
			
			if(k==first){
				first = k.right;
			}
			else if(k==last){
				last = k.left;
			}
		}
		count--;
	}
	
}