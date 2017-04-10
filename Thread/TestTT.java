package Thread;

public class TestTT implements Runnable{
	int b = 100;
	
	public synchronized void m1(){
		b = 1000;
		try{
		Thread.sleep(5000);
		}catch(InterruptedException e){
			e.printStackTrace();
		}
		System.out.println("b="+b);
	}
	 //保护一个对象需要对能对其访问的所有方法考虑加不加锁。
	public synchronized void m2(){
		try{
		Thread.sleep(2500);
		}catch(InterruptedException e){e.printStackTrace();}
		b = 2000;
		
	}
	
	public void run(){ 
		try{
			m1();
		}catch(Exception e){
			e.printStackTrace();
		}
	}


	public static void main(String[] args){
		TestTT tt = new TestTT();
		Thread t = new Thread(tt);
		t.start();
		
		try{
		Thread.sleep(1000);
		}catch(Exception e){e.printStackTrace();}
		
		tt.m2();
		System.out.println(tt.b);
	}
}
