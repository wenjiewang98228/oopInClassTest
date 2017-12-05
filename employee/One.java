package Employee;

public class One extends Employee {

	private double baseSalary;
	private int workAge;
	
	public One(int theempNum, String theempName, String theempCode,double thebaseSalary,int theworkAge){
		super(theempNum,theempName,theempCode);
		setbaseSalary(thebaseSalary);
		setworkAge(theworkAge);
	}
	
	public double getbaseSalary(){
		return baseSalary;
	}
	
	public double getworkAge(){
		return workAge;
	}
	
	public void setbaseSalary(double thebaseSalary){
		baseSalary = thebaseSalary;
	}
	
	public void setworkAge(int  theworkAge){
		workAge = theworkAge;
	}
	
	public double calculateSalary(){
		double salary;
		salary = baseSalary + workAge*500;
		return salary;
	}
	
	public String getInfo(){
		String Info;
		Info = "\n人事编号："+getempNum()
		+";\n姓名："+getempName()+
		";\n部门编码："+getempCode()
		+";\n基本工资："+getbaseSalary()
		+";\n工龄："+getworkAge();
		return Info;
	}
}
