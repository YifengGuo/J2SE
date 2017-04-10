
public class TestOverload {
	void max(int a,int b){
		System.out.println(a > b ? a : b);
	}
	
	void max(float a,float b){//直接调用函数max，此为函数的重载（overlord）；参数不一样。编译器可以区分开就构成重载
		System.out.println(a > b ? a : b);
	}
	
	public static void main(String args[]){
		TestOverload t1 = new TestOverload();
		t1.max(7, 9);
		
	}

}
