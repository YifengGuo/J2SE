package TestInterface2;

interface Valuable{
	public double getMoney();
}

interface Protectable{
	public void beProtected();
}

interface A extends Protectable{
	void m();
}

abstract class Animal{//类是抽象类，方法是抽象方法，靠子类自己实现
	private String name;
	
	abstract void enjoy();
}

class GoldenMonkey extends Animal implements Valuable,Protectable{
	public double getMoney(){
		return 10000;
	}
	
	public void beProtected(){
		System.out.println("live in the room");
	}
	
	public void enjoy(){
		System.out.println("wagggggh!");
	}
	public void test(){
		Valuable v = new GoldenMonkey();
		v.getMoney();
		Protectable p = (Protectable)v;
		p.beProtected();
	}
}

class Hen implements A{
	public void m(){}
	public void beProtected(){}
}
public class TestInterfaceValuable {
	public static void main(String args[]){
		
	}
}
