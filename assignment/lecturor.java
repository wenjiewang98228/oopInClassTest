package assignment;

public class lecturor {
	private String name;//����
	private String unit;//��λ
	
	/*���췽��*/
	public lecturor(String name,String unit){
		setName(name);
		setUnit(unit);
	}
	
	/*setters*/
	public void setName(String aName){
		this.name = aName;
	}
	
	public void setUnit(String aUnit){
		this.unit = aUnit;
	}
	
	/*getters*/
	public String getName(){
		return name;
	}
	
	public String getUnit(){
		return unit;
	}

}
