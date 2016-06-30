import java.util.Scanner;

public class Exercise5 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		double firstNumber, secondNumber, thirdNumber;

		System.out.println("Enter First number: (double or int)");
		firstNumber = scanner.nextDouble();

		System.out.println("Enter Second number: (double or int)");
		secondNumber = scanner.nextDouble();

		System.out.println("Enter Third number: (double or int)");
		thirdNumber = scanner.nextDouble();

		if (firstNumber > secondNumber) {
			if (thirdNumber > firstNumber) {
				// c > a > b
				System.out.println(thirdNumber + ", " + firstNumber + ", " + secondNumber);
			} else {
				if (secondNumber > thirdNumber) {
					// a > b > c
					System.out.println(firstNumber + ", " + secondNumber + ", " + thirdNumber);
				} else {
					// a > c > b
					System.out.println(firstNumber + ", " + thirdNumber + ", " + secondNumber);
				}
			}
		} else {
			// b > a
			if (thirdNumber > secondNumber) {
				// c > b > a
				System.out.println(thirdNumber + ", " + secondNumber + ", " + firstNumber);
			} else {
				if (thirdNumber > firstNumber) {
					// b > c > a
					System.out.println(secondNumber + ", " + thirdNumber + ", " + firstNumber);
				} else {
					// b > a > c
					System.out.println(secondNumber + ", " + firstNumber + ", " + thirdNumber);
				}
			}
		}
	}
}
