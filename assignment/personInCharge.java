package assignment;

/*��������Ϣ*/
public class personInCharge {
	private String name;//����
	private String department;//Ժϵ
	private String classInfo;//�༶

    /*���췽��*/
	public personInCharge(String name,String department,String classInfo){
		setName(name);
		setDepartment(department);
		setClassInfo(classInfo);
	}

	/*getters*/
	public void setName(String aName) {
		// TODO Auto-generated method stub
		this.name = aName;
	}
	
	public void setDepartment(String aDepartment) {
		// TODO Auto-generated method stub
		this.department = aDepartment;
	}
	
	public void setClassInfo(String aClassInfo) {
		// TODO Auto-generated method stub
		this.classInfo = aClassInfo;
	}
	
	/*setters*/
	public String getName(){
		return name;
	}
	
	public String getDepartment(){
		return department;
	}
	
	public String getClassInfo(){
		return classInfo;
	}


}
