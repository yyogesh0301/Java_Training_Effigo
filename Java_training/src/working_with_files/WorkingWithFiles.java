package working_with_files;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Paths;

public class WorkingWithFiles {
	public static void main(String[] args) {

		String inputfilePath = "src/working_with_files/input.txt";
		File inputFile = Paths.get(inputfilePath).toFile();
		String outputfilePath = "src/working_with_files/output.txt";
		File outputFile = Paths.get(outputfilePath).toFile();

		try (FileInputStream fileInputStream = new FileInputStream(inputFile)) {
			// Create a byte array to store read data
			byte[] data = new byte[fileInputStream.available()];

			// Read data from the file into the byte array
			fileInputStream.read(data);

			// Print the contents read from the file
			System.out.println("Contents of input file:");
			System.out.println(new String(data));

		} catch (IOException e) {
			System.err.println("Error reading from the file: " + e.getMessage());
		}

		try (FileOutputStream fileOutputStream = new FileOutputStream(outputFile)) {

			// Sample data to write to the file
			String outputData = "Test Data to be written in output file!";

			// Convert the string to bytes and write to the file
			fileOutputStream.write(outputData.getBytes());

			System.out.println("\nData written to output file");

		} catch (IOException e) {
			System.err.println("Error writing to the file: " + e.getMessage());
		}
	}
}
