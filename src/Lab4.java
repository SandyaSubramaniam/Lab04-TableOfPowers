import java.util.Scanner;

public class Lab4 {

	public static void main(String[] args) {

		System.out.println("Learn your squares and cubes!");

		Scanner scnr = new Scanner(System.in);

		char userchoice = 'Y';

		do {
			System.out.println("Enter an integer: ");

			int n = scnr.nextInt();

			System.out.printf("%10s %10s %10s\n", "Number", "Squared", "Cubed");
			System.out.printf("%10s %10s %10s\n", "======", "======", "======");

			for (int i = 1; i <= n; i++) {

				int numberSquared = (int) Math.pow(i, 2);
				int numberCubed = (int) Math.pow(i, 3);

				System.out.printf("%10s %10s %10s\n", i, numberSquared, numberCubed);

			}

			multTable(n);

			System.out.println("Would you like to continue(y/n)");

			userchoice = scnr.next().charAt(0);

		} while ((userchoice == 'Y') || (userchoice == 'y'));

		System.out.println("Goodbye!");
		scnr.close();

	}

	public static void multTable(int num) {

		System.out.println(" ");
		System.out.println("Multiplication Table");
		for (int row = 1; row <= num; row++) {
			if (row == 1) {// Print formatted Col header
				System.out.printf("%11s", " ");
				for (int col = 1; col <= num; col++) {
					System.out.printf("%10d", col);
				}
				System.out.println();

				System.out.printf("%11s", " ");
				for (int col = 1; col <= num; col++) {
					System.out.printf("%10s", "=");
				}
				System.out.println();
			}

			// Print formatted Row Header
			System.out.printf("%10d|", row);
			for (int col = 1; col <= num; col++) {
				System.out.printf("%10d", (row * col));
			}
			System.out.println();
		}

	}

	public boolean nearHundred(int n) {
		if ((Math.abs(100 - 10) <= n && Math.abs(100 + 10) >= n)
				|| (Math.abs(200 - 10) <= n && Math.abs(200 + 10) >= n)) {
			return true;
		} else {
			return false;
		}
	}

}