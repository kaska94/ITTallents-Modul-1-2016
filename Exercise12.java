import java.util.Scanner;

public class Exercise12 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int day, month, year, remainder, monthCap;
		int firstDayOfTheMonth = 1, firstMonthOfTheYear = 1;
		boolean isLeapYear = false;

		System.out.println("Enter day number: (int)");
		day = scanner.nextInt();

		System.out.println("Enter month number: (int)");
		month = scanner.nextInt();

		System.out.println("Enter year number: (int)");
		year = scanner.nextInt();

		// days in century left e.g 1934 => remainder = 34
		remainder = year % 100;

		// No 0 year
		if (year == 0) {
			System.out.println("Year cant be 0");
			return;
		}
		// checks for leapYear
		if (((year % 400) == 0)) {
			System.out.println("Leap Year");
			isLeapYear = true;
		} else if ((year % 4) == 0 && (remainder != 0)) {
			System.out.println("Leap Year");
			isLeapYear = true;
		} else {
			System.out.println("Normal Year");
			isLeapYear = false;
		}

		/*
		 * if month == 1, 3, 5, 7, 8, 12 if one of these => daycap = 31. Check
		 * for New Year and New Month, if month = 4, 6 ,9, 11 if one of these =>
		 * daycap = 30. Check for New month 2 => LeapYear daycap = 29 =>
		 * NormalYear daycap = 28
		 */
		// Sorry for multiple ifs

		if ((month >= 1) && (month <= 12)) {
			if ((month == 1) || (month == 3) || (month == 5) || (month == 7) || (month == 8) || (month == 10)
					|| (month == 12)) {
				if ((day >= 1) && day <= 31) {
					monthCap = 31; // Cap of the mount. it changes depending of
									// month
					day = day + 1; // Next day

					if ((day > monthCap) && (month == 12)) {
						System.out.println(firstDayOfTheMonth + " , " + firstMonthOfTheYear + " , " + (year + 1));
					} else {
						if ((day) > monthCap) {
							System.out.println(firstDayOfTheMonth + " , " + (month + 1) + " , " + year);
						} else {
							System.out.println(day + " , " + month + " , " + year);
						}
					}

				} else {
					System.out.println("Days must be between 1 and 31 in " + month + " month!");
					return;
				}
			} else if ((month == 4) || (month == 6) || (month == 9) || (month == 11)) {
				if ((day >= 1) && day <= 30) {
					monthCap = 30; // Cap of the mount. it changes depending of
									// month
					day = day + 1; // Next day

					if ((day) > monthCap) {
						System.out.println(firstDayOfTheMonth + " , " + (month + 1) + " , " + year);
					} else {
						System.out.println(day + " , " + month + " , " + year);
					}

				} else {
					System.out.println("Days must be between 1 and 30 " + month + " month!");
				}

			} else if ((month == 2)) {
				if ((isLeapYear) == true) {
					if ((day >= 1) && day <= 29) {
						monthCap = 29; // Cap of the mount. it changes depending
										// of
										// month
						day = day + 1; // Next day

						if ((day) > monthCap) {
							System.out.println(firstDayOfTheMonth + " , " + (month + 1) + " , " + year);
						} else {
							System.out.println(day + " , " + month + " , " + year);
						}
					} else {
						System.out.println("Days must be between 1 and 29 " + month + " month," + year);
					}
				} else if ((isLeapYear) == false) {
					if ((day >= 1) && day <= 28) {
						monthCap = 28; // Cap of the mount. it changes depending
										// of
										// month
						day = day + 1; // Next day

						if ((day) > monthCap) {
							System.out.println(firstDayOfTheMonth + " , " + (month + 1) + " , " + year);
						} else {
							System.out.println(day + " , " + month + " , " + year);
						}
					} else {
						System.out.println("Days must be between 1 and 28 " + month + " month!" + year);
					}
				}
			}
		} else {
			System.out.println("Months must be between 1 - 12");
		}

	}

}
