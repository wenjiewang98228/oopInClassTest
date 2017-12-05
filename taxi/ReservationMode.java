package taxi;

public class ReservationMode extends Car {
    
	private double discountRate = 0;
	
	public ReservationMode(String userName, String date, double distance, String carMode,double perKmCost,double discountRate){
		super(userName,date,distance, carMode,perKmCost,discountRate);
		setdiscountRate(discountRate);
	}
	
	public double calculatePrice(){
		double money;
		String info;
		money = distance*perKmCost*(1+discountRate);
		info = "用户姓名："+userName+"；\n日期："+date+"；\n距离："+distance+"km；\n车型："
				+carMode+"；\n每公里价格："+perKmCost+"；";
		System.out.println(info);
		return money;
	}
	
	public void setdiscountRate(double discountRate){
		this.discountRate = discountRate;
	}
	
	public double getdiscountRate(){
		return discountRate;
	}
	
}
