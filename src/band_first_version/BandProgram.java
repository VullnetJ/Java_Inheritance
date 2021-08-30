package band_first_version;

import java.util.List;
import java.util.ArrayList;

public class BandProgram {

	public static void main(String[] args) {

		Guitarist firstPerformer = new Guitarist("Tommy Emmanuel");
		
		firstPerformer.play();
		firstPerformer.changeBrokenString();
		
		
		System.out.println("\n=== The band plays as below ===");
		
		List<Musician> bandMembers = new ArrayList<Musician>();
		
		bandMembers.add(new Guitarist("Gary Moore"));
		bandMembers.add(new Guitarist("Joan Jett"));
		bandMembers.add(new Drummer("John Bonham"));

		for (Musician musician : bandMembers) {
			musician.play();
		}		
	}
}
