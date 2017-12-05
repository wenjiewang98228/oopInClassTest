package Question_Three;

public class Circle extends Geometry {

	final double PI = 3.14;
	
	public Circle(double a){
		super(a);
	}
	@Override
	public double getArea(double a) {
		// TODO Auto-generated method stub
		double Area = PI*a*a;
		return Area;
	}

	@Override
	public double getPerimeter(double a) {
		// TODO Auto-generated method stub
		double Perimeter = 2*PI*a;
		return Perimeter;
	}

	@Override
	public double getDistance(double a,double x,double y) {
		// TODO Auto-generated method stub
		double Distance = Math.sqrt((x-a)*(x-a)+(y-a)*(y-a));
		return Distance;
	}

}
