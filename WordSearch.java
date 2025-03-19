import java.util.Scanner;

public class WordSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Get the number of words
        System.out.print("Enter the number of words in the array: ");
        int size = sc.nextInt();
        sc.nextLine(); // Consume the newline left after nextInt()

        String[] words = new String[size]; // Create an array to store the words

        // Input words
        System.out.println("Enter the words:");
        for (int i = 0; i < size; i++) {
            words[i] = sc.nextLine(); // Use nextLine() to capture full words
        }

        // Get the search word
        System.out.print("Enter a word to search: ");
        String searchWord = sc.nextLine();

        // Search logic
        boolean found = false;
        for (String word : words) {
            if (word.equals(searchWord)) { // Change to equalsIgnoreCase() for case-insensitive search
                found = true;
                break;
            }
        }

        // Output result
        if (found) {
            System.out.println("The word '" + searchWord + "' is found in the array.");
        } else {
            System.out.println("The word '" + searchWord + "' is not found in the array.");
        }

        // Close scanner
        sc.close();
    }
}

