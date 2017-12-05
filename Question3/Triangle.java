package Question_Three;

public class Triangle extends Geometry {

	public Triangle(double a){
		super(a);
	}
	@Override
	public double getArea(double a) {
		// TODO Auto-generated method stub
		double Area = Math.sqrt(3)*a*a/2.0;
		return Area;
	}

	@Override
	public double getPerimeter(double a) {
		// TODO Auto-generated method stub
		double Perimeter = 3*a;
		return Perimeter;
	}

	@Override
	public double getDistance(double a,double x,double y) {
		// TODO Auto-generated method stub
		double Distance = Math.sqrt((x-a/2.0)*(x-a/2.0)+(y-Math.sqrt(3)*4/6.0)*(y-Math.sqrt(3)*4/6.0));
		return Distance;
	}

}
