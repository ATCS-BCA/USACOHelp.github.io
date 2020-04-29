
/*
ID: YOUR_NAME
LANG: JAVA
TASK: ride
*/

import java.io.*;

class ride {
  public static void main (String [] args) throws IOException {
    BufferedReader f = new BufferedReader(new FileReader("ride.in"));
    PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("ride.out")));

    // line1 is an array representing the first line in the file
    char[] line1 = f.readLine().toCharArray();

    // line2 is an array representing the first line in the file
    char[] line2 = f.readLine().toCharArray();

    // Your code goes here.
    // It should print "GO" or "STAY" depending on some math....

    out.close();                                  
  }
}