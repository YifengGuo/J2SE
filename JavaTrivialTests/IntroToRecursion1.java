
public class IntroToRecursion1 {
	public static void main(String args[]){
		System.out.println(method(5));
	}
		public static int method(int i){
			if(i==1)
				return 1;
			
			else return i*method(i-1);
		}
}
