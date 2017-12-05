package chapter_1;

import java.util.Random;
import java.util.Scanner;

public class Guess {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random random = new Random();
	    int realNumber = random.nextInt(100)+1;
	    System.out.println(realNumber);
        System.out.println("这是一个猜数字的游戏，请输入你猜的0-100之间的数字：");
        int yourGuess;
        Scanner input = new Scanner(System.in);
        yourGuess = input.nextInt();
        while(yourGuess != realNumber){
        	if(realNumber > yourGuess){
        		System.out.println("猜小了");
        	}
        	else {
        		System.out.println("猜大了");
        	}
        	System.out.println("请重新输入");
        	yourGuess = input.nextInt();
        }
        System.out.println("猜对了");
	}

}
