package _02String._02StringMethods;

public class Main {
    public static void main(String[] args) {
        // String length
        String text = "Gracias!";
        System.out.println(text.length());

        // String concatenation
        String first = "Goodnight, ";
        String second = "Jimmy";
        System.out.println(first.concat(second));

        // String comparison
        System.out.println(text.equals("Gracias!"));
        System.out.println(text.equalsIgnoreCase("gracias!"));
        System.out.println(text.compareTo("Hola!"));

        // Check if a string is blank or empty

        // Return the character at a specific index

        // Check if a string contains a specific character or substring

        // Check if a string starts with or ends with a specific character or substring

        // containEquals

        // regionMatches

        // Return the index of the first occurrence of the character or substring

        // Return the index of the last occurrence of the character or substring

        // Replace a specific character in a string

        // Substring replacement
        String newText = "Welcome to the World of Java!";
        String replaced = newText.replace("World", "Golang");
        System.out.println(replaced);

        // Replace all occurrences of a character or substring

        // Trim leading and trailing spaces

        // Format to upper or lower case
        String phrase = "You son of a bear!";
        System.out.println(phrase.toUpperCase());
        System.out.println(phrase.toLowerCase());

        // Split a string into an array of substrings
        String[] words = newText.split(" ");
        for (String word : words) {
            System.out.println(word + '|');
        }

        // Turn a string into an array of characters
        char[] chars = newText.toCharArray();
        for (char c : chars) {
            System.out.print(c + ' ');
        }



    }
}
