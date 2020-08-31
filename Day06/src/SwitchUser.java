//log4j or sl4j
public class SwitchUser {

	public static void main(String[] args) {
		Switch sw = new Switch();
		try {
			sw.turnOn();
			sw.turnOff();
		} catch (SwitchAlreadyOnException | SwitchAlreadyOffException e) {
			e.printStackTrace();
			//logger.info("") or logger.warn("")
		}

	}

}
