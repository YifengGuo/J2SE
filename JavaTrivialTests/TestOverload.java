
public class TestOverload {
	void max(int a,int b){
		System.out.println(a > b ? a : b);
	}
	
	void max(float a,float b){//ֱ�ӵ��ú���max����Ϊ���������أ�overlord����������һ�����������������ֿ��͹�������
		System.out.println(a > b ? a : b);
	}
	
	public static void main(String args[]){
		TestOverload t1 = new TestOverload();
		t1.max(7, 9);
		
	}

}
