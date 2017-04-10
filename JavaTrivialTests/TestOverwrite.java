class Person{
	private String name;
	private int age;
	public void setName(String name){
		this.name = name;
	}
	public void setAge(int age){
		this.age = age;
	}
	public String getName(){
		return name;
	}
	public int getAge(){
		return age;
	}
	public String getInfo(){
		return "Name:"+name+"\nAge:"+age;
	}
}

class Student extends Person{
	private String school;
	public String getSchool(){
		return school;
	}
	public void setSchool(String school){
		this.school = school;
	}
	public String getInfo(){
		return "Name:"+getName()+"\nAge:"+getAge()+"\nSchool:"+getSchool();
	}
	
	
}
public class TestOverwrite {
	public static void main(String args[]){
		Person person = new Person();
		Student student = new Student();
		person.setName("none");
		person.setAge(1000);
		student.setName("John");
		student.setAge(18);
		student.setSchool("SCH");
		System.out.println(person.getInfo());
		System.out.println(student.getInfo());
		
	}
}
