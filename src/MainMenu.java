import java.util.Scanner;

public class MainMenu {
	/**
	 * 
	 * @param args Main method calling userChoices.
	 */
	public static void main(String[] args) {
		MainMenu menu = new MainMenu();
		menu.processUserChoices();
	}

	/**
	 * Prints menu.
	 */
	public void displayMenu() {
		System.out.println("-------------");
		System.out.println("1: Grade percentage");
		System.out.println("2: Maths table");
		System.out.println("3: Average, total, minimum, maximum");
		System.out.println("4:Exit");
		System.out.println("-------------");
	}

	/**
	 * Calls relevant choices and includes lower and upper bound variables.
	 */
	public void processUserChoices() {
		int choice;
		do {
			displayMenu();
			Scanner i = new Scanner(System.in);
			System.out.print("Enter a choice: ");
			choice = i.nextInt();
			if (choice == 1)
				Choice.score();
			if (choice == 2) {
				int lower;
				int upper;
				Scanner iLBound = new Scanner(System.in);
				System.out.println("Enter lower bound");
				lower = iLBound.nextInt();
				System.out.println("Enter upper bound");
				upper = iLBound.nextInt();
				Choice.bounds(lower, upper);
			}
			if (choice == 3)
				Choice.option3();
			if (choice == 4)
				Choice.option4();
			if ((choice != 1) && (choice != 2) && (choice != 3) && (choice != 4)) {
				System.out.println("~~~~~~~~~~~~~~~~~~~~~~");
				System.out.println("Type in correct number");
				System.out.println("~~~~~~~~~~~~~~~~~~~~~~");

			}
			/**
			 * Will loop until user exits.
			 */
		} while (choice != 4);

	}
}
