package dailyConnectAssignment;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Sdet_HW_Sep15_Notepad {

	public static void main(String[] args) throws FileNotFoundException {
		File file = new File("E:/marivv.txt");
		Scanner scanner = new Scanner(file);
		String sentenceEndingPunctuation = "[.!?]";
		scanner.useDelimiter(sentenceEndingPunctuation);
		while (scanner.hasNext()) {
			String sentence = scanner.next().trim();
			System.out.println(sentence);
			System.out.println("-----------------------------");
		}
		scanner.close();
	}
}
