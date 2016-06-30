import java.util.Scanner;

public class Exercise8 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int number;

		System.out.println("Enter first number(int);");
		number = scanner.nextInt();
		if (!((number >= 1000) && (number < 9999))) {
			System.out.println("Number needs to be between 1000 and 9999");
			return;
		}
		
		// getting the digits
		int firstDigitInNumber = (number / 1000);
		int secondDigitInNumber = (number % 1000) / 100;
		int thirdDigitInNumber = (number % 100) / 10;
		int fourthDigitInNumber = (number % 10);
		
		int firstNumberToCompare = (firstDigitInNumber * 10) + thirdDigitInNumber;
		int secondNumberToCompare = (secondDigitInNumber * 10) + fourthDigitInNumber;
		if (firstNumberToCompare > secondNumberToCompare) {
			System.out.println(firstNumberToCompare + " > " + secondNumberToCompare );
		} else {
			if (firstNumberToCompare < secondNumberToCompare) {
				System.out.println(firstNumberToCompare + " < " + secondNumberToCompare);
			} else {
				System.out.println("Even: " + firstNumberToCompare + " = " + secondNumberToCompare);
			}
		}
	}
}
