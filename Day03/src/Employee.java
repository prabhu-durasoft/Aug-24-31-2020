import java.time.LocalDateTime;

//base class or super class or parent class
public class Employee {
	private String name;

	public Employee(String theName) {
		name = theName;
	}
	
	public void work(int hours) {
		System.out.println("Employee " + name + " works " + hours + " hours");
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void swipe() {
		System.out.println("==== Employee " + getName() + " swipes in at " + LocalDateTime.now());
	}
	
}
//derived class or sub class or child class
class Manager extends Employee {
	private int level;

	public Manager(String name, int theLevel) {
		//FIRST LINE SHOULD BE A CALL TO BASE CLASS CONSTRUCTOR
		super(name); 
		level = theLevel;
	}
	
	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}
	
	public void swipe() {
		System.out.println("==== Manager " + getName() + " swipes in at " + LocalDateTime.now());
	}
	
}

class Director extends Manager {
	private int salesTarget;
	public Director(String name, int level, int st) {
		super(name, level);
		salesTarget = st;
	}
	public void swipe() {
		System.out.println("==== Director " + getName() + " swipes in at " + LocalDateTime.now());
	}
}

class VP extends Employee {
	private long stockOptions;
	
	public VP(String name, long esop) {
		super(name);
		stockOptions = esop;
	}

	public long getStockOptions() {
		return stockOptions;
	}
	
	public void swipe() {
		System.out.println("==== VP " + getName() + " swipes in at " + LocalDateTime.now());
	}
	
}
