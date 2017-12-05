package assignment;

public class lecturor {
	private String name;//姓名
	private String unit;//单位
	
	/*构造方法*/
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
