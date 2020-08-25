
public class StringsExample {

	public static void main(String[] args) {
		//Immutable objects
		//USE operations on Strings sparingly
		//Every string manipulation results in creation of a new object
		//String Buffer
		
		String lang1 = "JavaScript"; //Looks like a primitive type, but it's not
		String lang2 = new String("Python");
		
		System.out.println(lang1);
		System.out.println(lang2);
		
		lang1 = "Ruby";
		lang1 += " is ";
		lang1 += " cool";
		System.out.println(lang1);
		
		
		String str = "";
		for (int i = 0; i < 5; i++) {
			str += i;
		}
		System.out.println(str);
		
		
		StringBuffer sb = new StringBuffer("");
		for (int i = 0; i < 5; i++) {
			sb.append(i);
		}
		System.out.println(sb.toString());
		
		
	}

}
