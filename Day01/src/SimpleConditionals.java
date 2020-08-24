public class SimpleConditionals {

	public static void main(String[] args) {
		int i  = 10;
		if(i % 2 == 0) {
			System.out.println(i + " is even");
		}
		else if (i % 2 != 0) {
			System.out.println(i + " is odd");
		}
		else {
			System.out.println("I don't know what this number is ");
		}
		
		int count = 0;
		while(count < 5) {
			System.out.println("Count: " + count);
			count++;
		}
		
		for (int j = 0; j < args.length; j++) {
			System.out.println(args[j]);
		}
		
	}

}
