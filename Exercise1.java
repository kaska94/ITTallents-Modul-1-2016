import java.util.Scanner;

public class Exercise1 {
	public static void main(String[] args) {

		double firstNumber, secondNumber, thirdNumber;
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter First number: (double or int)");
		firstNumber = scanner.nextDouble();

		System.out.println("Enter second number: (double or int)");
		secondNumber = scanner.nextDouble();

		System.out.println("Enter the third number: (double or int)");
		thirdNumber = scanner.nextDouble();

		if ((thirdNumber > firstNumber) && (thirdNumber < secondNumber)) {
			System.out
					.println("The " + thirdNumber + " number is between " + firstNumber + " and " + secondNumber + ".");
		} else {
			System.out.println(
					"The " + thirdNumber + " number is not between " + firstNumber + " and " + secondNumber + ".");
		}

	}
}
