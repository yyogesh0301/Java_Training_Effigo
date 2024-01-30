package Assignment_1_Date_Conversion;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Date_Conversion {
    public static void main(String[] args) {
    	
        Scanner scanner = new Scanner(System.in);
        boolean validInput=false;
		while (!validInput) {
			// User Input
			System.out.print("Enter the date time string (format: dd/MM/yyyy HH:mm): \n");
			String userInput = scanner.nextLine();

			try {
				// input format
				DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

				// Parsing user input to LocalDateTime
				LocalDateTime localDateTime = LocalDateTime.parse(userInput, formatter);

				// Local time to Unix timestamp
				long unixTimestamp = localDateTime.atZone(ZoneId.of("Asia/Kolkata")).toEpochSecond();
				System.out.println("Unix Timestamp: " + unixTimestamp);

				// Local time to UTC
				ZonedDateTime utcDateTime = localDateTime.atZone(ZoneId.of("Asia/Kolkata"))
						.withZoneSameInstant(ZoneId.of("UTC"));
				System.out.println("UTC: " + utcDateTime.format(formatter));

				// UTC to local time (IST)
				ZonedDateTime istDateTime = utcDateTime.withZoneSameInstant(ZoneId.of("Asia/Kolkata"));
				System.out.println("Local timestamp (IST): " + istDateTime.format(formatter));
				validInput=true;
			} catch (Exception e) {
				// exception handling if user input is wrong format
				System.out.println("Invalid input format !");
			}
		}
        
        scanner.close();
    }}