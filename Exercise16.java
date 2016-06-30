import java.util.Scanner;

public class Exercise16 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int number;

		System.out.println("Enter number(int);");
		number = scanner.nextInt();
		if (!((number >= 100) && (number < 999))) {
			System.out.println("Number needs to be between 100 and 999");
			return;
		}

		int firstNumberInNumber = (number / 100);
		int secondNumberInNumber = (number % 100) / 10;
		int thirdNumberInNumber = (number % 10);
		if ((firstNumberInNumber == secondNumberInNumber) && (secondNumberInNumber == thirdNumberInNumber)) {
			System.out.println("Even numbers");
		} else {
			if ((firstNumberInNumber > secondNumberInNumber) && (secondNumberInNumber > thirdNumberInNumber)) {
				System.out.println("Ascending");
			} else {
				if ((firstNumberInNumber < secondNumberInNumber) && (secondNumberInNumber < thirdNumberInNumber)) {
					System.out.println("Decending");
				} else {
					System.out.println("Not in order!");
				}
			}
		}

	}

}
