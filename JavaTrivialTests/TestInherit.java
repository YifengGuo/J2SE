class Fatherclass{
	public int value;
	public void f(){
		value = 100;
		System.out.println("Fatherclass.value:"+value);
	}
}

class Childclass extends Fatherclass{
	public int value;
	public void f(){//Overwrite the function f;
		super.f();//先调用可以用的父类的某个方法，之后再进行需要的修改。
		value = 200;
		System.out.println("Childclass.value:"+value);
		System.out.println(value);
		System.out.println(super.value);
	}
}
public class TestInherit {
	public static void main(String ags[]){
		Childclass cc = new Childclass();
		cc.f();
	}

}
