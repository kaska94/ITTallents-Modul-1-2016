import java.util.Scanner;

public class Exercise13 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int temperature;

		System.out.println("Enter Temperature number: (whole number between -100 and 100)");
		temperature = scanner.nextInt();
		if (!((temperature >= -100) && (temperature <= 100))) {
			System.out.println("Temperature must be between -100 and 100");
			return;
		}
		if (temperature <= -20) {
			System.out.println("Rly cold!");
		} else if ((temperature > -20) && (temperature <= 0)) {
			System.out.println("Kinda cold, man!");
		} else if ((temperature > 0) && (temperature <= 15)) {
			System.out.println("It's chilly, man!");
		} else if ((temperature > 15) && (temperature <= 25)) {
			System.out.println("It's warm! Go outside!");
		} else if (temperature > 25) {
			System.out.println("It's too hot, man! You will melt outside!");
		}
	}

}
