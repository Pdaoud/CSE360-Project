import java.util.UUID;

import javax.mail.internet.InternetAddress;

public class Doctor extends Person {

	private int threshold;

	public Doctor(String name, UUID id, InternetAddress email, String password) {
		super(name, id, email, password);
		this.setThreshold(0);
	}

	public int getThreshold() {
		return threshold;
	}

	public void setThreshold(int threshold) {
		this.threshold = threshold;
	}

}
