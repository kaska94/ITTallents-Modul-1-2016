import java.util.Scanner;

public class Exercise7 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int hourInDay;
		double sumOfMoney = 0;
		boolean isHealthy = false;

		System.out.println("Enter the time (the hour)(int):");
		hourInDay = scanner.nextInt();

		if ((hourInDay >= 0) && (hourInDay <= 24)) {
			System.out.println("How much money do you have?");
			sumOfMoney = scanner.nextDouble();
			if (sumOfMoney > 0) {
				System.out.println("Are you healthy?");
				isHealthy = scanner.nextBoolean();
			} else {
				System.out.println("Money must be above zero");
			}
		} else {
			System.out.println("Hours are between 0 and 24");
			return;
		}

		if (isHealthy == false) {
			System.out.println("I am not going out with friends.");
			if (sumOfMoney > 0) {
				System.out.println("I am going to buy medicine.");
			} else {
				System.out.println("I am going to drink tea.");
			}
		} else {
			if (sumOfMoney > 10) {
				System.out.println("I am going with friends to the cinema");
			} else {
				if (sumOfMoney < 10) {
					System.out.println("I am going with friends to the coffe");
				}
			}
		}
	}

}
