package Willispd_Assignment07;
/**
 * Assignment 07
 * 34-IT-2045C: Computer Programming II
 * Spring semester 2018
 * This Program will compute a set of equations from the words.text file.
 * @author Willispd
 * Due 3/21/2018
 * this class will calculate the most common letter.
 */
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

/**
 * @line is an empty string that will be use to print a value
 */
public class MostCommonLetter {
	public String CommonLetter;

	String CommonLetter() throws FileNotFoundException {

		String line = "";
		Scanner TextDoc = new Scanner(new FileReader("C:\\Users\\Patrick Willison\\Desktop\\words.txt"));
		// scanner reads the whole document
		while (TextDoc.hasNextLine()) {
			line = TextDoc.nextLine();
			int LetterCap = 0;
			// it will increment by 1
			for (int i = 0; i < line.length(); i++) {
				if (line.charAt(i) >= 'a' && line.charAt(i) <= 'z') {
					LetterCap++;

				}

			}

		}
		return CommonLetter = line;
	}

}
