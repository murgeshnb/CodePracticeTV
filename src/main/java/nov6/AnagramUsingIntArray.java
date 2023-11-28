package nov6;

import java.util.Arrays;

public class AnagramUsingIntArray {
    public static void main(String[] args) {
        String word1 = "silent";
        String word2 = "listen";

        if(areWordsAnagrams(word1, word2)){
            System.out.println("anagrams");
        }else {
            System.out.println("not anagrams");
        }
    }

    private static boolean areWordsAnagrams(String word1, String word2) {
        if (word1.length() != word2.length()){
            return false;
        }

        int[] int1 = new int[26];
        int[] int2 = new int[26];

        for (char ch : word1.toCharArray()){        //toCharArray - O(n)
            int1[ch - 'a']++;
        }
                                                    // Time - O(n)
        for (char ch : word2.toCharArray()){        // space- O(26) -> O(1)
            int2[ch-'a']++;
        }

        return Arrays.equals(int1, int2);
    }

//    private static boolean areWordsAnagrams(String word1, String word2) {
//        if(word1.length() != word2.length()){           // O(1)
//            return false;
//        }
//
//        char[] charArray1 = word1.toCharArray();        // O(n)
//        char[] charArray2 = word2.toCharArray();
//
//        Arrays.sort(charArray1);                        // O(nlogn) Time
//        Arrays.sort(charArray2);
//
//        return Arrays.equals(charArray1, charArray2);
//    }
}

//Time - O(nlogn)
//Space - O(n) -> toCharArray depends on size of string i.e. n


