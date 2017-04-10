package Collection;
import java.util.*;

public class TestHashMap {
	public static void main(String args[]){//jdk 1.5版本后value可以不用先转换成object在初始化。可以直接输入。（自动打包  Auto-boxing）
		Map m1 = new HashMap();
		Map m2 = new HashMap();
		/*m1.put("one", new Integer(1));*/
		m1.put("one",1);//1仍然是对象。不是基础类型。而是内部自动打包成Integer对象了。
		/*m1.put("two", new Integer(2));*/
		m1.put("two",2);
		/*m1.put("three", new Integer(3));*/
		m1.put("three",3);
		/*m2.put("A", new Integer(1));*/
		m2.put("A", 1);
		/*m2.put("B", new Integer(2));*/
		m2.put("B", 2);
		System.out.println(m1.size());
		System.out.println(m1.containsKey("one"));
		System.out.println(m2.containsValue(2));
		/*(m2.containsValue(new Integer(1)));*/
		
		if(m1.containsKey("two")){
				//int i = ((Integer)m1.get("two")).intValue();
				int i = (Integer)m1.get("two");//自动解包（unboxing），必须先强制转化为Integer对象后然后系统可以自动解包为Integer对应的int基础类型。
				System.out.println(i);
		}
		Map m3 = new HashMap(m1);
		m3.putAll(m2);
		System.out.println(m3);
	}
}