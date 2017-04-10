package Array;
//快速排序
public class NumSort {
	public static void main(String args[]){
		int a[] = new int[args.length];
		for(int i=0;i<args.length;i++){
			a[i] = Integer.parseInt(args[i]);
		}
		print(a);
		System.out.println();
		selectionSort(a);
		print(a);
	}
	private static void print(int a[]){
		for(int i=0;i<a.length;i++){
			System.out.print(a[i] + " ");
		}
	}
	private static void selectionSort(int a[]){
		int k,temp;
		for(int i=0;i<a.length;i++){
			k = i;//假设k为最小数且正好等于i；
			for(int j=k+1;j<a.length;j++){
				if(a[k]>a[j]){
					k = j;
				}
			}
			if(k != i){
				temp = a[i];
				a[i] = a[k];
				a[k] = temp;
			}
		}
	}
}
