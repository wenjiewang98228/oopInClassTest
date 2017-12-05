package Question_Three;

import java.util.Scanner;

public class TestGeometry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        Scanner input = new Scanner(System.in);
        double x=input.nextDouble();
        double y =input.nextDouble();
        Point p = new Point(x,y);
         
		double r =input.nextDouble();
		Circle circle = new Circle(r);
		System.out.println("半径为"+r+"的圆");
		System.out.println("面积为"+circle.getArea(r));
		System.out.println("周长为"+circle.getPerimeter(r));
		System.out.println("距离为"+circle.getDistance(r,x,y));
		
	    double a =input.nextDouble();
		double b =input.nextDouble();
		
		System.out.println("长为"+a+"宽为"+b+"的长方形");
		Rect rect = new Rect(a,b);
		System.out.println("面积为"+rect.getArea(a,b));	
		System.out.println("周长为"+rect.getPerimeter(a,b));
		System.out.println("距离为"+rect.getDistance(a,b,x,y));
		
		
		double c =input.nextDouble();
		Triangle tri = new Triangle(c);
		System.out.println("边长为"+c+"的正三角形");
		System.out.println("面积为"+tri.getArea(c));
		System.out.println("周长为"+tri.getPerimeter(c));
		System.out.println("距离为"+tri.getDistance(c,x,y));
		
		
	}

}
