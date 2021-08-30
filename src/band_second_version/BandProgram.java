package band_second_version;

import java.util.List;
import java.util.ArrayList;

public class BandProgram {

	public static void main(String[] args) {

		List<Musician> bandMembers = new ArrayList<Musician>();

		System.out.println("=== The band plays as below ===");
		bandMembers.add(new Guitarist("Gary Moore"));
		bandMembers.add(new Guitarist("Joan Jett"));
		bandMembers.add(new Drummer("John Bonham"));

		for (Musician musician : bandMembers) {
			musician.play();
		}
	}
}
