package Question_Two;

public class Card {

	private int Num;//��С1-13
	private int Color;//��ɫ1-4
	
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
