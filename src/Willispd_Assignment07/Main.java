package Willispd_Assignment07;

/**
 * Assignment 07
 * 34-IT-2045C: Computer Programming II
 * Spring semester 2018
 * This Program will compute a set of equations from the words.text file.
 * @author Willispd
 * Due 3/21/2018
 */
import java.io.IOException;
public class Main {

	public static void main(String[] args) throws IOException {
		// the longest word class does compile and correctly display the longest
		// word in the file
		LongestWord LongWord = new LongestWord();
		System.out.println("The longest word in the text file is " + LongWord.Long());
		// the most common letter should be z, but the code does not format
		// correctly
		MostCommonLetter CommonLetter = new MostCommonLetter();
		System.out.println("The most common letter in the text file is " + CommonLetter.CommonLetter());
		// the average word length does not display correctly
		AverageWordLength AvgWordLength = new AverageWordLength();
		System.out.println("the average length of a word from the text file is " + AvgWordLength.AverageWordLength());
		// the least common letter does not display
		leastCommonletter LeastLetter = new leastCommonletter();
		System.out.println("the least common letter from the text file is" + LeastLetter.leastCommonletter());
	}

}