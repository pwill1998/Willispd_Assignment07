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

public class leastCommonletter {
	public String LeastCom;
/**
 * 
 * @return the least common letter
 * @throws FileNotFoundException
 */
	String leastCommonletter() throws FileNotFoundException {
		// Scanner reads the whole doc
		String line = "";
		Scanner TextDoc = new Scanner(new FileReader("C:\\Users\\Patrick Willison\\Desktop\\words.txt"));

		while (TextDoc.hasNextLine()) {
			line = TextDoc.nextLine();
			int LetterCap = 0;
			// for as long as i is less than the length of the Text Doc it will
			// increment by 1
			for (int in = 1; in < line.length(); in++) {
				if (line.charAt(in) >= 'a' && line.charAt(in) <= 'z') {

					LetterCap++;
				}
			}
		}
		return LeastCom = leastCommonletter();
	}
}