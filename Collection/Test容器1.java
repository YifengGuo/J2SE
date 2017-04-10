package Collection;

import java.util.*;
class Name implements Comparable{//构造函数与类同名且无返回值
	String firstname,lastname;
	public Name(String firstname,String lastname){
		this.firstname = firstname;
		this.lastname = lastname;
	}
	public String getFirstName(){return firstname;}
	public String getLastName(){return lastname;}
	public String toString(){//toString()是将对象转换为string类型。如果执行打印Name类型的对象则会打印出相应的字符串。
		return firstname+" "+lastname;
	}
//两个对象如果相等，则其hash codes也要相等，所以重写equals方法时，也要重写hashCode();
	public boolean equals(Object obj){
		if(obj instanceof Name){//如果obj是一个Name对象
			Name name = (Name)obj;
			return (firstname.equals(name.firstname))&&(lastname.equals(name.lastname));
		}
		else return super.equals(obj);//如果obj不是Name对象，则交给父类处理
	}
	public int hashCode(){
		return firstname.hashCode();//调用hashCode方法能便于寻找对象，效率较高。
		
	}
	public int compareTo(Object o){//名字的排序方式
		Name n = (Name)o;
		int lastCmp = lastname.compareTo(n.lastname);
		return 
				(lastCmp!=0 ? lastCmp ://为0则一致，不等于0则直接返回lastname，为0则再比较firstname;
				 firstname.compareTo(n.firstname)); 
	}
}
public class Test容器1 {
	public static void main(String args[]){
		Collection c = new ArrayList();//父类引用指向子类对象；方便修改放入其中的对象类型。可放入不同类型的对象。
		c.add("Hello");
		c.add(new Name("f1","f2"));
		c.add(new Integer(100));
		c.remove("Hello");//会将Hello去掉，内部执行了equals方法，找到与Hello相等的对象即被去除。
		System.out.println(c.remove(new Name("f1","f2")));//这两个对象不equals，所以不会被去除，则返回false。除非改写equals方法，否则两个对象永远不想等。
		System.out.println(c.size());//只能往里添加对象（object），不能添加基础的数据类型。
		System.out.println(c);
		System.out.println(c.hashCode());
				
	}
	
}

