package taxi;

public abstract class Car {

	protected String userName;
	protected String date;
	protected double distance;
	protected String carMode;
	protected double perKmCost;
	
	public Car(String userName, String date, double distance, String carMode,double perKmCost,double m){
		this.userName = userName;
		this.date = date;
		this.distance = distance;
		this.carMode = carMode;
		this.perKmCost = perKmCost;
				}
	
	public abstract double calculatePrice();
	
	public String getuserName(){
		return userName;
	}
	
	public void setuserName(String userName){
		this.userName = userName;
	}
	
	public String getdate(){
		return date;
	}
	
	public void setdate(String date){
		this.date = date;
	}
	
	public double getdistance(){
		return distance;
	}
	
	public void setdistance(double distance){
		this.distance = distance;
	}
	
	public String getcarMode(){
		return carMode;
	}
	
	public void setcarMode(String carMode){
		this.carMode = carMode;
	}
	
	public double getperKmCost(){
		return perKmCost;
	}
	
	public void setperKmCost(double perKmCost){
		this.perKmCost = perKmCost;
	}
}
