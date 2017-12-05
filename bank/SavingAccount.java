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
			info = "�˺�͸֧�����˺ŵ����Ϊ��"+balance;
		}
		else{
			info = "ȡ����"+money+"ʣ���������Ϣ����"+(balance+interest-money);
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
