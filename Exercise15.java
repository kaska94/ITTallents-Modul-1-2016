import java.util.Scanner;

public class Exercise15 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int hour;

		System.out.println("Enter Hour");
		hour = scanner.nextInt();

		if (!((hour >= 0) && (hour <= 24))) {
			System.out.println("Hour must be between 0 and 24");
			return;
		}

		if (((hour >= 18) && (hour <= 24)) || ((hour >= 0) && (hour <= 4))) {
			System.out.println("Good night");
		}
		if ((hour >= 4) && (hour <= 9)) {
			System.out.println("Good morning");
		}
		if ((hour >= 9) && (hour <= 18)) {
			System.out.println("Good Day");
		}
	}

}
