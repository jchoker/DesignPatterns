package test;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import org.junit.jupiter.api.Test;

import iterator.SocialNetwork;
import iterator.Profile;


class IteratorTest {	

	/**
	 * The name of the file in which profiles are stored.
	 */
	private static final String USER_FILE ="users.txt";	

	@Test
	void testSocialNetwork() throws FileNotFoundException {

		SocialNetwork network = new SocialNetwork();
		readNetwork(network); // fill network from text file

		/* 
		 * Iteration over profiles list is encapsulated inside the iterator.
		 * The profiles list is not visible to the client which is external to iterator.
		 */
		// We can traverse the social network's profiles using for-each loop (which requires implementation of Iterable<Profile>)
		System.out.println("==========");
		System.out.println("Displaying all the social network's profiles in order:");

		for (Profile p : network) { System.out.println(p);}		

		// Alternatively, We can explicitly construct an iterator and go through it
		var iterator = network.iterator();
		while (iterator.hasNext()) {
			Profile c = iterator.next();
			if (c.lastName.equalsIgnoreCase("Potter"))
			{				
				System.out.println("\nFound Harry Potter's profile:");
				System.out.println(c.email);
				System.out.println(c.password);
				System.out.println(c.dob);
			}
		}
	}	

	/**
	 * Reads the users file and add profiles to network.
	 */
	private static void readNetwork(SocialNetwork network)
			throws FileNotFoundException {
		Scanner sc = new Scanner(new File(USER_FILE));
		while (sc.hasNextLine()) {
			String[] record = sc.nextLine().replaceAll(", ", ",").trim ().split(",");
			network.addProfile(record[1], record[0], record[2], record[3], record[4]);
		}
		sc.close();
	}
}
