package Collection;

import java.util.*;

public class TestIterator {
	public static void main(String args[]){
		Collection c = new HashSet();//��������ָ��������󣡣�����
		/*
	 	c.add(new Name("f1","l1"));//����
		c.add(new Name("f2","l2"));
		c.add(new Name("f3","l3"));
		Iterator i = c.iterator();
		while(i.hasNext()){
			Name n = (Name)i.next();
			System.out.println(n.getFirstName()+" ");
		}*/
		c.add(new Name("ffffff1","l1"));//remove������ʹ��
		c.add(new Name("ff2","l1"));
		c.add(new Name("ffff3","l1"));
		c.add(new Name("f4","l1"));
		for(Iterator i = c.iterator();i.hasNext();){
			Name name = (Name)i.next();
			if(name.getFirstName().length()<3){
				i.remove();//�����c.remove()�����exception,��Ϊ�˴�ѭ��������ֻ����iterator��remove������iterator���������ж�Ԫ�ؽ�������������
			}
		}
		System.out.println(c);
	}
}
