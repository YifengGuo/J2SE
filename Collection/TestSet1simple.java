package Collection;
import java.util.*;
public class TestSet1simple {
	public static void main(String args[]){
		Set s1 = new HashSet();
		Set s2 = new HashSet();
		s1.add("a");s1.add("b");s1.add("c");
		s2.add("a");s2.add("b");s2.add("d");
		
		Set sn = new HashSet(s1);
		sn.retainAll(s2);//ȡ���������Ľ�����
		Set su = new HashSet(s1);
		su.addAll(s2);//��s2�е�itemsȫ������su��
		System.out.println(sn);
		System.out.println(su);
		
	}
}
