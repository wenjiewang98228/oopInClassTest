package taxi;

public class NormalMode extends Car {
	
	private double baseCost = 0;
	
	public NormalMode(String userName,String date,double distance, String carMode,double perKmCost,double baseCost){
		super(userName,date,distance,carMode,perKmCost,baseCost);
		setbaseCost(baseCost);
	}
	
	public double calculatePrice(){
		double money;
		String info;
		money = baseCost + distance*perKmCost;
		info = "�û�������"+userName+"��\n���ڣ�"+date+"��\n���룺"+distance+"km��\n���ͣ�"
		+carMode+"��\nÿ����۸�"+perKmCost+"��";
		System.out.println(info);
		return money;
	}
	
	public void setbaseCost(double baseCost){
		this.baseCost = baseCost;
	}
	
	public double getbaseCost(){
		return baseCost;
	}
}
