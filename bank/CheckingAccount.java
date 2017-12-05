package Bank;


public class CheckingAccount extends BankAcount {

	private int numChecksWritten = 0;
	
	public CheckingAccount(long accNum, double balance, int numChkesWrriten){
		super(accNum,balance);
	}
	
	public String withdraw(double money){
		String info;
		numChecksWritten += 1;
		if(numChecksWritten>10){
			money +=1.00;
		}
		if(balance<money){
			info = "支票账号透支！";
		}
		else{
			balance = balance-money;
			info="支出成功！";
		}
		return info;
	}
	
	public void setnumChecksWritten(int numChecksWritten){
		this.numChecksWritten=numChecksWritten;
	}
	
	public int getnumChecksWritten(){
		return numChecksWritten;
	}
}
