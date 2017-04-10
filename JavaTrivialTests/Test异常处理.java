class MyException extends Exception{
	private int id;
	public MyException(String message,int id){
		super(message);
		this.id = id;
	}
	public int getId(){
		return id;
	}
}
public class Test�쳣���� {
	public void regist(int num)throws MyException{
		if(num < 0){
			throw new MyException("����Ϊ��ֵ��������",3);
		}
		else System.out.println("�Ǽ�������"+num);
	}
	public void manager(){
		try{regist(-6);}
		catch(MyException e){
			System.out.println("�Ǽ�ʧ�ܣ�����������:"+e.getId());
			e.printStackTrace();
		}
		System.out.println("��������");
	}
	public static void main(String args[]){
		Test�쳣���� t = new Test�쳣����();
		t.manager();
	}
}
