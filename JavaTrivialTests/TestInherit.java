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
		super.f();//�ȵ��ÿ����õĸ����ĳ��������֮���ٽ�����Ҫ���޸ġ�
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
