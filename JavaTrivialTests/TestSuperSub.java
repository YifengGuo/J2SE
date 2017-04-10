class SuperClass{
	private int n;
	
	SuperClass(){
		System.out.println("SuperClass()");
	}
	SuperClass(int n){//overload superclass();
		System.out.println("SuperClass("+n+")");
		this.n = n;
	}
}
class SubClass extends SuperClass{
	private int n;
	
	SubClass(int n){
		System.out.println("SubClass("+n+")");
		this.n = n;
	}
	
	SubClass(){
		super(300);
		System.out.println("Subclass()");
	}
}
public class TestSuperSub {
	public static void main(String args[]){
		//Subclass sc1 = new SubClass();
		SubClass sc2 = new SubClass(400);
	}
}
