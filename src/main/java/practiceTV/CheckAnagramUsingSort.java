package practiceTV;

import java.util.Arrays;

public class CheckAnagramUsingSort {
    public static void main(String[] args) {
        String word1 = "silent";
        String word2 = "listen";

        if (areAnagrams(word1, word2) == true) {
            System.out.println("anagrams");
        } else {
            System.out.println("not anagrams");
        }
    }

    public static boolean areAnagrams(String word1, String word2) {
        if (word1.length() != word2.length()) {         // O(1)
            return false;
        }

        char[] charArray1 = word1.toCharArray();        // O(n)
        char[] charArray2 = word2.toCharArray();

        Arrays.sort(charArray1);                        // O(nlogn)
        Arrays.sort(charArray2);

        return Arrays.equals(charArray1, charArray2);

    }
}

// Time
// length comparison -> O(1) - constant
// toCharArray -> depends on input O(n)
// sort -> O(nlogn)

//Space
// O(n)