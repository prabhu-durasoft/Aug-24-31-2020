import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ExceptionHandlingKeywords {

	public static void main(String[] args) throws Exception {
		//5 keywords try, catch, finally, throw, throws
		
		//readContents();
		readContentsOfFile();
		System.out.println("End of main");
	}
	
	private static void readContentsOfFiles() throws IOException {
		FileReader reader = null;
		try {
			reader = new FileReader(new File("~/something.txt"));
			int i = 10;
			int q = 10/0;
			System.out.println(q);
			reader.read();
		}
		catch(FileNotFoundException | ArithmeticException ex) {
			System.out.println("error " + ex.getMessage());
		}
	}
	

	private static void readContentsOfFile() throws IOException {
		FileReader reader = null;
		try {
			reader = new FileReader(new File("~/something.txt"));
			reader.read();
		}
		catch(FileNotFoundException ex) {
			ex.printStackTrace();
			System.out.println(ex.getClass().getName());
			System.out.println("Error: " + ex.getMessage());
		}
		catch(Exception ex) {
			ex.printStackTrace();
			System.out.println(ex.getClass().getName());
			System.out.println("Error: " + ex.getMessage());
		}
		finally {
			reader.close();
		}
		System.out.println("End of readContentsOfFile");
	}
	
	
	private static void readContents() throws Exception {
		FileReader reader = new FileReader(new File("~/something.txt"));
		reader.read();
		reader.close();
	}

}
