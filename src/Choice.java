import java.util.Scanner;

public class Choice {

	public static void score() {
		int gradeNumber = 0;
		Scanner iGrade = new Scanner(System.in);
		System.out.println("Enter a number:");
		do {
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

	public static void bounds(int lower, int upper) {
		if (upper <= lower) {
			System.out.println("~~~~~~~~~~~~~~~~~~~~~");
			System.out.println("Type in valid numbers");
			System.out.println("~~~~~~~~~~~~~~~~~~~~~");
		}

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

	public static void option3() {
		int total = 0;
		int average = 0;
		int minimum = 0;
		int maximum = 0;
		int number = 0;
		int count = 0;

		boolean terminate = false;

		while (terminate == false) {
			Scanner userNumber = new Scanner(System.in);
			System.out.println("Enter a number or enter ''-1'' to finish.");
			number = userNumber.nextInt();
			if (number != -1)
				count++;

			if (number == -1)
				terminate = true;

			else {
				total = total + number;
				average = total / count;
			}
		}

		System.out.println("total=" + total);
		System.out.println("average=" + average);
	}

	public static void option4() {
		System.out.println("Shutting down");
	}

}
