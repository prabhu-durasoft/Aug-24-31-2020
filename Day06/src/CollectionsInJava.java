import java.util.*;

//javac --enable-preview --release 14 CollectionsInJava.java
public class CollectionsInJava {

	public static void main(String[] args) {
		//List, Set, Map
		
		List<String> cities = new ArrayList<>();
		cities.add("Chennai");
		cities.add("Pune");
		cities.add("Mumbai");
		cities.add("Chennai");
		System.out.println(cities.size());
		for (String city : cities) {
			System.out.println(city);
		}
		cities.forEach(System.out::println); //Java 8
		
		System.out.println();
		
		Set<String> langs = new HashSet<>();
		langs.add("Java");
		langs.add("Ruby");
		langs.add("Python");
		langs.add("Java");
		System.out.println(langs.size());
		for (String lang : langs) {
			System.out.println(lang);
		}
		langs.forEach(System.out::println); //Java 8
		
		
		Map<String, Integer> romanNumerals = new HashMap<>();
		romanNumerals.put("I", 1);
		romanNumerals.put("II", 2);
		romanNumerals.put("III", 3);
				
		System.out.println(romanNumerals.size());
		
		//DISCUSSED IN INTERMEDIATE JAVA 
		romanNumerals.forEach((k, v) -> System.out.println(k + ": " + v));  //Java 8
		
		Set<String> keys = romanNumerals.keySet();
		for (String key : keys) {
			System.out.println(key + ": " + romanNumerals.get(key));
		}
		
	}

}
