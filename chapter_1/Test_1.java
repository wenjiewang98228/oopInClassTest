package chapter_1;

import java.util.Scanner;

public class Test_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int p_train = 12;
        int p_car = 22;
        double p_plane = 0.062;
        
        Scanner input = new Scanner(System.in);
        double weight = input.nextDouble();
        double c_train = (int)weight * p_train;
        double c_car = (int)(weight+0.5) * p_train;
        double c_plane = (int)(weight * 1000) * p_train;
        
        System.out.println("�����ˣ�" + c_train);
        System.out.println("�������ˣ�" + c_car);
        System.out.println("�ɻ����ˣ�" + c_plane);
        
	}

}
