package Question_Three;

public class Point {

	private double x,y;
	
	public Point(double _x,double _y){
		setx(_x);
		sety(_y);
	}
	
	
	public void setx(double _x){
		x = _x;
	}
	
	public double getx(){
		return x;
	}
	
	public void sety(double _y){
		y = _y;
	}
	
	public double gsty(){
		return y;
	}
}
