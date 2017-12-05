package Question_Three;

public class Rect {
	
	private double a;
	private double thea;
	private double b;
	private double theb;
	
	public Rect(double thea,double theb){
		seta(thea);
		setb(theb);
	}

	public double getArea(double a,double b ) {
		// TODO Auto-generated method stub
		double Area = a*b;
		return Area;
	}


	public double getPerimeter(double a,double b) {
		// TODO Auto-generated method stub
		double Perimater = 2*(a+b);
		return Perimater;
	}


	public double getDistance(double a,double b,double x,double y) {
		// TODO Auto-generated method stub
		double Distance = Math.sqrt((x-a/2.0)*(x-a/2.0)+(y-b/2.0)*(y-b/2.0));
		return Distance;
	}

	public void seta(double  thea){
		a = thea;
	}
	
	public double geta(){
		return a;
	}
	
	public void setb(double  theb){
		b = theb;
	}
	
	public double getb(){
		return b;
	}
}
