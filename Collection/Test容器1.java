package Collection;

import java.util.*;
class Name implements Comparable{//���캯������ͬ�����޷���ֵ
	String firstname,lastname;
	public Name(String firstname,String lastname){
		this.firstname = firstname;
		this.lastname = lastname;
	}
	public String getFirstName(){return firstname;}
	public String getLastName(){return lastname;}
	public String toString(){//toString()�ǽ�����ת��Ϊstring���͡����ִ�д�ӡName���͵Ķ�������ӡ����Ӧ���ַ�����
		return firstname+" "+lastname;
	}
//�������������ȣ�����hash codesҲҪ��ȣ�������дequals����ʱ��ҲҪ��дhashCode();
	public boolean equals(Object obj){
		if(obj instanceof Name){//���obj��һ��Name����
			Name name = (Name)obj;
			return (firstname.equals(name.firstname))&&(lastname.equals(name.lastname));
		}
		else return super.equals(obj);//���obj����Name�����򽻸����ദ��
	}
	public int hashCode(){
		return firstname.hashCode();//����hashCode�����ܱ���Ѱ�Ҷ���Ч�ʽϸߡ�
		
	}
	public int compareTo(Object o){//���ֵ�����ʽ
		Name n = (Name)o;
		int lastCmp = lastname.compareTo(n.lastname);
		return 
				(lastCmp!=0 ? lastCmp ://Ϊ0��һ�£�������0��ֱ�ӷ���lastname��Ϊ0���ٱȽ�firstname;
				 firstname.compareTo(n.firstname)); 
	}
}
public class Test����1 {
	public static void main(String args[]){
		Collection c = new ArrayList();//��������ָ��������󣻷����޸ķ������еĶ������͡��ɷ��벻ͬ���͵Ķ���
		c.add("Hello");
		c.add(new Name("f1","f2"));
		c.add(new Integer(100));
		c.remove("Hello");//�ὫHelloȥ�����ڲ�ִ����equals�������ҵ���Hello��ȵĶ��󼴱�ȥ����
		System.out.println(c.remove(new Name("f1","f2")));//����������equals�����Բ��ᱻȥ�����򷵻�false�����Ǹ�дequals��������������������Զ����ȡ�
		System.out.println(c.size());//ֻ��������Ӷ���object����������ӻ������������͡�
		System.out.println(c);
		System.out.println(c.hashCode());
				
	}
	
}

