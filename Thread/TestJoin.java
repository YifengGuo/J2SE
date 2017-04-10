package Thread;
import java.util.*;	
public class TestJoin {
	public static void main(String aegs[]){
		MyThread2 mt2 = new MyThread2("abcde");
		mt2.start();
		try{
			mt2.join();//将另一个线程合并到当前线程，等于方法调用。此处先执行线程，再执行主线程。
		}catch(InterruptedException e){}
		for(int i = 0;i<=10;i++){
			System.out.println("i am main thread.");
		}
	}
}

class MyThread2 extends Thread{
	MyThread2(String s){ super(s);}
	public void run(){
		for(int i = 0;i<=10;i++){
			System.out.println("i am "+getName());
			try{
				Thread.sleep(1000);
				}catch(InterruptedException e)
			{
				return;
			}
		}
	}
}