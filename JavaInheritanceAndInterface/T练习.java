package TestInterface��ϰ;
interface Petting{
	public void feed();
	public void play();
}

class People{
	public String name;
	public String title;
	People(String name,String title){
		this.name = name;
		this.title = title;
	}
}
class Farmer extends People implements Petting{
	Farmer(String n,String t){
		super(n,t);
	}
	public void feed(){
		System.out.println(title+name+":ι���");
	}
	public void play(){
		System.out.println(title+name+":��ȥ������");
	}
}
class Worker extends People implements Petting{
	Worker(String n,String t){
		super(n,t);
	}
	public void feed(){
		System.out.println(title+name+":ι����");
	}
	public void play(){
		System.out.println(title+name+":��԰�޹�");
	}
}
class Leader extends People implements Petting{
	Leader(String n,String t){
		super(n,t);
	}
	public void feed(){
		System.out.println(title+name+":ר��רְι����");
	}
	public void play(){
		System.out.println(title+name+":���Ϻ�ר���޹�");
	}
}
public class T��ϰ {
	public static void main(String args[]){
		Farmer f1 = new Farmer("����","ũ��");
		Worker w1 = new Worker("����","����");
		Leader l1 = new Leader("ϰ��ƽ","������ϯ");
		f1.feed();
		f1.play();
		w1.feed();
		w1.play();
		l1.feed();
		l1.play();
		
	}
	
	
}
