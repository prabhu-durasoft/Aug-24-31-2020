
public class SwitchUser {

	public static void main(String[] args) {
		Switch sw = new Switch();
		try {
			sw.turnOn();
			sw.turnOff();
		} catch (SwitchAlreadyOnException | SwitchAlreadyOffException e) {
			e.printStackTrace();
		}

	}

}
