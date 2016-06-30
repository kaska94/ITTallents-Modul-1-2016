import java.util.Scanner;

public class Exercise10 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int firstNumber;
		int closestToNumber;
		int remainder;
		int allBuckets = 5;

		System.out.println("Enter how many litres number(int);");
		firstNumber = scanner.nextInt();
		if (!((firstNumber >= 10) && (firstNumber < 9999))) {
			System.out.println("Number needs to be between 10 and 9999");
		}

		remainder = firstNumber % allBuckets;
		closestToNumber = firstNumber - remainder;
		
		System.out.println(closestToNumber / allBuckets + " * 2 litres ");
		System.out.println(closestToNumber / allBuckets + " * 3 litres ");
		if ((remainder & 1) == 0) {
			System.out.println("plus " + remainder + " litres with " + (remainder / 2) + " bucket.(2 litres)");
		} else {
			if ((remainder % 3) == 0) {
				System.out.println("plus " + remainder + " litres with one bucket(3 litres)");
			} else {
				System.out.println("plus " + remainder + " by hands cuz we dont have bucket with this size.");
			}
		}

	}
}
