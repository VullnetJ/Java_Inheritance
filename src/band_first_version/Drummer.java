package band_first_version;

public class Drummer extends Musician {
	// The name field is inherited from the parent class
	
	public Drummer(String name) {
		this.name = name;
	}

	// Here we implement the concrete play method
	@Override
	public void play() {
		System.out.println("Drummer " + name + " plays: ba-dum-bum");
	}
}
