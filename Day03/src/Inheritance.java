import java.time.LocalDateTime;

public class Inheritance {

	public static void main(String[] args) {
		Employee e1 = new Employee("Sam");
		
		Manager m1 = new Manager("Ram", 3);
		System.out.println(m1.getName());
		m1.work(12);
		
		Manager m2 = new Manager("John", 5);
		VP vp1 = new VP("Joe", 20000);
		
//		passThroughSecurityCheck(e1);
//		passManagerThroughSecurityCheck(m1);
//		passVPThroughSecurityCheck(vp1);
		Director dr = new Director("Maniratnam", 10, 13243);
		commonSecurityCheck(e1);
		commonSecurityCheck(m1);
		commonSecurityCheck(vp1);
		commonSecurityCheck(dr);
		
		//base class can refer to a derived class object
		Employee emp = new Manager("Mary", 10);
		
		Employee emp2 = new VP("Kohli", 1000);
		//System.out.println(emp2.getStockOptions());
		
		//derived class CANNOT refer to base class object 
//		Manager mgr1 = new Employee("Joe");
//		VP vp = new Employee("Jim");
	}
	
	//single interface, but you get different responses
	//Polymorphism = Inheritance + Method overriding
	//JVM identifies the actual type of object being passed and calls the appropriate method
	static void commonSecurityCheck(Employee emp) {
		emp.swipe();
	}
	
	
	
	//FOOLISH TO HAVE A SEPARATE METHOD FOR EVERY TYPE OF EMPLOYEE
//	static void passThroughSecurityCheck(Employee emp) {
//		emp.swipe();
//	}
//	
//	static void passManagerThroughSecurityCheck(Manager mgr) {
//		mgr.swipe();
//	}
//	
//	static void passVPThroughSecurityCheck(VP vp) {
//		vp.swipe();
//	}

}
