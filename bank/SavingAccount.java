package Bank;


public class SavingAccount extends BankAcount {
	private double rate = 0;
	public SavingAccount(long accNum, double balance,double rate){
		super(accNum,balance);
		setRate(rate);
	}

	public String withdraw(double money){
		double interest;
		String info;
		interest = balance * rate;
		if((balance + interest)<money ){
			info = "账号透支！您账号的余额为："+balance;
		}
		else{
			info = "取出金额："+money+"剩余金额（包括利息）："+(balance+interest-money);
		}
		return info;
	}
	
	public void setRate(double rate){
		this.rate = rate;
	}
	
	public double getRate(){
		return rate;
	}
}
