package band_first_version;

public class Guitarist extends Musician {
	// The name field is inherited from the parent class
	
	public Guitarist(String name) {
		this.name = name;
	}

	// Here we implement the concrete play method
	@Override
	public void play() {
		System.out.println("Guitarist " + name + " plays: pling");
	}
	
	public void changeBrokenString() {
		System.out.println(name + " changes a broken string");
	}
}
