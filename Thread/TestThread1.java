package Thread;

public class TestThread1 {
	public static void main(String args[]){
		Runner1 r = new Runner1();
		//r.run();//ֱ�ӵ���r.run()ֻ�ǵ��÷�����ʵ���ϻ��ǵ��̣߳����̣߳�;
		Thread t = new Thread(r);
		t.start();//����һ���µ��̵߳ķ�����
		
		for(int i = 0;i<100;i++){
			System.out.println("main Thread:"+i);
		}
	}
}

class Runner1 implements Runnable{
	public void run(){//��дrun()������
		for(int i = 0;i<100;i++){
			System.out.println("Runner1:"+i);
		}
	}
}