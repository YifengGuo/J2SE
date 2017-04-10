package TestInterface;
interface Singer{
	public void sing();
	public void sleep();
}
interface Painter{
	public void paint();
	public void eat();
}

class Student implements Singer{
	private String name;
	Student(String name){
		this.name = name;
	}
	public String getName(){
		return name;
	}
	public void study(){System.out.println("Student is studying.");}
	public void sing(){System.out.println("Student is singing.");}
	public void sleep(){System.out.println("Student is sleeping");}

}

class Teacher implements Singer,Painter{
	private String name;
	Teacher(String name){
		this.name = name;
	}
	public String getString(){
		return name;
	}
	public void teach(){System.out.println("Teather is teaching.");}
	public void sing(){System.out.println("Teather is singing.");}
	public void sleep(){System.out.println("Teather is sleeping.");}
	public void paint(){System.out.println("Teather is painting.");}
	public void eat(){System.out.println("Teather is eating.");}
	
}
public class TestInterface {
	public static void main(String args[]){
		Singer s1 = new Student("le");//����һ���ӿ����ͱ�����ֻ���õ�sing�ķ���
		s1.sing();
		s1.sleep();
		Singer s2 = new Teacher("steven");//s2Ҳֻ�ܿ���singer����
		s2.sing();
		s2.sleep();
		Painter p1 = (Painter)s2;//��s2ǿ��ת��Ϊpainter�࣬����ʹ��painter�ķ�����ͬʱ����ָ��teacher s2.   p1Ҳֻ�ܿ���painter�еķ�����
		p1.paint();
		p1.eat();
	}
}
