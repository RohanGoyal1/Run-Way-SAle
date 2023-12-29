package Utilites;

import java.util.Random;

public class JavaUtilities {
	public int generateRandom(int range) {
		Random random = new Random(range);
		int ranNumber = random.nextInt();
		return ranNumber;
	}
	

	
	
	
}
