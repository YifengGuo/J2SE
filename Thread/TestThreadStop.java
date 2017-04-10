package Thread;

public class TestThreadStop {
	public static void main(String args[]){
		Runner r1 = new Runner();
		Thread t = new Thread(r1);
		for(int i = 0;i<100000;i++){
			if(i%10000==0&i>0){
				System.out.println("in thread main i="+i);
			}
		}
		System.out.println("Thread main is over");
		r1.shutDown();//run()结束线程就结束。所以最好结束run来结束线程;
	}
}


class Runner implements Runnable{
	boolean flag = true;
	public void run(){
		int i = 0;
		while(flag==true){
			System.out.println("  "+ i++);
		}
		
	}
	public void shutDown(){
		flag = false;
	}
}