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
			info = "֧Ʊ�˺�͸֧��";
		}
		else{
			balance = balance-money;
			info="֧���ɹ���";
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
