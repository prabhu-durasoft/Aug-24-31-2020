
public class ArraysExample {

	public static void main(String[] args) {
		
		//Modern days, we don't use 2d arrays at all
		int[][] twoDim = new int[2][];
		int[] twoDime[] = new int[2][];
		int twoDimen[][] = new int[2][];
		
		
		int a = 10;
		int[] numbers = {1, 2, 3, 4, 5};
		int numbers2[] = {1, 2, 3, 4, 5};
		
		//you can modify the items in the collection
		for(int i=0;i<numbers.length;i++) {
			int elem = numbers[i];
			System.out.println(elem);
		}
		
		//foreach
		//readonly
		for (int item : numbers2) {
			System.out.println(item);
		}
		
		int[] items = new int[5];
		for (int i : items) {
			System.out.println(i);
		}
		
		String[] langs = new String[10];
		for (String lang : langs) {
			System.out.println(lang);
		}
	}

}
