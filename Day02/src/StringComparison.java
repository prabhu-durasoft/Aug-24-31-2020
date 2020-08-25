
public class StringComparison {

	public static void main(String[] args) {
		String lang1 = "Ruby";
		String lang2 = new String("Ruby");
		
		//== compares the references
		if(lang1 == lang2) {
			System.out.println("lang1 and lang2 are equal");
		}
		else {
			System.out.println("lang1 and lang2 are not equal");
		}
		
		String lang3 = "Ruby";
		System.out.println(lang1 == lang3);
		lang1 = "Ruby1";
		
		//USE one way of creation of strings
		//DO NOT USE == to compare the values of the strings
		//USE .equals() method to compare the values of the strings
		
		System.out.println(lang1.equals(lang2));

	}

}
