package Employee;

public class Employee {
	private int empNum;
	private String empName;
	private String empCode;
	
	public Employee(int theempNum, String theempName, String theempCode){
		setempNum(theempNum);
		setempName(theempName);
		setempCode(theempCode);
	}
	
	public int getempNum(){
		return empNum;
	}
	
	public String getempName(){
		return empName;
	}
	
	public String getempCode(){
		return empCode;
	}
	
	public void setempNum(int theempNum){
		empNum = theempNum;
	}
	
	public void setempName(String theempName){
		empName = theempName;
	}
	
	public void setempCode(String theempCode){
		empCode = theempCode;
	}

/*	public String getInfo(){
		String Info;
		Info = "\n���±�ţ�"+getempNum()
		+";\n������"+getempName()+
		";\n���ű��룺"+getempCode();
		return Info;
	}*/
}
