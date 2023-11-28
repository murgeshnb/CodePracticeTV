package practiceTV;

import java.util.HashMap;

public class CheckAnagramUsingMap {
    public static void main(String[] args) {
        String word1 = "silent";
        String word2 = "listen";

        if (areAnagrams(word1, word2) == true) {
            System.out.println("anagrams");
        } else {
            System.out.println("not anagrams");
        }
    }

    private static boolean areAnagrams(String word1, String word2) {
        if (word1.length() != word2.length()) {
            return false;
        }

        char[] charArray1 = word1.toCharArray();
        char[] charArray2 = word2.toCharArray();

        HashMap<Character, Integer> map = new HashMap<>();

        for (char ch : charArray1) {
            if (map.containsKey(ch)) {
                map.put(ch, map.getOrDefault(ch, 0) + 1);
            } else {
                map.put(ch, 1);
            }
        }

        for (char ch:charArray2){
            if(map.containsKey(ch) && map.get(ch)>0){
                map.put(ch, map.get(ch)-1);
            }else {
                return false;
            }
        }

        return true;

    }


}


