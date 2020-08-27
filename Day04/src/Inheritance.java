public class Inheritance {

	public static void main(String[] args) {
		//java.lang.Object is the base class for all the classes
		
		String s1 = "java";
		String s2 = "javascript";
		s1.equals(s2);
		final double PI = 3.14;
		//PI = 3.1414;
		Base base1 = new Derived();
		Base base2 = new Derived();
		base1.doSomething();
		base2.doSomething();
		//base1.hello();
		base1.bye();
		base1.equals(base2);
	}

}
//class NewClass extends Base, Derived {
//	
//}
final class A {}
//class B extends A {}

//final classes cannot be extended 
//private methods are not overridden
//final methods cannot be overridden
class Base {
	private void hello() {
	}
	public void doSomething() {
		System.out.println("***Base doSomething()");
	}
	public final void bye() {
		System.out.println("---Base bye");
	}
}

class Derived extends Base {
	
//	public void bye() {
//		System.out.println("---Derived bye");
//	}
	public void doSomething() {
		System.out.println("***Derived doSomething()");
	}
}