package FrequentlyUsedClasses;

public class TestEnum {
	public enum MyColor{red,blue,green}//新定义一个枚举类型叫MyColor，用这种类型定义变量的时候只能去其中已有的值
	
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
