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
		info = "用户姓名："+userName+"；\n日期："+date+"；\n距离："+distance+"km；\n车型："
		+carMode+"；\n每公里价格："+perKmCost+"；";
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
