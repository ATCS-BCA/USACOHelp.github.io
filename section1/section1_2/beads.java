/*
ID: YOUR_NAME
LANG: JAVA
TASK: beads
*/

import java.io.*;


public class beads {

	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new FileReader("beads.in"));
		int len = Integer.parseInt(in.readLine());

		// read the list of beads into an array of characters
		char[] beads = in.readLine().toCharArray();

		// longest length of beads so far.
		int longest = 0;

		//
		// TODO: Implement the logic here.  This can be a challenging one!
		//

		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("beads.out")));
		
		out.println(longest);
		out.close();
		in.close();
	}
}
