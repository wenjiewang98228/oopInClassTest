package assignment;

/*负责人信息*/
public class personInCharge {
	private String name;//名称
	private String department;//院系
	private String classInfo;//班级

    /*构造方法*/
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
