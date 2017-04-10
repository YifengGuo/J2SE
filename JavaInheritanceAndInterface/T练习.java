package TestInterface练习;
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
		System.out.println(title+name+":喂肉吃");
	}
	public void play(){
		System.out.println(title+name+":带去田里玩");
	}
}
class Worker extends People implements Petting{
	Worker(String n,String t){
		super(n,t);
	}
	public void feed(){
		System.out.println(title+name+":喂狗粮");
	}
	public void play(){
		System.out.println(title+name+":公园遛狗");
	}
}
class Leader extends People implements Petting{
	Leader(String n,String t){
		super(n,t);
	}
	public void feed(){
		System.out.println(title+name+":专人专职喂狗粮");
	}
	public void play(){
		System.out.println(title+name+":中南海专人遛狗");
	}
}
public class T练习 {
	public static void main(String args[]){
		Farmer f1 = new Farmer("老李","农民");
		Worker w1 = new Worker("老王","工人");
		Leader l1 = new Leader("习近平","国家主席");
		f1.feed();
		f1.play();
		w1.feed();
		w1.play();
		l1.feed();
		l1.play();
		
	}
	
	
}
