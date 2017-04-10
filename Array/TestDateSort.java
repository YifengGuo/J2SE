package Array;
//ð������
public class TestDateSort {
	public static void main(String args[]){
		Date days[] = new Date[5];//��������;
		days[0] = new Date(2016,5,8);
		days[1] = new Date(2013,6,17);
		days[2] = new Date(2014,5,13);
		days[3] = new Date(2009,9,4);
		days[4] = new Date(2006,2,22);
		 
		Date d = new Date(2013,6,17);
		
		bubbleSort(days);
		/*selectionSort(days);*///ѡ������
		
		for(int i = 0;i<days.length;i++){
			System.out.println(days[i]);//ֱ�Ӵ�ӡһ�����������ʱ�򣬴�ӡ�������ǵ�ַ��������Ҫ��дtoString������
		}
		
		System.out.println(binarySearch(days,d));
	}
	
	public static Date[] bubbleSort(Date a[]){//ð������;����ڵײ���С��ð����ȥ��
		int len = a.length;
		for(int i = len-1;i>=1;i--){//���ѭ������������Ҫ�������ٱ�������ܽ�������������ɡ���һ�α���ȷ��һ����ֵ���ڶ��α���ȷ������ֵ���Դ����ơ�n-1�κ�������ź����ˡ�5��Ԫ��4�α��������źá�
			for(int j = 0;j<=i-1;j++){//�ڲ�ѭ����������ȷ�����������򣨻�û�����Ԫ�أ�����ʼ����ֹλ�á�
				if(a[j].compare(a[j+1])>0){
					Date temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}
		}
		return a;
	}
	/*public static Date[] selectionSort(Date a[]){//ѡ������
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
	public static int binarySearch(Date days[],Date d){//���ַ���������Ԫ��λ�á�
		int startpos = 0;
		int endpos = days.length-1;
		int m = (startpos+endpos)/2;
		while(startpos<=endpos){
			if(d.compare(days[m])==0) return m;//������==����Ϊ�����Ƚϵ������ã���Զ����ȣ��������compare�������Ƚ����������յ����֡�
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

