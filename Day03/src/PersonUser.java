
public class PersonUser {

	public static void main(String[] args) {
		Person p1 = new Person("Sam", 12);
		System.out.println(p1.getName());
		p1.setName("Sam Thomas");
		System.out.println(p1.getAge());
		p1.setAge(-1000);
		//p1.age = -100;
		//System.out.println(p1.name + " , " + p1.age);
		p1.eat();
		p1.work();

	}

}
