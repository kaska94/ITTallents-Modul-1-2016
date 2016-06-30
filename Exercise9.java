import java.util.Scanner;

public class Exercise9 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int firstNumber, secondNumber;

		System.out.println("Enter first number(int);");
		firstNumber = scanner.nextInt();
		if (!((firstNumber >= 10) && (firstNumber < 99))) {
			System.out.println("Number needs to be between 10 and 99");
			return;
		}

		System.out.println("Enter second number(int);");
		secondNumber = scanner.nextInt();
		if (!((secondNumber >= 10) && (secondNumber < 99))) {
			System.out.println("Number needs to be between 10 and 99");
			return;
		}

		int multiplication = firstNumber * secondNumber;

		int lastNumber = multiplication % 10;
		// can be done with %
		if ((multiplication & 1) == 0) {
			System.out.println(multiplication + " , " + lastNumber + " ,Even");
		} else {
			System.out.println(multiplication + " , " + lastNumber + " ,Odd");
		}

	}
}
