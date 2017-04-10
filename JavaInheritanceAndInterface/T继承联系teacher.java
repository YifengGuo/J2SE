package TestInherit;
class Person{
	private String name;
	private int age;
	Person(String name){
		this.name = name;
		age = 45;
	}
	Person(String name,int age){
		this.name = name;
		this.age = age;
	}
	public String info(){
		return "Name:"+name+"\nAge:"+age;
	}
}
class Teacher extends Person{
	private String title;
	Teacher(String name,int age,String title){
		super(name,age);
		this.title = title;
	}
	public String info(){
		return super.info()+"\nTitle:"+title;
	}
}
class T¼Ì³ÐÁªÏµteacher {
	public static void main(String args[]){
		int a=5,b=2;
		Person p1 = new Person("John");
		Person p2 = new Person("Tom",32);
		Teacher t1 = new Teacher("Kelvin",61,"Professor");
		System.out.println(p1.info());
		System.out.println(p2.info());
		System.out.println(t1.info());
		System.out.println(a/b);
	}
}
