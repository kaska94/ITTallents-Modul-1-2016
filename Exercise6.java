import java.util.Scanner;

public class Exercise6 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		double a1, a2, a3, temp;

		System.out.println("Enter First number: (double or int)");
		a1 = scanner.nextDouble();

		System.out.println("Enter Second number: (double or int)");
		a2 = scanner.nextDouble();

		System.out.println("Enter Third number: (double or int)");
		a3 = scanner.nextDouble();

		System.out.println("Before Swap");
		System.out.println("a1 = " + a1);
		System.out.println("a2 = " + a2);
		System.out.println("a1 = " + a3);

		temp = a1;
		a1 = a2;
		a2 = a3;
		a3 = temp;

		System.out.println("After Swap");
		System.out.println("a1 = " + a1);
		System.out.println("a2 = " + a2);
		System.out.println("a1 = " + a3);

	}
}
