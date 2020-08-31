import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;

public class MiscPackages {

	public static void main(String[] args) throws URISyntaxException, IOException, Exception {
//		URI uri = new URI("https://intuit.com");
//		//URL url = new URL (, host, port, file, handler);
//
//		
//		//Paths, Files
//		
//		List<String> lines = Files.readAllLines(Paths.get("~/something.txt"));
		
		//WE DON'T USE IT LIKE THIS IN PROJECTS
		//JDBC API
		Class.forName("com.mysql.jdbc.Driver");
		//DataSource
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/training", "root", "durasoft");
		Statement statement = connection.createStatement();
		ResultSet rs =  statement.executeQuery("select * from persons");
		while(rs.next()) {
			System.out.println(rs.getInt("id") + ", " + rs.getString("name") + ", " + rs.getInt("age"));
		}
		statement.close();
		connection.close();
		
	}

}
