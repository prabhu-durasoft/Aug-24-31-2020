import java.util.ArrayList;

public class ThisKeyword {

	public static void main(String[] args) {
		Person sam = new Person("Sam", 12);
		sam.eat(); //Person.eat(sam);
		String name = sam.getName(); //Person.getName(sam)
		
		Person ram = new Person("Ram", 34);
		ram.eat(); //Person.eat(ram)
		
		sam.travel();
		ram.travel();
		
//		Hospital.report(sam);
//		Hospital.report(ram);
	}

}

class Hospital {
	private static ArrayList<Person> travellersList = new ArrayList<>();
	
	public static void report(Person person) {
		System.out.println("Covid test taken for " + person.getName());
		travellersList.add(person);
	}
}

//this keyword refers to the current calling object
class Person {
	private String name;
	private int age;
	
	
	public void travel() {
		Hospital.report(this);
	}
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void eat() {
		System.out.println(this.name + " is eating");
	}
	
	public static void doSomething() {
		//System.out.println(this.name);
	}
	
//	public Person(String theName, int theAge) {
//		name = theName;
//		age = theAge;
//	}
	
}
