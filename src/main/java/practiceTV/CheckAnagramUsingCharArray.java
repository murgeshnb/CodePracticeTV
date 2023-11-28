package practiceTV;

import java.util.Arrays;

public class CheckAnagramUsingCharArray {
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
        if (word1.length() != word2.length()) { //O(1)
            return false;
        }

        int[] charArray1 = new int[26];
        int[] charArray2 = new int[26];

        for (char c: word1.toCharArray()){      // O(n)
            charArray1[c - 'a']++;
        }

        for (char c: word2.toCharArray()){      //O(n)
            charArray2[c - 'a']++;
        }

        return Arrays.equals(charArray1, charArray2);
    }

}