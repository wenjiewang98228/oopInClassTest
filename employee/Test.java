package Employee;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		One one = new One(2011,"����","sx",4500.0,3);
		Two two = new Two(2022,"����","fx",210);
		String Info_1,Info_2;
		double Salary_1,Salary_2;
		Info_1 = one.getInfo();
		Info_2 = two.getInfo();
		Salary_1 = one.calculateSalary();
		Salary_2 = two.calculateSalary();
		
		System.out.println("Ա��һ����Ϣ��\n"+Info_1+"��\n���ʣ�"+Salary_1);
		System.out.println("\nԱ��������Ϣ��\n"+Info_2+"��\n���ʣ�"+Salary_2);
	}

}
