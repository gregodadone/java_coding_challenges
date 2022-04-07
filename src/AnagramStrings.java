import java.util.Arrays;
import java.util.Scanner;

public class AnagramStrings {
    // Complexity depends on the sort function
    // More info https://www.baeldung.com/arrays-sortobject-vs-sortint
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter two strings");
        String string1 = scanner.nextLine();
        String string2 = scanner.nextLine();

        char[] chars1 = string1.toCharArray();
        char[] chars2 = string2.toCharArray();
        Arrays.sort(chars1);
        Arrays.sort(chars2);

        if (Arrays.equals(chars1, chars2)) {
            System.out.println("Strings are anagrams");
        } else {
            System.out.println("Strings are not anagrams");
        }
    }
}
