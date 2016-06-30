import java.util.Scanner;

public class Exercise3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		double firstNumber, secondNumber;
		double temp;	
		
		System.out.println("Enter First number: (double or int)");
		firstNumber = scanner.nextDouble();

		System.out.println("Enter Second number: (double or int)");
		secondNumber = scanner.nextDouble();
		
		System.out.println("Before Swap");
		System.out.println("firstNumber = "+ firstNumber);
		System.out.println("secondNumber = "+ secondNumber);
		
		temp = firstNumber;
		firstNumber = secondNumber;
		secondNumber = temp;
		
		System.out.println("After Swap");
		System.out.println("firstNumber = " + firstNumber);
		System.out.println("secondNumber = " + secondNumber);
	}
}
