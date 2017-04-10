package Collection;

import java.util.*;

public class TestIterator {
	public static void main(String args[]){
		Collection c = new HashSet();//父类引用指向子类对象！！！！
		/*
	 	c.add(new Name("f1","l1"));//遍历
		c.add(new Name("f2","l2"));
		c.add(new Name("f3","l3"));
		Iterator i = c.iterator();
		while(i.hasNext()){
			Name n = (Name)i.next();
			System.out.println(n.getFirstName()+" ");
		}*/
		c.add(new Name("ffffff1","l1"));//remove方法的使用
		c.add(new Name("ff2","l1"));
		c.add(new Name("ffff3","l1"));
		c.add(new Name("f4","l1"));
		for(Iterator i = c.iterator();i.hasNext();){
			Name name = (Name)i.next();
			if(name.getFirstName().length()<3){
				i.remove();//如果用c.remove()则会抛exception,因为此处循环遍历中只能用iterator的remove方法（iterator遍历过程中对元素进行了锁定）。
			}
		}
		System.out.println(c);
	}
}
