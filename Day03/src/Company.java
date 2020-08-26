public class Company {
	private String name;
	private long employeesCount;
	private String registeredOffice;
	
	//Constructor overloading
	public Company() {
		name = "Inc";
		employeesCount = 1;
	}


	public Company(String name) {
		this.name = name;
	}
	
	
	public Company(String name, String registeredOffice) {
		this.name = name;
		this.registeredOffice = registeredOffice;
	}


	public Company(String name, long employeesCount, String registeredOffice) {
		this.name = name;
		this.employeesCount = employeesCount;
		this.registeredOffice = registeredOffice;
	}
	
	public String getName() {
		return name;
	}
	public long getEmployeesCount() {
		return employeesCount;
	}
	public String getRegisteredOffice() {
		return registeredOffice;
	}
	
	
	
}
