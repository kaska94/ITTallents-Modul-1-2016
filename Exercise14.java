import java.util.Scanner;

public class Exercise14 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int rowFirst, columnFirst;
		int rowSecond, columnSecond;

		boolean isEvenRowFirstNumber = false;
		boolean isEvenRowSecondNumber = false;

		boolean isEvenColumnFirstNumber = false;
		boolean isEvenColumnSecondNumber = false;

		System.out.println("Enter row (int)(1-8).");
		rowFirst = scanner.nextInt();

		System.out.println("Enter column (int)(1-8).");
		columnFirst = scanner.nextInt();
		if (!(((rowFirst >= 1) && (rowFirst <= 8)) && ((columnFirst >= 1) && (columnFirst <= 8)))) {
			System.out.println("Column and row must be between 1-8");
			return;
		}

		System.out.println("Enter row (int)(1-8).");
		rowSecond = scanner.nextInt();

		System.out.println("Enter column (int)(1-8).");
		columnSecond = scanner.nextInt();
		if (!(((rowSecond >= 1) && (rowSecond <= 8)) && ((columnSecond >= 1) && (columnSecond <= 8)))) {
			System.out.println("Column and row must be between 1-8");
			return;
		}
		/*
		 *  if rows of the numbers and columns of the numbers are even
		 *  if rows are even => check if columns are even => same color
		 *  				 => if not => diffrent color
		 *  if rows are not even (one may be even)
		 *  				 => check if columns are even => difrent color
		 *  				 => if not => same color
		 *  Can be done in smarter way
		 */
		
		if ((rowFirst & 1) == 0) {
			isEvenRowFirstNumber = true;
		}
		if ((rowSecond & 1) == 0) {
			isEvenRowSecondNumber = true;
		}

		if ((columnFirst & 1) == 0) {
			isEvenColumnFirstNumber = true;
		}
		if ((columnSecond & 1) == 0) {
			isEvenColumnSecondNumber = true;
		}

		if (isEvenRowFirstNumber == isEvenRowSecondNumber) {
			if (isEvenColumnFirstNumber == isEvenColumnSecondNumber) {
				System.out.println("Same color");
			} else {
				if (isEvenColumnFirstNumber != isEvenColumnSecondNumber) {
					System.out.println("Diffrent color");
				}
			}
		} else if (isEvenRowFirstNumber != isEvenRowSecondNumber) {
			if (isEvenColumnFirstNumber == isEvenColumnSecondNumber) {
				System.out.println("Diffrent color");
			} else {
				if (isEvenColumnFirstNumber != isEvenColumnSecondNumber) {
					System.out.println("Same color");
				}
			}
		}

	}
}
