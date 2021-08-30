package band_first_version;

public abstract class Musician {
	// Child classes can directly inherit the name field
	protected String name;

	public Musician() {
		this.name = "Unknown";
	}
	
	public Musician(String name) {
		this.name = name;
	}
	
	// An abstract method => A child class MUST implement this method
	public abstract void play();
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
