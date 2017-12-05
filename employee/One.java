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
		Info = "\n���±�ţ�"+getempNum()
		+";\n������"+getempName()+
		";\n���ű��룺"+getempCode()
		+";\n�������ʣ�"+getbaseSalary()
		+";\n���䣺"+getworkAge();
		return Info;
	}
}
