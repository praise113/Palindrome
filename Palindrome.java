import java.util.Scanner;
import java.util.ArrayList;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> wordList = new ArrayList<>();

        System.out.println("Enter words (type 'done' to finish):");
        while (true) {
            String word = scanner.nextLine();
            if (word.equalsIgnoreCase("done")) {
                break;
            }
            wordList.add(word);
        }

        String[] words = wordList.toArray(new String[0]);

        for (String word : words) {
            char[] wordArray = word.toCharArray();
            boolean isPalindrome = true;

            for (int i = 0; i < wordArray.length / 2; i++) {
                if (wordArray[i] != wordArray[wordArray.length - 1 - i]) {
                    isPalindrome = false;
                    break;
                }
            }

            if (isPalindrome) {
                System.out.println("The word \"" + word + "\" is a palindrome.");
            } else {
                System.out.println("The word \"" + word + "\" is not a palindrome.");
            }
        }
        scanner.close();
    }
}
