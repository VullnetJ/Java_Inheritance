package second_example;

public class Guitar {
	protected String model;

	public Guitar(String model) {
		this.model = model;
	}

	@Override
	public String toString() {
		return model;
	}
}
