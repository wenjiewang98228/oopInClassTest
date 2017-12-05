package Question_Three;

public abstract class Geometry {
	private double a=0;
	private double b=0;
	public Geometry(double a){
		this.a = a;
	}
	
	public abstract double getArea(double a);
	
	public abstract double getPerimeter(double a);
	
	public abstract double getDistance(double a,double x,double y);
	
	//public abstract Point getCenter();
	
	public void seta(double a){
		this.a = a;
	}
	
	public double geta()
	{
		return a;
	}
	
/*	public void setb(double b){
		this.b = a;
	}
	
	public double getb()
	{
		return b;
	}*/
}
