
public class PassByRef {

	public static void main(String[] args) {
		int x = 10;
		increment(x); //Pass by value
		System.out.println(x);
		
		int[] numbers = {1, 2, 3 };
		incrementArray(numbers); //Pass by ref
		for (int num : numbers) {
			System.out.println(num);
		}
		
		int myAge = 50;
		storeAgeInDB(myAge);
		
		String[] nameOf5Participants = new String[5];
		populateNamesFromZoom(nameOf5Participants);
		System.out.println(nameOf5Participants);
		
	}
	static void populateNamesFromZoom(String[] names) {
		//go to ZOOM
		//find out the participants
		//take 5 participants names
		//store in names variable
	}
	
	static void storeAgeInDB(int age) {
		
	}
	
	static void incrementArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			arr[i] = arr[i] + 1;
		}
	}
	
	static void increment(int number) {
		number++;
	}

}
