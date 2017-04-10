package Thread;

public class TestThreadisAlive {
	public static void main(String args[]){
		Runner6 r = new Runner6();
		Thread t =new Thread(r);
		t.start();
		
		for(int i=0;i<50;i++){
			System.out.println("MainThread: "+i);
		}
		
	}
}

class Runner6 implements Runnable{
	public void run(){
		System.out.println(Thread.currentThread().isAlive());
		for(int i = 0;i<50;i++){
			System.out.println("SubThread: "+i);
		}
	}
}