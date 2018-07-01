public class Employee extends Person {

	private String company;

	public Employee(int age, String name, String company){
		super(age, name);
		this.company = company;
	}

	public void printCompany(){
		System.out.println(company);
	}
}
