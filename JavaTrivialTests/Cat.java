public class Cat {
	private static int sid = 0;
	private String name;
	int id;
	Cat(String name){
		this.name = name;
		id = sid++;
				
	}
	
	public void info(){
		System.out.println("the cat's name is :" +name+",id:"+id);
	}
	public static void main(String args[]){
		Cat.sid = 100;
		Cat mimi = new Cat("mimi");
		Cat pipi = new Cat("pipi");
		
		mimi.info();
		pipi.info();
	}
}
