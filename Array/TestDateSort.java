package Array;
//冒泡排序
public class TestDateSort {
	public static void main(String args[]){
		Date days[] = new Date[5];//数组声明;
		days[0] = new Date(2016,5,8);
		days[1] = new Date(2013,6,17);
		days[2] = new Date(2014,5,13);
		days[3] = new Date(2009,9,4);
		days[4] = new Date(2006,2,22);
		 
		Date d = new Date(2013,6,17);
		
		bubbleSort(days);
		/*selectionSort(days);*///选择排序
		
		for(int i = 0;i<days.length;i++){
			System.out.println(days[i]);//直接打印一个对象的引用时候，打印出来的是地址，所以需要重写toString方法。
		}
		
		System.out.println(binarySearch(days,d));
	}
	
	public static Date[] bubbleSort(Date a[]){//冒泡排序;大的在底部，小的冒泡上去。
		int len = a.length;
		for(int i = len-1;i>=1;i--){//外层循环的意义是需要遍历多少遍数组才能将次数组排序完成。第一次遍历确定一个最值，第二次遍历确定次最值，以此类推。n-1次后数组就排好序了。5个元素4次遍历可以排好。
			for(int j = 0;j<=i-1;j++){//内层循环的意义是确定待排序区域（还没排序的元素）的起始和终止位置。
				if(a[j].compare(a[j+1])>0){
					Date temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}
		}
		return a;
	}
	/*public static Date[] selectionSort(Date a[]){//选择排序
		int k;
		Date temp;
		for(int i = 0;i<a.length;i++){
			k = i;
			for(int j = k+1;j<a.length;j++){
				if(a[k].compare(a[j])>0){
					k = j;
				}
			}
			if(k!=i){
				temp = a[k];
				a[k] = a[i];
				a[i] = temp;
			}
		}
		return a;
	}*/
	public static int binarySearch(Date days[],Date d){//二分法查找数组元素位置。
		int startpos = 0;
		int endpos = days.length-1;
		int m = (startpos+endpos)/2;
		while(startpos<=endpos){
			if(d.compare(days[m])==0) return m;//不能用==，因为这样比较的是引用，永远不相等，必须调用compare（），比较其中年月日的数字。
			if(d.compare(days[m])>0){
				startpos = m + 1;
			}
			if(d.compare(days[m])<0){
				endpos = m - 1;
			}
		}
		return -1;
	}
}
class Date{
	int year,month,day;
	Date(int y,int m,int d){
		year = y;
		month = m;
		day = d;
	}
	
public int compare(Date date){
	return year>date.year ? 1
	   : year < date.year ? -1
	   : month > date.month ? 1
	   : month < date.month ? -1
	   : day > date.day ? 1
	   : day < date.day ? -1 : 0;
	}
public String toString(){
		return "Year:Month:Day -- "+year+"-"+month+"-"+day;
	}
}

