package Thread;

public class TestSync implements Runnable{
	Timer timer = new Timer();
	public static void main(String args[]){
		TestSync ts = new TestSync();
		Thread t1 = new Thread(ts);
		Thread t2 = new Thread(ts);
		t1.setName("t1");
		t2.setName("t2");
		t1.start();
		t2.start();
		
	}
	public void run(){
		timer.add(Thread.currentThread().getName());//两个线程访问的都是这个timer对象的add方法;所以num++和打印之间可能两个线程访问后就打印出错误结果。
	}
}


class Timer{
	private static int num = 0;
	public synchronized void add(String name){//或者再声明方法的时候加上synchronized则表示执行方法时锁定其中的对象。
		//synchronized(this){//锁定当前对象，一个线程执行过程中不会被另一个线程打断。
		num++;
		try{Thread.sleep(1);}catch(InterruptedException e){}
		System.out.println(name+" you are the number "+num+" to use this timer thread.");
		//}
	}
}