package chapter_1;

import java.util.Scanner;

public class Height {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("������Ӣʽ��ߣ�");
		int ft;
		int ic;
		System.out.println("Ӣ��   Ӣ��");
		Scanner input = new Scanner(System.in);
		ft = input.nextInt();
		ic = input.nextInt();
        double meter;
        meter = (ft+ic/12.0)*0.3048;
        System.out.println(meter);
	}

}
