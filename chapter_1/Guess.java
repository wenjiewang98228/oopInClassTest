package chapter_1;

import java.util.Random;
import java.util.Scanner;

public class Guess {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random random = new Random();
	    int realNumber = random.nextInt(100)+1;
	    System.out.println(realNumber);
        System.out.println("����һ�������ֵ���Ϸ����������µ�0-100֮������֣�");
        int yourGuess;
        Scanner input = new Scanner(System.in);
        yourGuess = input.nextInt();
        while(yourGuess != realNumber){
        	if(realNumber > yourGuess){
        		System.out.println("��С��");
        	}
        	else {
        		System.out.println("�´���");
        	}
        	System.out.println("����������");
        	yourGuess = input.nextInt();
        }
        System.out.println("�¶���");
	}

}
