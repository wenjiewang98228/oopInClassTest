package Employee;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		One one = new One(2011,"张三","sx",4500.0,3);
		Two two = new Two(2022,"李四","fx",210);
		String Info_1,Info_2;
		double Salary_1,Salary_2;
		Info_1 = one.getInfo();
		Info_2 = two.getInfo();
		Salary_1 = one.calculateSalary();
		Salary_2 = two.calculateSalary();
		
		System.out.println("员工一的信息：\n"+Info_1+"；\n工资："+Salary_1);
		System.out.println("\n员工二的信息：\n"+Info_2+"；\n工资："+Salary_2);
	}

}
