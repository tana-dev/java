public class TestApp{
	public static void main(String[] args){
		//Person p = new Person(10, "Tanaka");
		Employee p = new Employee(25,"Mike","Google");
		p.printName();
		p.printAge();
		p.printCompany();
	}
}
