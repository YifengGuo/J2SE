package Collection;
import java.util.*;
public class TestArgsWords {
	//parameter��aaa bbs sdid iwne sdsaw www wqw www aaa aaa aaa cc cc cdfs cds cds
	//private static final Integer ONE = new Integer(1);
	private static final int ONE = 1;
	public static void main(String args[]){
		Map m = new HashMap();
		for(int i = 0; i<args.length;i++){
			//Integer freq = (Integer)m.get(args[i]);//һ��ʼ�ǽ���args[0]��aaaΪkey��value get����������û�С�����freqһ��ʼΪnull��
			int freq = (Integer)m.get(args[i])==null ? 0 : (Integer)m.get(args[i]);//�Զ����;��ֵ���ܸ�λinteger�������Ե��������ʹ��Ϊ0��
			//m.put(args[i], (freq==null ? ONE : new Integer(freq.intValue()+1)));
			m.put(args[i], (freq==0 ? ONE:freq+1));
		}
		System.out.println(m.size()+" distinct words detected:");
		System.out.println(m);
	}
}
