package Array;

public class TestArray {
	public static void main(String args[]){//args[]数组是存命令行参数的数组
		int a[] = {1,2,3,4,5,6,7,8,9};
		for(int i = 0;i<a.length;i++){
			System.out.print(a[i]+" ");
		}
		
		for(int i=0;i<args.length;i++){
			System.out.println(args[i]);
		}
	}
}
