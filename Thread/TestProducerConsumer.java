package Thread;
import java.math.*;
public class TestProducerConsumer {
	public static void main(String[] args){
		SyncStack ss = new SyncStack();
		Producer p = new Producer(ss);
		Consumer c = new Consumer(ss);
		new Thread(p).start();
		new Thread(c).start();
	}
}


class WoTou{
	int id;
	WoTou(int id){
	this.id = id;
	}
	public String toString(){
		return "WoTou"+id;
	}
}

class SyncStack{
	int index = 0;
	WoTou arrWT[] = new WoTou[6]; 
	
	public synchronized void push(WoTou wt){
		while(index==arrWT.length){//此处不要用if;while循环内容为阻塞的条件;
			try{
			this.wait();//线程中发生一个阻塞性事件的时候用wait;
			}catch(InterruptedException e){e.printStackTrace();}
		}
		this.notify();//叫醒一个正在wait的线程；
		arrWT[index] = wt;
		index++;
	}
	
	public synchronized WoTou pop(WoTou wt){//wait时候，锁就不归我所有，sleep则还是拥有锁。
		index--;
		while(index==0){
			try{
			this.wait();
			}catch(InterruptedException e){e.printStackTrace();}
		}
		this.notify();
		return arrWT[index];
	}
}

class Producer implements Runnable{
	SyncStack ss = new SyncStack();
	
	Producer(SyncStack ss){
		this.ss = ss;
	}
	public void run(){
		for(int i = 0;i<20;i++){
			WoTou wt = new WoTou(i);
			ss.push(wt);
			System.out.println("produced:"+wt);
			try{
				Thread.sleep((int)Math.random()*200);//每生产一个，睡眠1s;
			}catch(InterruptedException e)	{e.printStackTrace();}
		}
	}
}

class Consumer implements Runnable{
	SyncStack ss = null;
	Consumer(SyncStack ss){
		this.ss = ss;
	}
	
	public void run(){
		for(int i = 0;i<20;i++){
			WoTou wt = new WoTou(i);
			ss.pop(wt);
			System.out.println("Consumed:"+wt);
			try{
				Thread.sleep((int)Math.random()*1000);//每吃掉一个，睡眠1s;
			}catch(InterruptedException e){e.printStackTrace();}
			//System.out.println(wt.toString());
		}
	}
}



