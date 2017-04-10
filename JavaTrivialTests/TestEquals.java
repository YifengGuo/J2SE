class Cat1{
	int color;
	int height;
	int weight;
	
	public Cat1(int color,int height,int weight){
		this.color = color;
		this.height = height;
		this.weight = weight;
	}

	public boolean equals(Object obj){//equals�Ƚ����⡣�����Լ���дʱŪ��׼
		if(obj==null) return false;
		else{
			if(obj instanceof Cat1){
				Cat1 c = (Cat1)obj;
				if(c.color==this.color && c.height==this.height && c.weight==this.weight){
				return true;
				}
			}
		}
		return false;
	}
}
public class TestEquals {
	public static void main(String args[]){
		Cat1 c1 = new Cat1(1,2,3);
		Cat1 c2 = new Cat1(1,2,3);
		System.out.println(c1==c2);//������ζ����
		System.out.println(c1.equals(c2));//��equals������������д
	}
}
