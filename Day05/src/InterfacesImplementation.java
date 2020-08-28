class Parent {
	class Child {
		class GrandChild {
			class GreatGrandChild {}
		}
	}
}


public class InterfacesImplementation {

	public static void main(String[] args) {
		Greetings greetings1 = new GreetingsImpl();
		greetings1.hi("Sam");

		//Inline implementation for the interface
		//Anonymous inner classes
		Greetings greetings2 = new Greetings() {
			public void hi(String name) {
				System.out.println("Hello " + name);
			}
		};
		greetings2.hi("Ram");
		
		Greetings greetings3 = new Greetings() {
			public void hi(String name) {
				System.out.println("Namaste " + name);
			}
		}; 
		greetings3.hi("Virat");
		
		
		Greetings greetings4 = new Greetings() {
			public void hi(String name) {
				System.out.println("Namaste " + name);
			}
		}; 
	}

}

interface Greetings {
	void hi(String name);
}

class GreetingsImpl implements Greetings {
	public void hi(String name) {
		System.out.println("Hi " + name);
	}
}

//class GreetingsImpl2 implements Greetings {
//	public void hi(String name) {
//		System.out.println("Hello " + name);
//	}
//}
//
//class GreetingsImpl3 implements Greetings {
//	public void hi(String name) {
//		System.out.println("Namaste " + name);
//	}
//}
