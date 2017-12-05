package Employee;

public class Two extends Employee {

	private int workHours;
	
	public Two(int theempNum, String theempName, String theempCode, int theworkHours){
		super(theempNum,theempName,theempCode);
		setworkHours(theworkHours);
	}
	
	public int getworkHours(){
		return workHours;
	}
	
	public void setworkHours(int theworkHours){
		workHours = theworkHours;
	}
	
	public double calculateSalary(){
		double salary;
		salary = workHours * 50;
		return salary;
	}
	
	public String getInfo(){
		String Info;
		Info = "\n人事编号："+getempNum()
		+";\n姓名："+getempName()+
		";\n部门编码："+getempCode()
		+";\n工时："+getworkHours();
		return Info;
	}
	
}
