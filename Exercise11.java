import java.util.Scanner;

public class Exercise11 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int number;

		System.out.println("Enter first number(int);");
		number = scanner.nextInt();
		if (!((number >= 100) && (number < 999))) {
			System.out.println("Number needs to be between 100 and 999");
			return;
		}
		int firstNumberInNumber = (number / 100);
		int secondNumberInNumber = (number % 100) / 10;
		int thirdNumberInNumber = (number % 10);

		if ((firstNumberInNumber != 0) && (secondNumberInNumber != 0) && (thirdNumberInNumber != 0)) {
			if (((number % firstNumberInNumber) == 0) && ((number % secondNumberInNumber) == 0)
					&& ((number & thirdNumberInNumber) == 0)) {
				System.out.println("The number can be devided with every digit in it");
			} else {
				System.out.println("The number can't be devided with every digit in it");
			}
		} else {
			System.out.println("Number must not contain 0");
			return;
		}
		
	}
}
