
//java StaticKeyword
//StaticKeyword.main(...)
public class StaticKeyword {

	public static void main(String[] args) {
//		Company company = new Company();
//		company.register("Intuit Inc");
		
		Company.register("Intuit");
		Company.register("TCS");

		Counter ctr1 = new Counter();
		ctr1.increment();
		
		Counter ctr2 = new Counter();
		ctr2.increment();
		
		System.out.println(Counter.getObjectCount());
		//Counter.objectCount = 10;
	}

}

class Counter {
	//class variable
	private static int objectCount;
	public int count;
	
	public void increment() {
		count++;
	}
	public static int getObjectCount() {
		//FROM static context you cannot access instance members directly
		//System.out.println("Count: " + count);
		Counter c = new Counter();
		c.increment();
		c.count = 100;
		
		return objectCount;
	}
}

//static means shared
class Company {
	public static void register(String name) {
		
	}
}