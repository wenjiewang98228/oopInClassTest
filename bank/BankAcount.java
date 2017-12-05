package Bank;

public abstract class BankAcount {

	protected long accNum;
	protected double balance;
	
	public BankAcount(long accNum, double balance){
		this.accNum = accNum;
		this.balance = balance;
	}
	
	public void deposit(double money){
		balance += money;
		System.out.println("成功存入"+money+"元");
		System.out.println("余额为"+balance+"元");
	}
	
	public abstract String withdraw(double money);
	
	public long getaccNum(long accNum){
		return accNum;
	}
	
	public double getbalance(double balance){
		return balance;
	}
	
	public void setaccNum(){
		this.accNum = accNum;
	}
	
	public void setbalance(){
		this.balance = balance;
	}
}
