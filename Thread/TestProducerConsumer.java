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
		while(index==arrWT.length){//�˴���Ҫ��if;whileѭ������Ϊ����������;
			try{
			this.wait();//�߳��з���һ���������¼���ʱ����wait;
			}catch(InterruptedException e){e.printStackTrace();}
		}
		this.notify();//����һ������wait���̣߳�
		arrWT[index] = wt;
		index++;
	}
	
	public synchronized WoTou pop(WoTou wt){//waitʱ�����Ͳ��������У�sleep����ӵ������
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
				Thread.sleep((int)Math.random()*200);//ÿ����һ����˯��1s;
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
				Thread.sleep((int)Math.random()*1000);//ÿ�Ե�һ����˯��1s;
			}catch(InterruptedException e){e.printStackTrace();}
			//System.out.println(wt.toString());
		}
	}
}



