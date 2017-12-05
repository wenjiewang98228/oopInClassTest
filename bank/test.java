package Bank;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String info;
		SavingAccount theSA = new SavingAccount(6213000,10000,0.0036);
		CheckingAccount theCA = new CheckingAccount(6315287,5000,11);
		
		System.out.println("账号："+theSA.accNum);
		System.out.println("现有存款："+theSA.balance);
		
		System.out.println("存入：10000");
		theSA.deposit(10000);
		
		System.out.println("测试取钱30000");
		info=theSA.withdraw(30000);
		System.out.println(info);
		
		System.out.println("测试取钱5000");
		info=theSA.withdraw(5000);
		System.out.println(info);
		
		System.out.println("账号："+theCA.accNum);
		System.out.println("现有存款："+theCA.balance);
		
		System.out.println("测试支票取钱2000");
		info=theCA.withdraw(2000);
		System.out.println(info);
		
		System.out.println("测试支票取钱7000");
		info=theCA.withdraw(7000);
		System.out.println(info);
	}

}
