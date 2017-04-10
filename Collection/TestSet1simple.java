package Collection;
import java.util.*;
public class TestSet1simple {
	public static void main(String args[]){
		Set s1 = new HashSet();
		Set s2 = new HashSet();
		s1.add("a");s1.add("b");s1.add("c");
		s2.add("a");s2.add("b");s2.add("d");
		
		Set sn = new HashSet(s1);
		sn.retainAll(s2);//取得两个集的交集。
		Set su = new HashSet(s1);
		su.addAll(s2);//将s2中的items全部传入su中
		System.out.println(sn);
		System.out.println(su);
		
	}
}
