package Collection;

import java.util.*;

public class TestEnhancedFor {
	public static void main(String args[]){
		int arr[] = {1,2,3,4,5};
		for(int i:arr){//把arr中每个元素拿出来放在i里面;
			System.out.print(i);
		}
		System.out.println();
		
		Collection c = new ArrayList();
		c.add(new String("aaa"));
		c.add(new String("bbb"));
		c.add(new String("ccc"));
		for(Object o:c){
			System.out.print(o);
		}
	}
}
