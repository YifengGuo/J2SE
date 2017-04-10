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
		timer.add(Thread.currentThread().getName());//�����̷߳��ʵĶ������timer�����add����;����num++�ʹ�ӡ֮����������̷߳��ʺ�ʹ�ӡ����������
	}
}


class Timer{
	private static int num = 0;
	public synchronized void add(String name){//����������������ʱ�����synchronized���ʾִ�з���ʱ�������еĶ���
		//synchronized(this){//������ǰ����һ���߳�ִ�й����в��ᱻ��һ���̴߳�ϡ�
		num++;
		try{Thread.sleep(1);}catch(InterruptedException e){}
		System.out.println(name+" you are the number "+num+" to use this timer thread.");
		//}
	}
}