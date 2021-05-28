package items;

public class Subject extends SubjectDescription {
	
	protected String name;
	protected String shortDesc;
		
	public Subject(String name, String shortDesc, String longDesc) {
		super(longDesc);
		this.name = name;
		this.shortDesc = shortDesc;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getShortDesc() {
		return shortDesc;
	}

	public void setShortDesc(String shortDesc) {
		this.shortDesc = shortDesc;
	}
	
	public String getLongDesc() {
		return longDesc;
		
	}
	
	public void setLongDesc(String desc) {
		longDesc = desc;
	}

	@Override
	public String toString() {
		return "Subjects [name=" + name + ", shortDesc=" + shortDesc + ", longDesc=" + longDesc + "]";
	}
	
	
}