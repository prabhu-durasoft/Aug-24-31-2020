public class Person {
	
	private String name;
	private int age;
	
	//getter() setter() methods or properties
	public String getName() {
		return name;
	}
	public void setAge(int value) {
		if(value > 1 && value < 100) {
			age = value;	
		}
	}
	
	public void setName(String value) {
		name = value;
	}
	
	public int getAge() {
		return age;
	}
	
	public Person(String theName, int theAge) {
		name = theName;
		age = theAge;
	}
	
	public void eat() {
		System.out.println(name + " is eating");
	}
	
	public void work() {
		System.out.println(name + " is working from home");
	}
}
