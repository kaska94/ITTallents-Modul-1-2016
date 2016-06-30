import java.util.Scanner;

public class Exercise2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int firstNumber, secondNumber;
		double firstDoubleNumber, secondDoubleNumber;

		System.out.println("Enter first number(int);");
		firstNumber = scanner.nextInt();

		System.out.println("Enter second number(int);");
		secondNumber = scanner.nextInt();

		System.out.println(firstNumber + " + " + secondNumber + " = " + (firstNumber + secondNumber));
		System.out.println(firstNumber + " - " + secondNumber + " = " + (firstNumber - secondNumber));
		System.out.println(firstNumber + " * " + secondNumber + " = " + (firstNumber * secondNumber));
		System.out.println(firstNumber + " / " + secondNumber + " = " + (firstNumber / secondNumber));
		System.out.println(firstNumber + " % " + secondNumber + " = " + (firstNumber % secondNumber));

		System.out.println("Now enter first number(double)");
		firstDoubleNumber = scanner.nextDouble();

		System.out.println("Now enter second number(double)");
		secondDoubleNumber = scanner.nextDouble();

		System.out.println(
				firstDoubleNumber + " + " + secondDoubleNumber + " = " + (firstDoubleNumber + secondDoubleNumber));
		System.out.println(
				firstDoubleNumber + " * " + secondDoubleNumber + " = " + (firstDoubleNumber * secondDoubleNumber));
		System.out.println(
				firstDoubleNumber + " - " + secondDoubleNumber + " = " + (firstDoubleNumber - secondDoubleNumber));
		System.out.println(
				firstDoubleNumber + " / " + secondDoubleNumber + " = " + (firstDoubleNumber / secondDoubleNumber));
		System.out.println(
				firstDoubleNumber + " % " + secondDoubleNumber + " = " + (firstDoubleNumber % secondDoubleNumber));

	}
}
