package Thread;
import java.util.*;
public class TestInterrupt {
	public static void main(String args[]){
		MyThread mt = new MyThread();
		mt.start();
		try{Thread.sleep(10000);}//��˼�ǵ�ǰ�߳�(���߳�)10s��˯�ߡ�
		catch(InterruptedException e){}
		mt.interrupt();//��sleep�д�ϣ�Ȼ������run()���쳣��Ȼ��ֹͣ��ӡ��
		//mt.flag = false;//���� ��ֹ�̣߳����º͡�
	}
}


class MyThread extends Thread{
	//public boolean flag = true;//����
	public void run(){
		//while(flag){//����
		while(true){
			System.out.println("==="+new Date()+"===");
		try{
			Thread.sleep(1000);//ÿ��һ���Ӵ�ӡһ��ϵͳʱ�䡣
		}catch(InterruptedException e){
			return;//return void ���߳̽���;
			}
		}
	} 
}