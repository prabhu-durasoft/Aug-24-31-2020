import java.util.ArrayList;

public class WrapperClasses {

	public static void main(String[] args) {
		int rnd = (int)Math.random();
		int i = 10;
		boolean b = false;
		
		String str = "1234";
		//int strInt = (int)str;
		int strInt = Integer.parseInt(str);
		
		String str2 = "3.1456";
		//double strDouble = (double)str;
		double strDouble = Double.parseDouble(str2);
		
		String str3 = "true";
		boolean strBoolean = Boolean.parseBoolean(str3);
		
		Float.parseFloat("");
		String str4 = "a";
		char ch = str4.length() == 1 ? str4.charAt(0) : ' ' ; //ternary operator
		
		//Autoboxing
		//Integer, Double, Float, Character, Boolean are called Wrapper classes
		
		//Takes the copy of i, adds a box around it on the heap
		Integer iObj = i;
		i++;
		System.out.println(i);
		System.out.println(iObj.intValue());
		
		Boolean bObj = b;
		System.out.println(bObj.booleanValue());
		
		double pi = 3.14;
		Double piObj = pi;
		System.out.println(piObj.doubleValue());
		
		char ch1 = 'a';
		Character chObj = ch1;
		System.out.println(chObj.charValue());
		
		float dec = 12.34f;
		Float decObj = dec;
		System.out.println(decObj.floatValue());
		
		ArrayList<Integer> numbers = new ArrayList<>();
		numbers.add(1);
		numbers.add(2);
		
		
		int number = 10;
		Integer numberObj = number;
		int anotherVariable = numberObj; //Automatically unboxed
		System.out.println(anotherVariable);
		
		
		
		
	}

}
