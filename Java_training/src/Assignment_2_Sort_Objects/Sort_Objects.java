package Assignment_2_Sort_Objects;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Sort_Objects {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Handling Wrong format
		boolean validInput = false;
		while (!validInput) {
			System.out.print("Enter the date time string (format: dd/MM/yyyy HH:mm): ");
			String userInput = scanner.nextLine();
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

			try {
				LocalDateTime localDateTime = LocalDateTime.parse(userInput, formatter);

				// DT -- Date_Time
				// Add one day
				LocalDateTime DT1 = localDateTime.plusDays(1);
				System.out.println("After adding one day: " + DT1.format(formatter));

				// Subtract 10 days
				LocalDateTime DT2 = localDateTime.minusDays(10);
				System.out.println("After subtracting 10 days: " + DT2.format(formatter));

				// Add 1 hour
				LocalDateTime DT3 = localDateTime.plusHours(1);
				System.out.println("After adding 1 hour: " + DT3.format(formatter));

				// Subtract 5 hours and 30 minutes
				LocalDateTime DT4 = localDateTime.minusHours(5).minusMinutes(30);
				System.out.println("After subtracting 5 hours and 30 minutes: " + DT4.format(formatter));

				// Sorting objects using Timestamp/Date
				List<LocalDateTime> dateList = new ArrayList<>();
				dateList.add(DT1);
				dateList.add(DT2);
				dateList.add(DT3);
				dateList.add(DT4);

				dateList.sort(Comparator.naturalOrder());

				System.out.println("\nSorted Dates:");
				for (LocalDateTime date : dateList) {
					System.out.println(date.format(formatter));
				}
				validInput = true;
			} catch (Exception e) {
				System.out.println("Invalid date time format !");
			}
		}
		scanner.close();

	}
}
