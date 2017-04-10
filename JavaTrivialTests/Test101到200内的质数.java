
public class Test101到200内的质数 {
	public static void main(String args[]){
		
		for(int i=101;i<=200;i++){
			boolean f = true;//将f为真时表示该数是质数
			for(int j=2;j<i;j++){	
				if(i%j==0){
					f = false;
					break;
				}	
			}	
			if(!f) continue;//如果i不是质数，则继续下一个i++循环。
			else	System.out.println("i="+i);
		}
	}
}
