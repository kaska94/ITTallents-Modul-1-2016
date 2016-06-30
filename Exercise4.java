import java.util.Scanner;

public class Exercise4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		double firstNumber, secondNumber;

		System.out.println("Enter First number: (double or int)");
		firstNumber = scanner.nextDouble();

		System.out.println("Enter Second number: (double or int)");
		secondNumber = scanner.nextDouble();

		if (firstNumber > secondNumber) {
			System.out.println(secondNumber + " , " + firstNumber);
		} else {
			if (firstNumber < secondNumber) {
				System.out.println(firstNumber + " , " + secondNumber);
			} else {
				System.out.println("Even: " + firstNumber + " ," + secondNumber);
			}
		}
	}

}
