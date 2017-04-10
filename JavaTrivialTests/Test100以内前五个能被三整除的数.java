
public class Test100以内前五个能被三整除的数 {
	public static void main(String args[]){
		int x = 3;
		int count = 1;
		for(int i=1;i<=100;i++){
			if(i%x==0&&count<=5)
			{
				count++;
				System.out.println("i="+i);
			}
		}
		
	}
}
