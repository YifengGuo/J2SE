package T����ת��;
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
public class T����ת��1 {
	public static void main(String args[]){
		Animal a = new Animal("name");
		Cat c = new Cat("catname","blue");
		Dog d = new Dog("dogname","black");
		
		System.out.println(a instanceof Animal);
		System.out.println(c instanceof Animal);
		System.out.println(d instanceof Animal);
		System.out.println(a instanceof Cat);

		a = new Dog("bigyellow","yellow");//a�Ǹ���animal�����ã�ָ������dog
		System.out.println(a.name);
		//System.out.println(a.furColor);//�������ָ������ֻ������Ϊ����ķ����ͱ�������ֻ֪��name����֪��ë��ɫ���������еĳ�Ա������
		System.out.println(a instanceof Animal);//����aʵ����Ҳ��һֻ�������ǲ���ֱ�ӷ�������������
		System.out.println(a instanceof Dog);
		
		Dog d1 = (Dog)a;//��aǿ��ת����dog���Ϳ��Է����������Ա������
		System.out.println(d1.furColor);

	}
}