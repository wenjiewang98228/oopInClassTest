package Bank;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String info;
		SavingAccount theSA = new SavingAccount(6213000,10000,0.0036);
		CheckingAccount theCA = new CheckingAccount(6315287,5000,11);
		
		System.out.println("�˺ţ�"+theSA.accNum);
		System.out.println("���д�"+theSA.balance);
		
		System.out.println("���룺10000");
		theSA.deposit(10000);
		
		System.out.println("����ȡǮ30000");
		info=theSA.withdraw(30000);
		System.out.println(info);
		
		System.out.println("����ȡǮ5000");
		info=theSA.withdraw(5000);
		System.out.println(info);
		
		System.out.println("�˺ţ�"+theCA.accNum);
		System.out.println("���д�"+theCA.balance);
		
		System.out.println("����֧ƱȡǮ2000");
		info=theCA.withdraw(2000);
		System.out.println(info);
		
		System.out.println("����֧ƱȡǮ7000");
		info=theCA.withdraw(7000);
		System.out.println(info);
	}

}
