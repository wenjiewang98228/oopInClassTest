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
		System.out.println("�뾶Ϊ"+r+"��Բ");
		System.out.println("���Ϊ"+circle.getArea(r));
		System.out.println("�ܳ�Ϊ"+circle.getPerimeter(r));
		System.out.println("����Ϊ"+circle.getDistance(r,x,y));
		
	    double a =input.nextDouble();
		double b =input.nextDouble();
		
		System.out.println("��Ϊ"+a+"��Ϊ"+b+"�ĳ�����");
		Rect rect = new Rect(a,b);
		System.out.println("���Ϊ"+rect.getArea(a,b));	
		System.out.println("�ܳ�Ϊ"+rect.getPerimeter(a,b));
		System.out.println("����Ϊ"+rect.getDistance(a,b,x,y));
		
		
		double c =input.nextDouble();
		Triangle tri = new Triangle(c);
		System.out.println("�߳�Ϊ"+c+"����������");
		System.out.println("���Ϊ"+tri.getArea(c));
		System.out.println("�ܳ�Ϊ"+tri.getPerimeter(c));
		System.out.println("����Ϊ"+tri.getDistance(c,x,y));
		
		
	}

}
