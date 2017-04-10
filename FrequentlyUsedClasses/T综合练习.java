package FrequentlyUsedClasses;
//编写一个方法，返回一个double类型的二维数组，数组中的元素通过解析字符串参数获得。“1,2；3,4,5,6,7,8；”对应
//d[0,0] = 1.0 d[0,1】 = 2.0等等
public class T综合练习 {
	public static void main(String args[]){
		
		double[][] d;
		
		String s = "1,2;3,4,5;6,7,8";//首先将s利用；分割
		String sFirst[] = s.split(";");//数组第一维
		
		d = new double[sFirst.length][];
		for(int i = 0;i<sFirst.length;i++){
			String sSecond[] = sFirst[i].split(",");//数组第二维
			d[i] = new double[sSecond.length];
			for(int j = 0;j<sSecond.length;j++){
				d[i][j] = Double.parseDouble(sSecond[j]);
			}
			
		}
		for(int i=0;i<d.length;i++){
			for(int j=0;j<d[i].length;j++){
				System.out.println(d[i][j]+" ");
			}
			System.out.println();
		}
	}
}
