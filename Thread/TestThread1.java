package Thread;

public class TestThread1 {
	public static void main(String args[]){
		Runner1 r = new Runner1();
		//r.run();//直接调用r.run()只是调用方法，实际上还是单线程（主线程）;
		Thread t = new Thread(r);
		t.start();//开启一个新的线程的方法。
		
		for(int i = 0;i<100;i++){
			System.out.println("main Thread:"+i);
		}
	}
}

class Runner1 implements Runnable{
	public void run(){//重写run()方法。
		for(int i = 0;i<100;i++){
			System.out.println("Runner1:"+i);
		}
	}
}