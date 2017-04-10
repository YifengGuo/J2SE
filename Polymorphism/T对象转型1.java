package T对象转型;
class Animal{
	public String name;
	Animal(String name){
		this.name = name;
	}
}	
class Cat extends Animal{
	public String eyesColor;
	Cat(String n,String c){
		super(n);
		eyesColor = c;
	}
}
class Dog extends Animal{
	public String furColor;
	Dog(String n,String c){
		super(n);
		furColor = c;
	}
}
public class T对象转型1 {
	public static void main(String args[]){
		Animal a = new Animal("name");
		Cat c = new Cat("catname","blue");
		Dog d = new Dog("dogname","black");
		
		System.out.println(a instanceof Animal);
		System.out.println(c instanceof Animal);
		System.out.println(d instanceof Animal);
		System.out.println(a instanceof Cat);

		a = new Dog("bigyellow","yellow");//a是父类animal的引用，指向子类dog
		System.out.println(a.name);
		//System.out.println(a.furColor);//父类对象指向子类只看到作为父类的方法和变量，即只知道name而不知道毛颜色这个子类独有的成员变量。
		System.out.println(a instanceof Animal);//表明a实际上也是一只狗，但是不能直接访问其子类属性
		System.out.println(a instanceof Dog);
		
		Dog d1 = (Dog)a;//把a强制转换成dog类后就可以访问其子类成员变量了
		System.out.println(d1.furColor);

	}
}