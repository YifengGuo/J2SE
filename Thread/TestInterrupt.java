package Thread;
import java.util.*;
public class TestInterrupt {
	public static void main(String args[]){
		MyThread mt = new MyThread();
		mt.start();
		try{Thread.sleep(10000);}//意思是当前线程(主线程)10s后睡眠。
		catch(InterruptedException e){}
		mt.interrupt();//从sleep中打断，然后引起run()抛异常，然后停止打印。
		//mt.flag = false;//法二 终止线程，更温和。
	}
}


class MyThread extends Thread{
	//public boolean flag = true;//法二
	public void run(){
		//while(flag){//法二
		while(true){
			System.out.println("==="+new Date()+"===");
		try{
			Thread.sleep(1000);//每隔一秒钟打印一次系统时间。
		}catch(InterruptedException e){
			return;//return void 即线程结束;
			}
		}
	} 
}