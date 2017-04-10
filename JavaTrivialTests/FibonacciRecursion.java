
public class FibonacciRecursion {
	public static void main(String args[]){
		System.out.println(fibonacci(40));
		
	}
	
	public static long fibonacci(int n){
		if(n<1)
			{System.out.println("invalid parameter!");
			return -1;
			}
		if(n==1||n==2)
			return 1;
		else 
			return fibonacci(n-1)+fibonacci(n-2);
		
	}
}
