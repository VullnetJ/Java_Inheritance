package second_example;

public class ElectricGuitar extends Guitar {
	// The 'model' field is inherited from the superclass
	private String pickups;
	
	public ElectricGuitar(String model, String pickups) {
		super (model);    // Invoke the superclass' constructor
		this.pickups = pickups;
	}

	public void plugIntoAnAmplifier () {
		System.out.println(model + " is plugged into an amplifier");
	}
	
	@Override
	public String toString() {
		return model + ", " + pickups;
	}
}
