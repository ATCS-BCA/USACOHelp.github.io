
/*
ID: YOUR_NAME
LANG: JAVA
TASK: gift1
*/

import java.io.*;
import java.util.HashMap;
import java.util.StringTokenizer;


public class gift1 {

	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new FileReader("gift1.in"));
		int np = Integer.parseInt(in.readLine());	// "Number of People" -- first number in file.

		int[] dollars = new int[np];			// Array to track dollars for each person.
		String[] names = new String[np];		// Array to track the names of each person.
		HashMap<String, Integer> nameMap = new HashMap<String, Integer>();	// Dictionary for finding "index" of person quickly

		//
		// TODO
		// We will code a for loop here together to fill dollars, names, and nameMap
		//


		String giver = in.readLine();  // Read the name of the first giver
		while (giver != null) {
			StringTokenizer st = new StringTokenizer(in.readLine(), " ");
			int totalGift = Integer.parseInt(st.nextToken());		// Read total dollars
			int recipients = Integer.parseInt(st.nextToken());		// Read number of recipients

			//
			// TODO
			// Distribute the gifts from this giver here
			// Use int index = nameMap.get(name) to lookup the index of the person in the two arrays
			//

			giver = in.readLine();		// Read the name of the next giver.
		}
		
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("gift1.out")));

		//
		// TODO
		// Print out the name's of the people along with their ending amounts pairs
		//

		out.close();
		in.close();
	}
}
