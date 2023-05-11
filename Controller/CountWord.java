package Controller;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.StringTokenizer;

public class CountWord {
    Scanner scanner = new Scanner(System.in);

    public void run() {

        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();
        String delimiter = " ,!";

        StringTokenizer tokenizer = new StringTokenizer(inputString, delimiter);

        Map<String, Integer> wordCount = new HashMap<>();
        Map<Character, Integer> charCount = new HashMap<>();

        while (tokenizer.hasMoreTokens()) {
            String word = tokenizer.nextToken();
            if (wordCount.containsKey(word)) {
                int count = wordCount.get(word);
                wordCount.put(word, count + 1);
            } else {
                wordCount.put(word, 1);
            }
        }

        for (char c : inputString.toCharArray()) {
            if (Character.isLetter(c)) {
                if (charCount.containsKey(c)) {
                    int count = charCount.get(c);
                    charCount.put(c, count + 1);
                } else {
                    charCount.put(c, 1);
                }
            }
        }

        System.out.println(wordCount);
        System.out.println(charCount);
    }
}
