/*
ID: YOUR_NAME
LANG: JAVA
TASK: friday
*/


import java.io.*;

public class friday {
	static final int START_YEAR = 1900;


	public static boolean isLeapYear (int year)
	{
		//
		// TODO: Implement this function to determine if a given year is a leap year.
		//
		return false;
	}

	public static void main(String[] args) throws Exception {

		// Represents the frequency of the 13th by day of the week.
		// 0 = Saturday, 1 = Sunday, ...
        int count[] = new int[7];
		
		BufferedReader input = new BufferedReader(new FileReader("friday.in"));
		int endYear = Integer.parseInt(input.readLine()) + START_YEAR - 1;
				
		// 0 = Saturday, 1 = Sunday, ...
		// January 1, 1900 was a Monday.
        int firstDayOfMonth = 2;  	

        // 1 = January, 2 = February, 3 = March, ...
		// -9999 is just a filler value.  We are not using the 0 position of the array.
        int[] days = new int[] { -9999, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

        // Go progressively through every month from the start year through the end year.
        for (int year = START_YEAR; year <= endYear; year++) {
            for (int month = 1; month <= 12; month++) {

            	// TODO
				// For each month, increment the appropriate position of the "count" array.
				// Then, determine the first day of the next month (based upon the length of the current month

			}
        }

		 PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("friday.out")));

        //
		// TODO
		// Print out the count array in the required format.
		//

		 out.close();
		 input.close();
	}
}
