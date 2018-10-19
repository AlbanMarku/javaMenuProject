import java.util.Scanner;

public class Choice {

	public static void option1() {
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
		for (int x = lower; x <= upper; x++) {
			double squared = Math.pow(x, 2);
			double cube = Math.pow(x, 3);
			double squareRoot = Math.sqrt(x);
			System.out.println(squared);
			System.out.println(cube);
			System.out.println(squareRoot);
		}

	}

	public static void option3() {
		System.out.println("Executing option 3");
	}

	public static void option4() {
		System.out.println("Shutting down");
	}

}
