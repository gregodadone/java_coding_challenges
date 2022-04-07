import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class PhoneToWordList {
    public static void main(String[] args) {
        Set<String> dictionary = Set.of("hola", "mundo", "como", "estas");
        Map<Character, List<Character>> mapping = new HashMap<>();
        mapping.put('0', Collections.emptyList());
        mapping.put('1', Collections.emptyList());
        mapping.put('2', Arrays.asList('a', 'b', 'c'));
        mapping.put('3', Arrays.asList('d', 'e', 'f'));
        mapping.put('4', Arrays.asList('g', 'h', 'i'));
        mapping.put('5', Arrays.asList('j', 'k', 'l'));
        mapping.put('6', Arrays.asList('m', 'n', 'o'));
        mapping.put('7', Arrays.asList('p', 'q', 'r', 's'));
        mapping.put('8', Arrays.asList('t', 'u', 'v'));
        mapping.put('9', Arrays.asList('w', 'x', 'y', 'z'));

        String number = "4652";
        for (int i = 0; i < number.length(); i++) {
            Character character = number.charAt(i);
            List<Character> characters = mapping.get(character);

            StringBuilder sb = new StringBuilder();
            List<String> words = new ArrayList<>();
            for (Character c : characters) {
                sb.append(c);

            }

        }


    }
}
