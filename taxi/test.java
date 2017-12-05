package taxi;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		NormalMode theNM = new NormalMode("Joah","2017/9/4",13.7,"NormalMode",1.30,10.0);
		
		double cost_1 = theNM.calculatePrice();
		System.out.println("总价:"+cost_1+";");
		
		ReservationMode theRM = new ReservationMode("Anna","2017/9/12",8.3,"ReservationMode",1.30,0.023);
		double cost_2 = theRM.calculatePrice();
		System.out.println("总价:"+cost_2+";");
		
	}

}
