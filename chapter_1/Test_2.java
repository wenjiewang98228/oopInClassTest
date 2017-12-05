package chapter_1;

import java.util.Scanner;

public class Test_2 {

	public static void main(String[] args){ 
		// TODO Auto-generated method stub
		System.out.println("请输入1-99999之间的整数");
        Scanner input = new Scanner(System.in);
        int yourNumber = input.nextInt();
        int YourNumber = yourNumber;
       // System.out.println(yourNumber);
        if(yourNumber >= 1 && yourNumber <= 99999){
        	int a = 0;
        //	System.out.println(a);
        	while(yourNumber/10 != 0){
        		a++;
        //		System.out.println(a);
        		yourNumber = yourNumber/10;
        		
        	}
        //	System.out.println(a);
        	int[] array = new int[a+1];
        	for(int i=0;i<=a;i++)
        	{
        	    array[i] = YourNumber%10;
        	    YourNumber = YourNumber/10;
        //	    System.out.println(array[i]);
        		}
        	int h=0;
        	int is_Number=1;
        	while(h<=(a+1)/2)
        	{
        		if(array[h] == array[a-h]){
        			h++;
        		}
        		else {
        			is_Number=0;
        			break;
        		}
        		}
        	if(is_Number==1){
        		System.out.println("yes");
        	}
        	else System.out.println("No");
        		} 
        else System.out.println("请输入1-99999之间的整数");
        	}
        	}
        
       

