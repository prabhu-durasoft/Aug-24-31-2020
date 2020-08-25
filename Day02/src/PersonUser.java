
public class PersonUser {

	public static void main(String[] args) {
		Person p1 = null;
		System.out.println(p1);
		
		//p2 is a Person class variable
		//p2 is an instance of Person
		//p2 is a Person class object
		//p2 is a reference to a Person class object 
		Person p2 = new Person();
		System.out.println(p2);
		
		Person p3 = new Person();
		System.out.println(p3);
		
		Person p4 = p3;
		
		//We are creating an instance of Person class called sam using a default no-args constructor
		Person sam = new Person();
		sam.name = "Sam";
		sam.age = 40;
		sam.single = false;
		sam.eat();
		
		Person ram = new Person();
		ram.name = "Ram";
		ram.age = 10;
		ram.single = true;
		ram.eat();
		
		Person mary = new Person();
		
		
		
		
		
		
		
		
		
		
		
	}

}
