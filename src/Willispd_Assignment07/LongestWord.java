package Willispd_Assignment07;
/**
 * Assignment 07
 * 34-IT-2045C: Computer Programming II
 * Spring semester 2018
 * This Program will compute a set of equations from the words.text file.
 * @author Willispd
 * Due 3/21/2018
 * this class will calculate the longest word.
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class LongestWord {
	public String longer;

	/**
	 * 
	 * @return- this return value will return the public String
	 *          Longer=longestLine
	 * @throws FileNotFoundException
	 */
	String Long() throws FileNotFoundException {

		Scanner WordFile = new Scanner(new File("C:\\Users\\Patrick Willison\\Desktop\\words.txt"));
		{
			int MaxChar = 0;
			String LongestLine = "";
			while (WordFile.hasNextLine()) {
				String Line = WordFile.nextLine();

				if (MaxChar < Line.length()) {
					MaxChar = Line.length();
					LongestLine = Line;
				}

			}
			return longer = LongestLine;
		}

	}

}
