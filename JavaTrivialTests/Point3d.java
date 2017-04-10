
public class Point3d {
	double xcoordinate;
	double ycoordinate;
	double zcoordinate;
	
	public Point3d(double x,double y,double z){
		xcoordinate=x;
		ycoordinate=y;
		zcoordinate=z;
	}
	
	public void setXcoordinate(double x){
		xcoordinate=x;		
	}
	
	public void setYcoordinate(double y){
		ycoordinate=y;
	}
	
	public void setZcoordinate(double z){
		zcoordinate=z;
	}
	
	public double getXcoordinate(){
		return xcoordinate;
	}
	
	public double getYcoordinate(){
		return ycoordinate;
	}
	
	public double getZcoordinate(){
		return zcoordinate;
	}
	
	double getDistance(Point3d p){//到p点的距离
		return (xcoordinate-p.xcoordinate)*(xcoordinate-p.xcoordinate)+(ycoordinate-p.ycoordinate)*(ycoordinate-p.ycoordinate)+(zcoordinate-p.zcoordinate)*(zcoordinate-p.zcoordinate);
	}
	
	public static void main(String args[]){
		double distance = 0.0;
		Point3d p1 = new Point3d(4,3,2);
		Point3d p2 = new Point3d(1,1,1);
		System.out.println(p1.getDistance(p2));//p1到p点的距离打印出;
		
		p1.setXcoordinate(5.0);
		System.out.println(p1.getDistance(new Point3d(2,2,2)));
		
		
	}
}
