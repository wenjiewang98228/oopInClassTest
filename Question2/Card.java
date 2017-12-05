package Question_Two;

public class Card {

	private int Num;//大小1-13
	private int Color;//花色1-4
	
	public Card(int Num,int Color){
		setNum(Num);
		setColor(Color);
	}
	
	public void setNum(int theNum){
		Num = theNum;
	}
	
	public int getNum(){
		return Num;
	}
	
	public void setColor(int theColor){
		Color = theColor;
	}
	
	public int getColor(){
		return Color;
	}
}
