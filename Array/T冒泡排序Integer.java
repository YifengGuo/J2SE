package Array;

public class T√∞≈›≈≈–ÚInteger {
	public static void main(String args[]){
		int a[] = {2,4,7,23,5,1,6,45,87,435,3};
		
		bubbleSort(a);
		for(int i = 0;i<a.length;i++){
			System.out.println(a[i]+" ");
		}
	}
	public static void bubbleSort(int a[]){
		int len = a.length;
		for(int i = len-1;i>0;i--){
			for(int j = 0;j<i;j++){
				if(a[j]>a[j+1]){
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}
		}
	}
		
}