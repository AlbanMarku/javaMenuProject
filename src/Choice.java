import java.util.Scanner;

public class Choice {
/**
 * Calculates what grade the percentage is by comparing if values fall in a range.
 */
	public static void score() {
		int gradeNumber = 0;
		Scanner iGrade = new Scanner(System.in);
		System.out.println("Enter a number:");
		do {
			/**
			 * Prints only when value is invalid.
			 */
			if ((gradeNumber < 0) || (gradeNumber > 100)) {
				System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
				System.out.println("Invalid percentage. Try again.");
				System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			}

			gradeNumber = iGrade.nextInt();
		} while ((gradeNumber < 0) || (gradeNumber > 100));
		if (gradeNumber < 40)
			System.out.println("E");
		else if (gradeNumber > 39 && gradeNumber <= 49)
			System.out.println("D");
		else if (gradeNumber > 49 && gradeNumber <= 59)
			System.out.println("C");
		else if (gradeNumber > 59 && gradeNumber <= 69)
			System.out.println("B");
		else if (gradeNumber > 69 && gradeNumber <= 100)
			System.out.println("A");
	}
/**
 * 
 * @param lower generated when user is asked for lower bound.
 * @param upper generated when user is asked for higher bound.
 */
	public static void bounds(int lower, int upper) {
		if (upper <= lower) {
			/**
			 * Error message.
			 */
			System.out.println("~~~~~~~~~~~~~~~~~~~~~");
			System.out.println("Type in valid numbers");
			System.out.println("~~~~~~~~~~~~~~~~~~~~~");
		}
/**
 * Calculates the values and arranges them into a table.
 */
		System.out.println("Value" + "\t" + "Sqaure" + "\t" + "Cube" + "\t" + "Square Root");
		for (int x = lower; x <= upper; x++) {
			double value = x;
			double squared = Math.pow(x, 2);
			double cube = Math.pow(x, 3);
			double squareRoot = Math.sqrt(x);
			System.out.format("%.2f", value);
			System.out.print("\t");
			System.out.format("%.2f", Math.pow(x, 2));
			System.out.print("\t");
			System.out.format("%.2f", Math.pow(x, 3));
			System.out.print("\t");
			System.out.format("%.2f%n", Math.sqrt(x));
		}

	}
/**
 * Method calculating min, max, etc.
 */
	public static void option3() {
		double total = 0;
		double average = 0;
		int minimum = 0;
		int maximum = 0;
		int number = 0;
		int count = 0;

		boolean terminate = false;

		while (terminate == false) {
			Scanner userNumber = new Scanner(System.in);
			System.out.println("Enter a number or enter ''-1'' to finish.");
			number = userNumber.nextInt();
			/**
			 * Adds one to the count every time an input is detected.
			 */
			count++;
/**
 * Terminates the process if true.
 */
			if (number == -1)
				terminate = true;

			if (count == 1) {
				minimum = number;
				maximum = number;
			}

			if (number != -1) {
/**
 * Determines if values are maximum or minimum.
 */
				if (number < minimum)
					minimum = number;

				if (number > maximum)
					maximum = number;
/**
 * Calculations are made.
 */
				total = total + number;
				average = total / count;
			}
		}
/**
 * Prints final calculations.
 */
		System.out.println("total=" + total);
		System.out.println("average=" + average);
		System.out.println("Minimum=" + minimum);
		System.out.println("Maximum=" + maximum);
	}
/**
 * Exit message.
 */
	public static void option4() {
		System.out.println("Shutting down");
	}

}
