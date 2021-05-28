package items;

public abstract class SubjectDescription {
	
	
	protected String longDesc;
	
	public SubjectDescription(String longDesc) {
		super();

		this.longDesc = longDesc;
	}

	// Getters and Setters:

	public String getLongDesc() {
		return longDesc;
	}

	public void setLongDesc(String longDesc) {
		this.longDesc = longDesc;
	}

	// Overriden toString method
	public String toString() {
		return "Fixture [longDesc=" + longDesc + "]";
	}
}