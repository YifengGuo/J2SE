package FrequentlyUsedClasses;

public class TestEnum {
	public enum MyColor{red,blue,green}//�¶���һ��ö�����ͽ�MyColor�����������Ͷ��������ʱ��ֻ��ȥ�������е�ֵ
	
	public static void main(String args[]){
		MyColor m = MyColor.blue;
		switch(m){
		case red:
			System.out.println("red");
			break;
		case green:
			System.out.println("green");
			break;
		default:
			System.out.println("default");
		}
		System.out.println(m);
	}
}
