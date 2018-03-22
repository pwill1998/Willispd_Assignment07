package Willispd_Assignment07;
/**
 * Assignment 07
 * 34-IT-2045C: Computer Programming II
 * Spring semester 2018
 * This Program will compute a set of equations from the words.text file.
 * @author Willispd
 * Due 3/21/2018
 * this class will calculate the average word length for each line.
 */
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class AverageWordLength {
	public String Average;

	public String AverageWordLength() throws IOException {

		Scanner TextDoc = new Scanner(new File("C:\\Users\\Patrick Willison\\Desktop\\words.txt"));
		// counts letters in the program
		String Letters = TextDoc.toString();
		TextDoc.nextLine();

		for (int i = 0; i < Letters.length(); i++);
		{
			int sum = 0;
			int count = 0;
			int CurrentWordLength;
			Scanner split = new Scanner(TextDoc.nextLine());
			while (split.hasNextInt()) {
				sum += split.nextInt();
				count++;
			}
		}
		return Average = Letters;
	}

}