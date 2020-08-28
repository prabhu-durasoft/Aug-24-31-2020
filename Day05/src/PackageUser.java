import com.intuit.training.day05.Friday;
import com.intuit.training.day05.HelloWorld;
import static com.intuit.training.day05.Weekend.*;

import org.json.JSONObject;

//import com.intuit.training.day05.*;

public class PackageUser {

	public static void main(String[] args) {
		HelloWorld hw = new HelloWorld();
		Friday tgif = new Friday();
		JSONObject obj = new JSONObject();
		
//		Weekend.party();
//		Weekend.runMarathon();
//		Weekend.bingeWatch();
//		Weekend.sleepALot();
		party();
		runMarathon();
		bingeWatch();
		sleepALot();
	}

}
