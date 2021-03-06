public class Form {

	public enum Scale {
		ONE(1), TWO(2), THREE(3), FOUR(4), FIVE(5), SIX(6), SEVEN(7), EIGHT(8), NINE(
				9), TEN(10);

		private final int value;

		private Scale(int value) {
			this.value = value;
		}

		public int getValue() {
			return value;
		}
	}

	public enum Status {
		PENDING, COMPLETED;
	}

	private final Scale nausea;
	private final Scale pain;
	private final Scale fatigue;
	private final Scale anxiety;
	private final Scale shortnessOfBreath;
	private final String comments;
	private Status status;
	private String diagnosis;

	public Form(Scale nausea, Scale pain, Scale fatigue, Scale anxiety,
			Scale shortnessOfBreath, String comments) {
		this.nausea = nausea;
		this.pain = pain;
		this.fatigue = fatigue;
		this.anxiety = anxiety;
		this.shortnessOfBreath = shortnessOfBreath;
		this.comments = comments;
		this.setStatus(Status.PENDING);
		this.setDiagnosis(null);
	}

	public Scale getNausea() {
		return nausea;
	}

	public Scale getPain() {
		return pain;
	}

	public Scale getFatigue() {
		return fatigue;
	}

	public Scale getAnxiety() {
		return anxiety;
	}

	public Scale getShortnessOfBreath() {
		return shortnessOfBreath;
	}

	public String getComments() {
		return comments;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public String getDiagnosis() {
		return diagnosis;
	}

	public void setDiagnosis(String diagnosis) {
		this.diagnosis = diagnosis;
	}

}
