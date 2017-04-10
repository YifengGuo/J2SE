package Array;

public class T数三退一2 {
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
		Kid k = new Kid();//k表示最后一个添加的新的小孩。
		k.id = count;
		if(count<=0){//圈里一个小孩都没有的时候，k就是唯一一个，即第一个，最后一个小孩都是他，他的左边是他自己，他的右边也是他自己。
			first = k;
			last = k;
			k.left = k;
			k.right = k;
		}
		else{
			last.right = k;//加了若干个小孩进来之后，最后一个小孩的右手牵的是第一个小孩
			k.left = last;
			k.right = first;
			first.left = k;
			last = k;//表述完后，最有一个小孩的设为k
			
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