package practiceTV;

import java.util.HashMap;
import java.util.Map;

public class PrintMinCharacterCount {
    public static void main(String[] args) {
        String word = "ccccdadcdaad";

        HashMap<Character, Integer> hashMap = new HashMap();

        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if (hashMap.containsKey(c)) {
                hashMap.put(c, hashMap.getOrDefault(c, 1) + 1);
            } else {
                hashMap.put(c, 1);
            }
        }

        int minOccurance = 0;
        Character minChar = null;

        for (Map.Entry<Character, Integer> entry : hashMap.entrySet()) {
            Character currentCharacter = entry.getKey();
            Integer currentOccurrence = entry.getValue();

            if (currentOccurrence > minOccurance) {
                minOccurance = currentOccurrence;
                minChar = currentCharacter;
            }
        }
        System.out.println(minChar + " " + minOccurance);
    }
}
