import java.io.File;
import java.io.FileReader;

public class ExceptionHandling {

	public static void main(String[] args) {
		//java.lang.Exception
		//Two types of Exception
		//Checked (and) Unchecked Exceptions
		
		//All Exceptions that extend java.lang.Exception are checked exceptions
		//Exception classes that extend java.lang.RuntimeException are unchecked Exception
		int num = 10;
		int den = 0;
		int q = num/den; //Unchecked exception
		System.out.println(q);
		//ArithmeticException
		//FileNotFoundException
		
		//FileNotFoundException is an example of Checked Exception
//		FileReader reader = new FileReader(new File("~/something.txt"));
//		reader.read();
		
		
		System.out.println("Done");
		
		
	}

}
