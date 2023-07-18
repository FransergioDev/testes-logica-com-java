import java.util.ArrayList;
import java.util.Scanner;

public class QuartoDesafio {
	public static void main(String[] args) {
		ArrayList<String> phrases = new ArrayList<String>();
		Scanner reader = new Scanner(System.in);
		int n = reader.nextInt();
		for (int i = 0; i < n; i++) {
			String phrase = readLine(reader);
			if (phrase.length() > 2 && phrase.length() < 100) {
				StringBuilder part1 = new StringBuilder(phrase.substring(0, phrase.length() / 2));
				StringBuilder part2 = new StringBuilder(phrase.substring(phrase.length() / 2, phrase.length()));
				part1.reverse();
				part2.reverse();
				phrases.add(part1.toString() + part2.toString());
			} else System.err.println("Frase inválida");
		}

		System.out.println("\n");
		phrases.forEach(System.out::println);
	}
	
	public static String readLine(Scanner reader) {
		String line = reader.nextLine();
		while (line.isEmpty()) line = reader.nextLine();
		return line;
	}
}