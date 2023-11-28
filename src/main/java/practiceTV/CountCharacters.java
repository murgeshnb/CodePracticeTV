package practiceTV;

import java.util.TreeSet;

public class CountCharacters {
    public static void main(String[] args) {
        String word = "AABCCA";
//        usingSet(word);
//        stringAppend(word);
        tryStringAppend(word);
    }

    private static void usingSet(String word) {
        TreeSet<Character> set = new TreeSet();

        for (char d : word.toCharArray()) {
            set.add(d);                         // O(logn)
        }

        for (char c : set) {                    // O(n^2)
            int count = 0;
            for (int i = 0; i < word.length(); i++) {
                if (c == word.charAt(i)) {
                    count++;
                }
            }
            System.out.println(c + " " + count);
        }
    }

    private static void tryStringAppend(String word) {
        String out = "";
        int count = 1;

        for (int i = 0; i < word.length() - 1; i++) {
            if (word.charAt(i) == word.charAt(i + 1)) {
                count++;
            } else {
                out = out + word.charAt(i) + count;
                count = 1;
            }
        }

        System.out.print(out);
        System.out.println("");
        System.out.println(out + word.charAt(word.length() - 1) + count);
    }
}

/*public static void distinct(){
        String input = "AABBBCCCC";
        StringBuilder result = new StringBuilder();
        int count = 1;

        for (int i = 0; i < input.length(); i++) {
            if (i + 1 < input.length() && input.charAt(i) == input.charAt(i + 1)) {
                count++;
            } else {
                result.append(input.charAt(i)).append(count);
                count = 1;
            }
        }

        System.out.println(result.toString());
    }
 */
