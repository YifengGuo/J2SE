package Collection;
import java.util.*;
public class TestArgsWords {
	//parameter：aaa bbs sdid iwne sdsaw www wqw www aaa aaa aaa cc cc cdfs cds cds
	//private static final Integer ONE = new Integer(1);
	private static final int ONE = 1;
	public static void main(String args[]){
		Map m = new HashMap();
		for(int i = 0; i<args.length;i++){
			//Integer freq = (Integer)m.get(args[i]);//一开始是将以args[0]即aaa为key的value get出来。但是没有。所以freq一开始为null。
			int freq = (Integer)m.get(args[i])==null ? 0 : (Integer)m.get(args[i]);//自动打包;空值不能赋位integer对象。所以单独提出来使其为0；
			//m.put(args[i], (freq==null ? ONE : new Integer(freq.intValue()+1)));
			m.put(args[i], (freq==0 ? ONE:freq+1));
		}
		System.out.println(m.size()+" distinct words detected:");
		System.out.println(m);
	}
}
