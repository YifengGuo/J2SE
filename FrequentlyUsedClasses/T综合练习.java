package FrequentlyUsedClasses;
//��дһ������������һ��double���͵Ķ�ά���飬�����е�Ԫ��ͨ�������ַ���������á���1,2��3,4,5,6,7,8������Ӧ
//d[0,0] = 1.0 d[0,1�� = 2.0�ȵ�
public class T�ۺ���ϰ {
	public static void main(String args[]){
		
		double[][] d;
		
		String s = "1,2;3,4,5;6,7,8";//���Ƚ�s���ã��ָ�
		String sFirst[] = s.split(";");//�����һά
		
		d = new double[sFirst.length][];
		for(int i = 0;i<sFirst.length;i++){
			String sSecond[] = sFirst[i].split(",");//����ڶ�ά
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
