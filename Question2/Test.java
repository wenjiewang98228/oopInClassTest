package Question_Two;

import java.util.Random;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Card TheCard = new Card(0,0);
		show();//功能一
		
		Random random = new Random();
	    int a1 = random.nextInt(13)+1;
	    int b1 = random.nextInt(13)+1;
	    System.out.println("这两张牌为"+a1+"和"+b1);
		System.out.println("这两张牌的数字是否一样？："+compare(a1,b1));
		//功能二
		int a2 = random.nextInt(4);
	    int b2 = random.nextInt(4);
		String info_1="";
		String info_2="";
		switch(a2){
		case 0:info_1="黑桃";break;
		case 1:info_1="红桃";break;
		case 2:info_1="梅花";break;
		case 3:info_1="方块";break;
		}
		switch(b2){
		case 0:info_2="黑桃";break;
		case 1:info_2="红桃";break;
		case 2:info_2="梅花";break;
		case 3:info_2="方块";break;
		}
	    System.out.println("这两张牌花色为"+info_1+"和"+info_2);
		System.out.println("这两张牌的花色是否一样？："+compare_2(a2,b2));
		//功能三
		int z=Series();
		if(z==1){
			System.out.println("第一组牌大");
		}
		if(z==0){
			System.out.println("两组牌一样大");
		}
		if(z==2){
			System.out.println("第二组牌大");
		}
		//功能四
	}

public static void show(){
			int i=1;
			int j=0;
			for(;i<=13;i++){
				
					switch(j){
					case 0:System.out.println(i+"黑桃");
					case 1:System.out.println(i+"红桃");
					case 2:System.out.println(i+"梅花");
					case 3:System.out.println(i+"方块");
					
				}
			}
		}

public static String compare(int a,int b){
	String info;
	if(a==b){
		info = "是";
	}
	else {info = "否";}
	return info;
}

public static String compare_2(int a,int b){
	String info;
	if(a==b){
		info = "是";
	}
	else {info = "否";}
	return info;
}

public static int Series(){
	int Mark = 0;
	Random random = new Random();
	
	int[] arr = new int[3];
	System.out.println("第一组牌：");
	for(int k=0;k<3;k++){
		arr[k]=random.nextInt(13);
		System.out.println(arr[k]);
	}
	
	int[] brr = new int[3];
	System.out.println("第二组牌：");
	for(int k=0;k<3;k++){
		brr[k]=random.nextInt(13);
		System.out.println(brr[k]);
	}
	int s1=0;
	int s2=0;
	if(arr[0]==arr[1]){s1++;}
	if(arr[0]==arr[2]){s1++;}
	if(arr[1]==arr[2]){s1++;}
	
	if(brr[0]==brr[1]){s2++;}
	if(brr[0]==brr[2]){s2++;}
	if(brr[1]==brr[2]){s2++;}
	
	if(s1>s2) Mark=1;
	if(s1==s2)Mark=0;
	if(s1<s2)Mark=2;
	return Mark;
}
}