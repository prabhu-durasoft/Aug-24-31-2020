import com.intuit.training.day05.Employee;

public class EmployeeUser {

	public static void main(String[] args) {
		Employee e1 = new Employee("Sam", 10000);
		//System.out.println(e1.getSalary());
		Manager m1 = new Manager("Ram", 20000);
		System.out.println(m1.getInfo());
	}

}
class Manager extends Employee {
	public Manager(String name, long salary) {
		super(name, salary);
	}
	public String getInfo() {
		return super.getName() + " " + super.getSalary();
	}
}