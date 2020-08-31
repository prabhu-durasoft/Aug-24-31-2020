public class Switch {
	private boolean position;
	
	public void turnOn() throws SwitchAlreadyOnException {
		if(position) {
			throw new SwitchAlreadyOnException("Switch is on");
		}
		position = true;
	}
	
	public void turnOff() throws SwitchAlreadyOffException {
		if(!position) {
			throw new SwitchAlreadyOffException("Switch is off");
		}
		position = false;
	}
}

class SwitchAlreadyOnException extends Exception {
	public SwitchAlreadyOnException(String message) {
		super(message);
	}
}

class SwitchAlreadyOffException extends Exception {
	public SwitchAlreadyOffException(String message) {
		super(message);
	}
}