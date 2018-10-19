import java.util.Scanner;

public class MainMenu {

	public static void main(String[] args) {
		MainMenu menu = new MainMenu();
		menu.processUserChoices();
	}

	public void displayMenu() {
		System.out.println("-------------");
		System.out.println("Option 1");
		System.out.println("Option 2");
		System.out.println("Option 3");
		System.out.println("Exit 4");
		System.out.println("-------------");
	}

	public void processUserChoices() {
		int choice;
		do {
			displayMenu();
			Scanner i = new Scanner(System.in);
			System.out.print("Enter a choice: ");
			choice = i.nextInt();
			if (choice == 1)
				Choice.option1();
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
			if ((choice != 1) && (choice != 2) && (choice != 3) && (choice != 4))	{
				System.out.println("~~~~~~~~~~~~~~~~~~~~~~");
				System.out.println("Type in correct number");
				System.out.println("~~~~~~~~~~~~~~~~~~~~~~");
				
			}

		} while (choice != 4);

	}
}
