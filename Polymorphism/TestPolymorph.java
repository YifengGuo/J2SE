package T对象转型22;

abstract class Animal{
	private String name;
	Animal(String name){
		this.name = name;
	}
	
	/*public void enjoy(){
		System.out.println("叫声.......");//实际声明enjoy方法
	}*/
	public abstract void enjoy();//抽象声明有一个enjoy方法，具体重写由子类自己实现，此时，class需加上abstract ，表明为抽象类;
}

class Cat extends Animal{
	private String eyesColor;
	Cat(String n,String c){
		super(n);
		eyesColor = c;
	}
	public void enjoy(){
		System.out.println("猫叫声......");
	}
}
class Dog extends Animal{
	private String furColor;
	Dog(String n,String c){
		super(n);
		furColor = c;
	}
	public void enjoy(){
		System.out.println("狗叫声......");
	}
}

class Bird extends Animal{
	Bird(){
		super("bird");
	}
	public void enjoy(){
		System.out.println("鸟叫声......");
	}
}

class Lady{
	private String name;
	private Animal pet;
	Lady(String name,Animal pet){
		this.name = name;
		this.pet = pet;
	}
	public void myPetEnjoy(){
		pet.enjoy();//Animal没有调用子类的变量，而是调用子类方法，即可完全访问对象。
	}
}
public class TestPolymorph {
	public static void main(String args[]){
		Cat c = new Cat("catname","blue");
		Dog d = new Dog("dogname","black");
		Bird b = new Bird();
		Lady l1 = new Lady("l1",c);
		Lady l2 = new Lady("l2",d);
		Lady l3 = new Lady("l3",b);
		l1.myPetEnjoy();
		l2.myPetEnjoy();
		l3.myPetEnjoy();
	}
}